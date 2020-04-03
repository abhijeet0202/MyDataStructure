package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ConstructBinaryTreeFromArray {

	public BinaryTreeBean<Integer> constructBinaryTree(List<Integer> bstArray, BinaryTreeBean<Integer> root,
			int index) {
		if (index < bstArray.size()) {
			BinaryTreeBean<Integer> temp = new BinaryTreeBean<Integer>(bstArray.get(index));
			root = temp;

			root.leftChild = constructBinaryTree(bstArray, root.leftChild, 2 * index + 1);

			root.rightChild = constructBinaryTree(bstArray, root.rightChild, 2 * index + 2);
		}
		return root;
	}

	public static void main(String[] args) {
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

}
