package examples;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SnowFlake extends JPanel implements ChangeListener
{
   private final static int DEPTH_DEFAULT = 4;
   private int DEPTH = 1;
    private final static int DEPTH_MAX = 12; //gets pointless over 8

    private final static double cos60 = 0.5; //value of cos(60 degrees)
    private final static double sin60 = Math.sqrt(3)*0.5;   //value of sin(60 degrees)
    private final static double value2root3over3 = Math.sqrt(3)*2/3;   //
    private boolean doLines = true;
    private boolean doDots = false;
    private boolean doBoundingRect = false;
    private int curDepth = DEPTH_DEFAULT;
    private Random rand;
    private Timer timer;
    private JSlider levelSlider;
    private DrawPanel drawPanel;

   public SnowFlake()
   {   super(new BorderLayout()); 
       rand = new Random();
       drawPanel = new DrawPanel();
       JPanel buttonPanel = new JPanel(new GridLayout(0,1));
        levelSlider = new JSlider(1, 10, 1);
        levelSlider.setMajorTickSpacing(2);
        levelSlider.setMinorTickSpacing(2);
        levelSlider.setPaintTicks(true);
        levelSlider.setPaintLabels(true);
        levelSlider.addChangeListener(this);
        buttonPanel.add(levelSlider);
        add(drawPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        
        
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               drawPanel.repaint();
            }
        });
        timer.start();
   }

    @Override
    public void stateChanged(ChangeEvent e) {
        DEPTH = levelSlider.getValue();
    }

   private class DrawPanel extends JPanel
   {    
        public DrawPanel()
        {
            setPreferredSize(new Dimension(500,500));
            setBackground (Color.BLACK);
        }
        @Override
        public void paintComponent (Graphics g)
        {
           super.paintComponent(g);
           drawSnowFlake(g);
        }
        public void drawSnowFlake(Graphics g)
        {
          drawSegment(g,new Point(100,100),new Point(400,100),DEPTH);
          drawSegment(g,new Point(100,400),new Point(100,100),DEPTH);
          drawSegment(g,new Point(400,400),new Point(100,400),DEPTH);
          drawSegment(g,new Point(400,100),new Point(400,400),DEPTH);
        }
        public void drawSegment(Graphics g, Point a, Point b, int depth)
        {    //done recursion
             if(depth==0) {
                 g.setColor(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
                 if(doLines)
                     g.drawLine(a.x,a.y, b.x,b.y);
                 if(doDots)
                     g.drawOval(a.x,a.y, 1,1);
             //compute next line parts
             } else {
                 //compute points
                 final Point distance = new Point( (b.x-a.x)/3, (b.y-a.y)/3 );
                 final Point pa = new Point( a.x+distance.x, a.y+distance.y);
                 final Point pb = new Point( b.x-distance.x, b.y-distance.y);
                 final Point pTip = new Point(pa.x + (int)(distance.x*cos60 + distance.y*sin60),pa.y + (int)(distance.y*cos60 - distance.x*sin60));
                 //draw line segments
                 final int newDepth = depth-1;
                 drawSegment(g, a,pa ,newDepth);
                 drawSegment(g, pa,pTip ,newDepth);
                 drawSegment(g, pTip,pb ,newDepth);
                 drawSegment(g, pb,b ,newDepth);
             }

         }
   }
   
   
   public static void main (String[] args)
   {
      JFrame frame = new JFrame("Koch Snow Flake");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new SnowFlake());
      frame.pack();
      // position the frame in the middle of the screen
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension screenDimension = tk.getScreenSize();
      Dimension frameDimension = frame.getSize();
      frame.setLocation((screenDimension.width-frameDimension.width)/2,
         (screenDimension.height-frameDimension.height)/2);

      frame.setVisible(true);
   }
}
