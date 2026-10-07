import java.io.*;
import java.util.*;

public class d{
    static class Node{
        int value;
        Node left,right;
        Node(int v){value=v;}
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Node root=null;
        long[] sum=new long[n];
        int max=0;
        for(int i=0;i<n;i++){
            int f=Integer.parseInt(st.nextToken());
            if(root==null){
                root=new Node(f);
                sum[0]+=f;
            }
            else{
                Node curr=root;
                int d=0;
                while(true){
                    if(f>curr.value){
                        d++;
                        if(curr.right==null){
                            curr.right=new Node(f);
                            sum[d]+=f;
                            max=Math.max(max,d);
                            break;
                        }
                        else{
                            curr=curr.right;
                        }
                    }
                    else{
                        d++;
                        if(curr.left==null){
                            curr.left=new Node(f);
                            sum[d]+=f;
                            max=Math.max(max,d);
                            break;

                        }
                        else{
                            curr=curr.left;
                        }
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=max;i++){
            sb.append(sum[i]).append(' ');
        }
        System.out.println(max+1);
        System.out.println(sb.toString().trim());
        
    }
}