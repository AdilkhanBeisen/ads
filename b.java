
import java.io.*;


class b{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Node head= null;
        Node tail=null;
        int[] arr=new int[n];
        String[] s=(br.readLine().split(" "));
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        for(int i=0;i<n;i++){
            Node N=new Node();
            N.value=arr[i];
            N.next=null;
            if(head==null){
                head=N;
                tail=N;
            }
            else{
                tail.next=N;
                tail=N;
            }
        }
        Node cur=head;
        while(cur!=null && cur.next!=null){
            cur.next=cur.next.next;
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            System.out.print(cur.value+" ");
            cur=cur.next;
        }
    }
}

class Node{
    int value;
    Node next;
}