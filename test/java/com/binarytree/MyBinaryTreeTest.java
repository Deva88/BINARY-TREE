package com.binarytree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyBinaryTreeTest {

    @Test
    public void given3NumbersWhenAddedToBinaryTreeShowsReturnSizeThree(){
        MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size=myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void givenNumbersWhenAddedToBinaryTreeShowsReturnSizeTrue() {
        MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size =myBinaryTree.getSize();
        Assertions.assertEquals(13, size);
    }

    @Test
    public void givenNumbersAddedToBST_WhenSearched_ShouldReturn_True() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        boolean result = myBinaryTree.search(16);
        Assertions.assertTrue(result);
    }
}