package lab3;
import java.util.*;

public class a{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int j=sc.nextInt();
            arr[i]=j;
        }  
        int s=sc.nextInt();
        int i=0;
        boolean r=false;
        while(i<arr.length){
            if(arr[i]==s){
                r=true;
                break;
            }
            else{
                r=false;
            }
            i++;
        }  
        if(r){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
       
}
