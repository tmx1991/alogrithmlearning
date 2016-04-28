package commonalgorithms.binarytree;
import com.LeeCode.basefouction.TreeNode;
import java.util.Stack;

/**
 * Created by ttt on 2016/4/28.
 */
public class binaryTree {

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();

        TreeNode r = new TreeNode(5);
        r.left = new TreeNode(6);
        r.right = new TreeNode(7);

        r.left.left = new TreeNode(8);
        r.left.right = new TreeNode(9);
        r.left.right.left = new TreeNode(10);
        r.left.right.right = new TreeNode(11);

        r.right.left = new TreeNode(2);
        r.right.right = new TreeNode(3);
        Stack<TreeNode> st = new Stack<TreeNode>();
//        System.out.println(st.peek());
        bt.postOrder(r);
    }

    /**
     * 后序遍历，出栈时考虑全面
     * @param root
     */
    public void postOrder(TreeNode root)
    {
        TreeNode t = new TreeNode(0) ;
        TreeNode s = new TreeNode(0) ;
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(root!=null||st.size()>0)
        {
            while(root!=null)
            {
                st.push(root);

                root = root.left;
            }

            if(st.size()==0) return;
            t = st.peek();
            while(st.size()>0&&(t.right==null||s == t.right))
            {
                s =  st.pop();
                System.out.println(s.val);
                if (st.size() == 0) return;
                    t = st.peek();

            }
            root = t.right;
        }
    }
    /**
     * 中序遍历非递归，与先序一致的写法
     * 打印出栈的元素
     * @param root
     */
    public void inOrder(TreeNode root)
    {
        TreeNode t = new TreeNode(0) ;
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(root!=null||st.size()>0)
        {
            while(root!=null)
            {
                st.push(root);

                root = root.left;
            }
            if(st.size()==0) return;
            t = st.pop();
            System.out.println(t.val);
            while(st.size()>0&&t.right==null)
            {
                t = st.pop();
                System.out.println(t.val);
            }
            root = t.right;
        }
    }
    /**
     * 非递归的先序遍历
     * 打印进栈的元素
     * @param root
     */
    public void preOrder(TreeNode root)
    {
        TreeNode t = new TreeNode(0) ;
        Stack<TreeNode> st = new Stack<TreeNode>();
        while(root!=null||st.size()>0)
        {
            while(root!=null)
            {
                st.push(root);
                System.out.println(root.val);
                root = root.left;
            }
            if(st.size()==0) return;
            t = st.pop();
            while(st.size()>0&&t.right==null)
            {
                t = st.pop();
            }
            root = t.right;
        }


    }

}
