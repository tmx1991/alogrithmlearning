package com.companiestests;

import com.companiestests.basefunctions.BSTreeNode;

/**
 * Created by ttt on 2016/4/18.
 */
public class treeToList {
    public static void main(String[] args) {

        treeToList ttl = new treeToList();


        BSTreeNode bt1 = new BSTreeNode(10);

        bt1.left = new BSTreeNode(6);
        bt1.right = new BSTreeNode(14);

        bt1.left.left = new BSTreeNode(4);
        bt1.left.right = new BSTreeNode(8);

        bt1.right.left = new BSTreeNode(12);
        bt1.right.right = new BSTreeNode(16);

        BSTreeNode bt2 = bt1.left.left;
//        while(bt2!=null)
//        {
//            System.out.println(bt2.val);
//            bt2 = bt2.left;
//        }
//        ttl.treeToList(bt1, 1);
//
//        while (bt2 != null)
//        {
//            System.out.println(bt2.val);
//            bt2 = bt2.right;
//        }
//        bt2 =  ttl.treeToList(bt1);
//
//        while (bt2 != null)
//        {
//            System.out.println(bt2.val);
//            bt2 = bt2.left;
//        }






    }

    /**
     * 通过返回左右两边的结点来形成双向链表
     * @param root
     * @param status =1是返回最大的值，=2返回最小的值
     * @return
     */
    private BSTreeNode treeToList(BSTreeNode root, int status)
    {
        if (root.left == null && root.right == null)
        {
            return root;

        } else
        {
            BSTreeNode bsl = treeToList(root.left, 1);
            BSTreeNode bsr = treeToList(root.right, 2);

            bsl.right = root;
            root.left = bsl;
            bsr.left = root;
            root.right = bsr;

            if (status == 1)
                return bsr;
            else
                return bsl;

        }
    }

    /**
     * 此法应该可行，但未有结果
     * @param root
     * @return
     */
    private BSTreeNode treeToList(BSTreeNode root)
    {
        BSTreeNode head = null, tail = null;

        helper(head, tail, root);

        return head;

    }

    private void helper(BSTreeNode head,BSTreeNode tail,BSTreeNode root)
    {
        BSTreeNode lt = null,rh = null;


        if (root == null)
        {
            head = null;
            tail = null;
            return;
        }

        helper(head, lt, root.left);
        helper(rh, tail, root.right);

        if (lt!=null) {
            lt.right = root;
            root.left = lt;
        } else {
            head = root;
        }
        if (rh!=null) {
            root.right=rh;
            rh.left = root;
        } else {
            tail = root;
        }


    }





}
