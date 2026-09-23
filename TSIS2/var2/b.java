package TSIS2.var2;
import java.io.*;

class b {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Node head=null;
        Node tail=null;
        StringBuilder sb=new StringBuilder();
        String[] parts=br.readLine().split(" ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }
        for(int i=0;i<n;i++){
            Node node=new Node();
            node.value=arr[i];
            node.next=null;
            if(head==null){
                head=node;
                tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
        }
        Node curr=head;
        while(curr!=null && curr.next!=null){
            curr.next=curr.next.next;
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            sb.append(curr.value+" ");
            curr=curr.next;
        }
        System.out.println(sb);
    }
}
class Node{
    int value;
    Node next;
}
