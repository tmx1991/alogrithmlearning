package commonalgorithms.headfirst.traversal;

import com.companiestests.basefunctions.BSTreeNode;

/**
 * Created by ttt on 2016/4/19.
 */
public class traversal {

    public static void main(String[] args) {

        BSTreeNode bt1 = new BSTreeNode(10);

        bt1.left = new BSTreeNode(6);
        bt1.right = new BSTreeNode(14);

        bt1.left.left = new BSTreeNode(4);
        bt1.left.right = new BSTreeNode(8);

        bt1.right.left = new BSTreeNode(12);
        bt1.right.right = new BSTreeNode(16);

        traversal t = new traversal();
        t.inOrderTraversal(bt1);
        System.out.println();
        t.preOrderTraversal(bt1);
        System.out.println();
        t.postOrdertraversal(bt1);
    }
    /**
     * 中序遍历
     * @param root
     */
    private void inOrderTraversal(BSTreeNode root)
    {
        if(root != null)
        {
            inOrderTraversal(root.left);

            System.out.print(root.val+"->");

            inOrderTraversal(root.right);
        }
    }

    /**
     * 先序遍历
     * @param root
     */
    private void preOrderTraversal(BSTreeNode root)
    {
        if(root!=null)
        {
            System.out.print(root.val+"->");

            preOrderTraversal(root.left);

            preOrderTraversal(root.right);
        }
    }

    private void postOrdertraversal(BSTreeNode root)
    {
        if(root!=null)
        {
            postOrdertraversal(root.left);

            postOrdertraversal(root.right);

            System.out.print(root.val+"->");
        }
    }
}
