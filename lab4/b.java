import java.io.*;
import java.util.*;

public class b{
    static class Node {
        int value;
        Node left, right;
        Node(int v) { value = v; }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. Построение дерева
        Node root = null;
        for (int i = 0; i < n; i++) {
            int f = Integer.parseInt(st.nextToken());
            if (root == null) {
                root = new Node(f);
            } else {
                Node curr = root;
                while (true) {
                    if (f > curr.value) {
                        if (curr.right == null) {
                            curr.right = new Node(f);
                            break;
                        } else {
                            curr = curr.right;
                        }
                    } else {
                        if (curr.left == null) {
                            curr.left = new Node(f);
                            break;
                        } else {
                            curr = curr.left;
                        }
                    }
                }
            }
        }

        // 2. Поиск узла со значением x
        int x = Integer.parseInt(br.readLine().trim());
        Node curr = root;
        while (curr.value != x) {
            if (curr.value > x) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        // 3. Подсчёт размера поддерева через стек
        int count = 0;
        ArrayDeque<Node> stack = new ArrayDeque<>();
        stack.push(curr);
        while (!stack.isEmpty()) {
            Node v = stack.pop();
            count++;
            if (v.left != null) stack.push(v.left);
            if (v.right != null) stack.push(v.right);
        }

        System.out.println(count);
    }
}