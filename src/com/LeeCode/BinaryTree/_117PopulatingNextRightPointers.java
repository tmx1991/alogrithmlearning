package com.LeeCode.BinaryTree;

import com.LeeCode.basefouction.TreeLinkNode;

/**
 * 二叉树添加横向指针
 * Created by ttt on 2016/4/26.
 */
public class _117PopulatingNextRightPointers {

    public static void main(String[] args) {

        _117PopulatingNextRightPointers pnrp= new _117PopulatingNextRightPointers();
        TreeLinkNode r = new TreeLinkNode(1);

        r.left = new TreeLinkNode(2);
        r.right = new TreeLinkNode(3);

        r.left.left = new TreeLinkNode(5);
        r.left.right = new TreeLinkNode(4);
        r.right.left = new TreeLinkNode(7);
        r.right.right = new TreeLinkNode(8);

        pnrp.connect(r);

        TreeLinkNode t = r.left.left;

        while(t!=null)
        {
            System.out.println(t.val);

            t= t.next;
        }
    }


    public void connect(TreeLinkNode root) {

        TreeLinkNode cur=null,prev=null,head = root;

        while(head!=null)
        {
            cur = head;
            prev = null;
            head = null;
            while(cur!=null)
            {
                if(cur.left!=null)
                {
                    if(prev!=null)
                    {
                        prev.next = cur.left;
                    }
                    else
                        head = cur.left;

                    prev = cur.left;


                }

                if(cur.right!=null)
                {
                    if(prev!=null)
                        prev.next = cur.right;
                    else
                        head = cur.right;

                    prev = cur.right;
                }

                cur = cur.next;
            }
        }


    }
}
