package sample;

/*
*   INORDER: left, node**, right
*   POSTORDER: left, right, node**
*   PREORDER:  node**, left, right
* */

import java.util.Iterator;

interface Tree<E> extends Iterable<E>{
    boolean search(E e);
    boolean insert(E e);
    boolean delete(E e);
    void inorder();
    void preorder();
    void postorder();
    int getSize();
    boolean isEmpty();
    void clear();
}

abstract class AbstractTree<E> implements Tree<E>{
    public void inorder(){}
    public void preorder(){}
    public void postorder(){}
    public boolean isEmpty(){
        return getSize() == 0;
    }
}

class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST(){}

    public BST(E[] objects){
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }



    public static void main(String[] args){
        TreeNode<Integer> root = new TreeNode<>(60);
        root.right = new TreeNode<>(45);
        root.left = new TreeNode<>(55);
        root.left.right = new TreeNode<>(102);

    }

    @Override
    public boolean search(E e) {

        /*
        * current = root
        * while curr != null
        *   if else if compareto
        *   else true
        *   rt false...
        * */
        return false;
    }

    @Override
    public boolean insert(E e) {
        return false;
    }

    @Override
    public boolean delete(E e) {

        /*
        * locate e,
        * if e is not found rt-> true
        * let curr contains e, parent,
        * if curr dont have left child
        *   connect right child of parent
        * else locate rightost,
        *   copy value right ost
        * rt -> true
        * */
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}

class TreeNode<E>{
    protected E element;
    protected TreeNode<E> right;
    protected TreeNode<E> left;

    public TreeNode(E e){
        element = e;
    }

}



