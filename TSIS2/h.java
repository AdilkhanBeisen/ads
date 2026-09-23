package TSIS2;
import java.io.*;


class h{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Node tail=null;
        Node head=null;
        int n=Integer.parseInt(br.readLine());
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
        Node curr=head;
        int current=curr.value;
        int max=curr.value;
        curr=curr.next;

        while(curr!=null){
            current=Math.max(curr.value,current+curr.value);
            max=Math.max(max,current);

            curr=curr.next;
        }
        System.out.println(max);
    }
}

class Node{
    int value;
    Node next;
}
