package lab3;
import java.util.*;

public class aa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int i=0;
        boolean r=false;
        while(i<array.length){
            if(array[i]==s){
                r=true;
                break;
            }
            else{
                r=true;
            }
            i++;
        }
        if(r){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
