package commonalgorithms.foroffers;

import com.companiestests.basefunctions.BSTreeNode;

/**
 * Created by ttt on 2016/5/17.
 */
public class ConvertNode {

    public static void main(String[] args) {
        BSTreeNode b = new BSTreeNode(10);
        b.left = new BSTreeNode(6);
        b.left.left = new BSTreeNode(4);
        b.left.right = new BSTreeNode(8);

        b.right = new BSTreeNode(14);
        b.right.left = new BSTreeNode(12);
        b.right.right =  new BSTreeNode(16);

        ConvertNode cn = new ConvertNode();
        cn.bsttotree(b,null);
    }
    public void bsttotree(BSTreeNode root,BSTreeNode plastlist)
    {
        if(root == null) return ;

        BSTreeNode pn = root;
        if(pn.left!=null)
            bsttotree(pn.left,plastlist);

        pn.left =plastlist;
        if(plastlist!=null)
            plastlist.right = pn;

        plastlist = pn;
        if(pn.right!=null)
            bsttotree(pn.right,plastlist);


    }
}
