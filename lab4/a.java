import java.util.*;
import java.io.*;

class a{

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
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
                    if(f<=curr.value){
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
            Node cur=root;
            for(int j=0;j<f.length();j++){
                char c=f.charAt(j);
                if(c=='L'){
                    cur=cur.left;
                }
                else{
                    cur=cur.right;
                }
                if(cur==null){
                    break;
                }
            }
            if(cur!=null){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}

class Node{
    int value;
    Node left,right;
    Node(int v){value=v;}
}