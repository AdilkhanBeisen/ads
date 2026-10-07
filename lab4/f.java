import java.util.*;

public class f {

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node insert(Node root, int value) {
        if(root==null){
            root=new Node(value);
        }
        else{
            Node curr=root;
            while(true){
                if(value<curr.value){
                    if(curr.left==null){
                        curr.left=new Node(value);
                        break;
                    }
                    else{
                        curr=curr.left;
                    }
                }
                else{
                    if(curr.right==null){
                        curr.right=new Node(value);
                        break;
                    }
                    else{
                        curr=curr.right;
                    }
                }
            }
        }

        return root;
    }

    static int count(Node root) {
        if (root == null)
            return 0;

        int ans = 0;

        if (root.left != null && root.right != null)
            ans++;

        ans += count(root.left);
        ans += count(root.right);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            root = insert(root, x);
        }

        System.out.println(count(root));
    }
}
