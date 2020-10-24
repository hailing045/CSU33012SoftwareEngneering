package sweng;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class LCATest {
	@Test
	public void testConstructor() {
		//Construct a node
		Node node = new Node(2);
		assertEquals(2, node.data);
		//the left and right leaf for it are null
		assertEquals(null, node.left);
		assertEquals(null, node.right);
	}
	
	@Test
	public void testfindLCA() {
	//create a tree
		LCA tree = new LCA(); 
		
	//test the false case in private method findLCAInternal
	
		//when tree is empty
	// tree is empty therefore return -1
		int lca0 = tree.findLCA(4,5);
		assertEquals(-1, lca0);
	
	//test the true case for private method findLCAInternal
	//and method findPath
		
	//when tree only has root
	/*			1
	 */		
		tree.root = new Node(1); 
		assertEquals(-1, tree.findLCA(4,5));
		assertEquals(-1, tree.findLCA(0,1));
		
	//when tree has three nodes
	/*			1
	 * 	 	   / \
	 * 	      2   3
	*/	
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3);
		
		assertEquals(-1, tree.findLCA(4,5));
		assertEquals(1, tree.findLCA(2,3));
		
	//when tree has value
	/*			1
	 *'		   / \
	 * 	      2   3
	 * 		 /\   /\
	 *      4  5 6  7
	 * */
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7); 
		
		assertEquals(-1, tree.findLCA(2,0));
		assertEquals(2, tree.findLCA(4,5));
		assertEquals(1, tree.findLCA(4,7));
		assertEquals(3, tree.findLCA(6,7));
	}

}
