package TSIS2.var4;
import java.util.*;
import java.io.*;

public class i {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        Deque<String> books=new ArrayDeque<>();

        String line;
        while((line=br.readLine())!=null){
            if(line.isEmpty())continue;
            StringTokenizer st=new StringTokenizer(line);
            if(!st.hasMoreTokens())continue;
            
        }
    }
}
