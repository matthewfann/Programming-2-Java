package examples;

/**
   A class that demonstrates how recursion is used in computer graphics
   to generate a tree fractal
   @author Seth Hall
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class FractalTree extends JPanel implements ChangeListener
{

   private  double BRANCH_ANGLE = Math.PI/6; // angle of branches
   private  double BRANCH_FACTOR = 0.7; // must be less than 1
   private  double HEIGHT_FACTOR = 0.3;
   private final double MIN_LENGTH = 1.0; // smallest length branch
   private Random rand;
   private Timer timer;
    private JSlider branchAngleSlider, branchFactorSlider, heightFactorSlider;
   private DrawPanel drawPanel;
   
   
   public FractalTree()
   {  super(new BorderLayout()); 
       drawPanel = new DrawPanel();
       JPanel buttonPanel = new JPanel(new GridLayout(1,0));
        branchAngleSlider = new JSlider(1, 20, 6);
        branchAngleSlider.setMajorTickSpacing(2);
        branchAngleSlider.setMinorTickSpacing(1);
        branchAngleSlider.setPaintTicks(true);
        branchAngleSlider.setPaintLabels(true);
        branchAngleSlider.addChangeListener(this);
        
        branchFactorSlider = new JSlider(1, 100, 70);
        branchFactorSlider.setMajorTickSpacing(10);
        branchFactorSlider.setMinorTickSpacing(2);
        branchFactorSlider.setPaintTicks(true);
        branchFactorSlider.setPaintLabels(true);
        branchFactorSlider.addChangeListener(this);
        
        heightFactorSlider = new JSlider(1, 100, 30);
        heightFactorSlider.setMajorTickSpacing(10);
        heightFactorSlider.setMinorTickSpacing(2);
        heightFactorSlider.setPaintTicks(true);
        heightFactorSlider.setPaintLabels(true);
        heightFactorSlider.addChangeListener(this);
        
        buttonPanel.add(branchAngleSlider);
        buttonPanel.add(branchFactorSlider);
        buttonPanel.add(heightFactorSlider);
        add(drawPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
       
      rand = new Random();
      //create timer, used to periodically repaint panel, use of Anonomous inner class below
      timer = new Timer(1000, new ActionListener() {
      
       @Override
       public void actionPerformed(ActionEvent e) {
           repaint();
       }
       });
       //timer.start();
   }
   
   

    @Override
    public void stateChanged(ChangeEvent e) 
    {  // BRANCH_ANGLE = Math.PI/6; // angle of branches
        //BRANCH_FACTOR = 0.7; // must be less than 1
       // HEIGHT_FACTOR = 0.3;
        Object source = e.getSource();
        if(source == branchAngleSlider)
        {
            BRANCH_ANGLE = Math.PI/branchAngleSlider.getValue();
        }
        if(source == branchFactorSlider)
        {
            BRANCH_FACTOR = (double)branchFactorSlider.getValue()/100.0;
        }
        if(source == heightFactorSlider)
        {
            HEIGHT_FACTOR = (double)heightFactorSlider.getValue()/100.0;
        }
        drawPanel.repaint();
    }
   
   
   
    private class DrawPanel extends JPanel
   {       private final int WIDTH = 600, HEIGHT = 500; // panel size
        public DrawPanel()
        {
            setPreferredSize(new Dimension(WIDTH,HEIGHT));
            setBackground (Color.BLACK);
        }
        public void paintComponent(Graphics g)
        {  super.paintComponent(g);
           setBackground(Color.WHITE);

           drawTree(WIDTH/2, HEIGHT, HEIGHT*HEIGHT_FACTOR, g);
        }
        // draws an upright tree
        private void drawTree(double groundX, double groundY, 
           double trunkLength, Graphics g)
        {  drawBranch(groundX, groundY, Math.PI/2, trunkLength, g);
        }
        // recursive method that draws a specified branch and
        // then calls itself to draw two smaller branches from end of branch
        private void drawBranch(double xBase, double yBase, double angle,
           double length, Graphics g)
        {  // calculate end of branch using angle in radians measured
           // anticlockwise from the right
           double xEnd = xBase + length*Math.cos(angle);
           double yEnd = yBase - length*Math.sin(angle);
           g.setColor(new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat()));
           g.drawLine((int)Math.round(xBase), (int)Math.round(yBase),
              (int)Math.round(xEnd), (int)Math.round(yEnd));
           if (length > MIN_LENGTH)
           {  // draw two smaller branches from end of this branch
              drawBranch(xEnd, yEnd, angle-BRANCH_ANGLE,
                 length*BRANCH_FACTOR, g);
              drawBranch(xEnd, yEnd, angle+BRANCH_ANGLE,
                 length*BRANCH_FACTOR, g);
           }
        }
    }
   public static void main(String[] args)
   {  JFrame frame = new JFrame("Spectalularrrrrr Tree Fractal");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new FractalTree());
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
