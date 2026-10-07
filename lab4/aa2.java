
import java.io.*;
import java.util.*;         


public class aa2 {
    static class Node{
        int value;
        Node left,right;
        Node(int v){value=v;}
    }
    

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        Node root=null;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int f=Integer.parseInt(st.nextToken());
            if(root==null){
                root=new Node(f);
            }
            else{
                Node curr=root;
                while(true){
                    if(curr.value>f){
                        if(curr.left==null){
                            curr.left=new Node(f);
                            break;
                        }
                        else{
                            curr=curr.left;
                        }
                    }
                    else{
                        if(curr.right==null){
                            curr.right=new Node(f);
                            break;
                        }
                        else{
                            curr=curr.right;
                        }
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            String f=br.readLine().trim();
            Node curr=root;
            for(int j=0;j<f.length();j++){
                char c=f.charAt(j);
                if(c=='L'){curr=curr.left;}
                else{
                    curr=curr.right;
                }
                if(curr==null)break;
            }

            if(curr!=null){
                sb.append("YES\n");}
            else{
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
        
    }
}
