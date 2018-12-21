package data_structure.trees;

import sun.reflect.generics.tree.Tree;

public class BinarySearchTree {

  private TreeNode root = null;

    private void insert(int data) {

        TreeNode node = new TreeNode(data);

        if(root == null){
            root = node;
            return;
        }

        TreeNode tempNode = root;

        while (true){

            // preventing duplicates value
            if(tempNode.data == data){
                return;
            }

            if(data < tempNode.data ){

                if(tempNode.leftChild == null){

                    tempNode.leftChild = node;
                    return;

                }else {

                    tempNode = tempNode.leftChild;
                }

            }
            else {

                if( tempNode.rightChild == null ){

                    tempNode.rightChild = node;
                    return;

                }else {

                    tempNode = tempNode.rightChild;
                }
            }
        }
    }


    // INORDER TRAVERSAL => (LEFT, ROOT, RIGHT)
    private void inOrderTraversal(TreeNode node) {

        if( node!= null ){

            inOrderTraversal(node.leftChild);

            System.out.print(node.data + ", ");

            inOrderTraversal(node.rightChild);

        }
    }


    //  PREORDER TRAVERSAL => (Root, Left, Right)
    private void preOrderTraversal(TreeNode node) {

        if( node!= null ){

            System.out.print(node.data + ", ");

            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);

        }
    }

    //  POSTORDER TRAVERSAL (Left, Right, Root)
    private void postOrderTraversal(TreeNode node) {

        if( node!= null ){

            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.print(node.data + ", ");

        }
    }



    public static void main(String[] args){

      BinarySearchTree tree = new BinarySearchTree();
      tree.insert(50);
      tree.insert(80);
      tree.insert(40);
      tree.insert(32);
      tree.insert(85);
      tree.insert(45);
      tree.insert(70);
      tree.insert(71);
      tree.insert(73);
      tree.insert(75);
      tree.insert(74);
      tree.insert(78);

      tree.inOrderTraversal(tree.root);
      System.out.println();

      tree.preOrderTraversal(tree.root);
      System.out.println();

      tree.postOrderTraversal(tree.root);
      tree.secondLargestElement(tree.root);

  }

    private void secondLargestElement(TreeNode root) {

        TreeNode temp = root;
        int count = 0;

        while (temp.rightChild!=null){

            temp = temp.rightChild ;
            count++;

        }

        temp = root;

        for(int i=0; i< count-1 ;i++){

            temp = temp.rightChild;

        }

        System.out.println("Second Largest : " + temp.data );


    }

}
