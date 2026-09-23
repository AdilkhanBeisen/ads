package TSIS2.var1;
import java.io.*;

class e {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int ind=n/2;
        Node head=null;
        Node tail=null;
        String[] parts=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int f=Integer.parseInt(parts[i]);
            Node node=new Node();
            node.value=f;
            if(head==null){
                head=node;
                tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
        }
    Node prev=head;
    if(ind==0){
            head=head.next;
        }
    else{
        for(int i=0;i<ind-1;i++){
            prev=prev.next;
            }
        prev.next=prev.next.next;
     }
    Node curr=head;
    if(head==null){
        System.out.println();
    }
    while(curr!=null){
        sb.append(curr.value+" ");
        curr=curr.next;
        }
     System.out.append(sb);
    }
}
class Node{
    int value;
    Node next;
}
