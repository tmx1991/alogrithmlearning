package commonalgorithms.foroffers;
import com.LeeCode.basefouction.TreeNode;
/**
 * Created by ttt on 2016/5/4.
 */
public class MirrorRecursively {

    public static void main(String[] args) {
        TreeNode r = new TreeNode(5);
        r.left = new TreeNode(6);
        r.right = new TreeNode(7);

        r.left.left = new TreeNode(8);
        r.left.right = new TreeNode(9);
        r.left.right.left = new TreeNode(10);
        r.left.right.right = new TreeNode(11);

        r.right.left = new TreeNode(2);
        r.right.right = new TreeNode(3);



    }


}
