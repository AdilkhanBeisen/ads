import java.io.*;

public class i{
    static class Node{
        String title;
        Node next;
        Node prev;

        Node(String title){
            this.title=title;
        }
    }

    static Node head=null;
    static Node tail=null;

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out=new StringBuilder();
        String line;
        while((line=br.readLine())!=null){
            if(line.startsWith("add_front ")){
                String title=line.substring(10);
                Node node= new Node(title);

                if(head==null){
                    head=node;
                    tail=node;
                }
                else{
                    node.next=head;
                    head.prev=node;
                    head=node;
                }

                out.append("ok\n");
            }
            else if(line.startsWith("add_back ")){
                String title=line.substring(9);

                Node node=new Node(title);

                if(tail==null){
                    head=node;
                    tail=node;
                }
                else{
                    tail.next=node;
                    node.prev=tail;
                    tail=node;
                }
                out.append("ok\n");
            }
            else if(line.equals("erase_front")){
                if(head==null){
                    out.append("error\n");
                }
                else{
                    out.append(head.title).append("\n");

                    if(head==tail){
                        head=null;
                        tail=null;
                    }else{
                        head=head.next;
                        head.prev=null;
                    }
                }
            }
            else if(line.equals("erase_back")){
                if(tail==null){
                    out.append("error\n");
                }
                else{
                    out.append(tail.title).append("\n");
                    if(head==tail){
                        head=null;
                        tail=null;
                    }
                    else{tail=tail.prev;
                    tail.next=null;
                    }
                }
            }
            else if(line.equals("front")){
                if(head==null){
                    out.append("error\n");
                }else{
                    out.append(head.title).append("\n");
                }
            }
            else if(line.equals("back")){
                if(tail==null){
                    out.append("error\n");
                }
                else{
                    out.append(tail.title).append("\n");
                }
            }
            else if(line.equals("clear")){
                head=null;
                tail=null;
                out.append("ok\n");
            }
            else if(line.equals("exit")){
                out.append("goodbye\n");
                break;
            }
        }
        System.out.print(out);
    }
}