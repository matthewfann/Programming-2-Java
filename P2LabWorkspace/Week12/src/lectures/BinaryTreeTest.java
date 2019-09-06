package lectures;

public class BinaryTreeTest {

	public static void main(String args[]){
		BinaryTree<Integer> tree = new BinaryTree<Integer>(5);

		tree.insert(4);
		tree.insert(3);
		tree.insert(6);
		tree.insert(2);
		
		
		
		BinaryTree<String> treeString = new BinaryTree<String>("Bob");
		treeString.insert("Alice");
		treeString.insert("Carl");
		System.out.println((treeString.search("Bob")));
		
		
		
		BinaryTree<Integer> tree1 = new BinaryTree<Integer>(5);
		tree1.insert(10);
		tree1.insert(2);
		tree1.insert(4);
		System.out.println((tree1.search(4)));
		System.out.println((tree1.search(10)));
		System.out.println((tree1.search(6)));
		
		
		
		
	}

}
