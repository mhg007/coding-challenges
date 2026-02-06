import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SameTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode();
        // t1.left = new TreeNode(2);
        // t1.right = new TreeNode(3);
        // t1.right = new TreeNode(4);

        TreeNode t2 = new TreeNode();
        // t2.left = new TreeNode(2);
        // t2.right = new TreeNode(3);

        System.out.println(isSameTree(t1, t2));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null)
            return false;
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        BinaryTree bt = new BinaryTree();
        bt.inOrder(p,list1);
        bt.inOrder(q,list2);
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));
        return list1.equals(list2);
    }    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class BinaryTree{
    TreeNode node;
    void inOrder(TreeNode node,List<Integer> list){
        if(node == null)
            return;
        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);
    }
}
 
//           15
//      10         20
//  11     13   17      23


if(p == null && q == null){
            return true;
        }
        if((p==null && q!=null)||(p!=null && q==null)){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        return left && right;