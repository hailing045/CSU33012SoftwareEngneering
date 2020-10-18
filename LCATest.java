package sweng;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class LCATest {

	@Test
	public void findLCA() {
	//create a tree
		LCA tree = new LCA(); 
	//when tree is empty
		int lca0 = tree.findLCA(4,5);
		assertEquals(-1, lca0);
	//when tree has value
	/*			1
	 *'		   / \
	 * 	      2   3
	 * 		 /\   /\
	 *      4  5 6  7
	 * 
	 * */
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7); 

		int lca1 = tree.findLCA(4,5);
		assertEquals(2, lca1);
		int lca2 = tree.findLCA(4,7);
		assertEquals(1, lca2);
		
	}

}
