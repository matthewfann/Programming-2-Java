

package lectures;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> {
	private T data;
	private BinaryTree<T> left;
	private BinaryTree<T> right;

	//---------------------------------------------------------------------------------
	public void insertAll(ArrayList<T> elements){
		for(T t : elements)
			this.insert(t);
	}
	//---------------------------------------------------------------------------------
	public String toString(){
		return data.toString();
	}
	//---------------------------------------------------------------------------------
	public BinaryTree(T rootElement){
		if(rootElement == null) throw 
		new IllegalArgumentException("root data element cannot be null");

		this.data = rootElement;
	}
	//---------------------------------------------------------------------------------
	public BinaryTree<T> search(T element){
		if (element.compareTo(this.data) == 0)
			return this;		

		if(element.compareTo(this.data) < 0)
			if(this.left == null) 
				return null; 
			else
				return this.left.search(element);

		if(this.right == null) 
			return null; 
		else
			return this.right.search(element);

	}
	//---------------------------------------------------------------------------------
	public BinaryTree<T> insert(T element){		
		//do not add duplicates to the tree. return the existing element.
		if (element.compareTo(this.data) == 0)
			return this;		

		//add the element to the left of this node
		if(element.compareTo(this.data) < 0){
			if(this.left == null){
				this.left = new BinaryTree<T>(element);
				return this.left;
			}
			return this.left.insert(element);
		}

		//add the element to the right of this node
		if(this.right == null){
			this.right = new BinaryTree<T>(element);
			return this.right;
		}
		return this.right.insert(element);
	}



}
