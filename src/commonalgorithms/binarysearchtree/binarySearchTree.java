package commonalgorithms.binarysearchtree;

import com.LeeCode.basefouction.TreeNode;

/**
 * Created by ttt on 2016/4/21.
 */
public class binarySearchTree {
    public static void main(String[] args) {

        int[] data = new int[]{2,3,4,5,6,7,1};


    }

    /**
     * 创建一二叉搜索树，创建的树并不唯一
     * @return
     */
    public TreeNode insertBST(TreeNode root,TreeNode a)
    {
      TreeNode x,y=null ;

        x = root;

        while(x!=null)
        {
            y=x;
            if(a.val<x.val)
                x = x.left;
            else
                x = x.right;
        }

        //此时的y即为插入节点的前驱结点

        if(y==null)
            root = a;
        else if(a.val<y.val)
            y.left =a;
        else
            y.right = a;

        return root;

    }
}
