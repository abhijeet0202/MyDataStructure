package BinaryTree;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestBinaryTreeMaximumPathSum {

	@Test
	public void testConstructBinaryTreeFromArray() {
		BinaryTreeBean<Integer> node = new BinaryTreeBean<Integer>(0);
		List<Integer> bstArray = new ArrayList<Integer>();
		bstArray.add(50);
		bstArray.add(25);
		bstArray.add(75);
		bstArray.add(37);
		bstArray.add(62);
		bstArray.add(84);
		bstArray.add(31);
		bstArray.add(43);
		bstArray.add(55);
		bstArray.add(92);
		System.out.println(bstArray);
		ConstructBinaryTreeFromArray myObj = new ConstructBinaryTreeFromArray();
		node = myObj.constructBinaryTree(bstArray, node, 0);
		System.out.println(node);
	}
	@Test
	public void testBinaryTreeMaximumPathSum() {
		BinaryTreeBean<Integer> node = new BinaryTreeBean<Integer>(0);
		List<Integer> bstArray = new ArrayList<Integer>();
		bstArray.add(-10);
		bstArray.add(9);
		bstArray.add(20);
		bstArray.add(null);
		bstArray.add(null);
		bstArray.add(15);
		bstArray.add(7);
		System.out.println(bstArray);
		ConstructBinaryTreeFromArray myObj = new ConstructBinaryTreeFromArray();
		node = myObj.constructBinaryTree(bstArray, node, 0);
		
		
		Assert.assertEquals(42, myObj.binaryTreeMaximumPathSum(node));
	}

}
