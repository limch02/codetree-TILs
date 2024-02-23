import java.io.*;
import java.util.StringTokenizer;

class Node {
    String value;
    Node prev;
    Node next;

    public Node(String value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node cur;
    public void print() {
        Node temp = cur;
        if (temp.prev!=null){
            System.out.print(temp.prev.value+" ");
        }else {
            System.out.print("(Null) ");
        }
        System.out.print(temp.value+" ");
        if (temp.next!=null){
            System.out.print(temp.next.value+" ");
        }else {
            System.out.print("(Null) ");
        }
        System.out.println(); // 줄 바꿈
    }
    public DoublyLinkedList(String initialValue) {
        this.cur = new Node(initialValue);
    }

    // 연산 1: 주어진 문자열 값을 가지는 새로운 노드를 현재 노드(cur)의 앞에 삽입
    public void operation1(String value) {
        Node newNode = new Node(value);
        if (cur != null) {
            newNode.next = cur;
            if (cur.prev != null) {
                newNode.prev = cur.prev;
                cur.prev.next = newNode;
            }
            cur.prev = newNode;
        }
    }

    // 연산 2: 주어진 문자열 값을 가지는 새로운 노드를 현재 노드(cur)의 뒤에 삽입
    public void operation2(String value) {
        Node newNode = new Node(value);
        if (cur != null) {
            newNode.prev = cur;
            if (cur.next != null) {
                newNode.next = cur.next;
                cur.next.prev = newNode;
            }
            cur.next = newNode;
        }
    }

    // 연산 3: 현재 노드(cur)의 이전 노드로 이동
    public void operation3() {
        if (cur != null && cur.prev != null) {
            cur = cur.prev;
        }
    }

    // 연산 4: 현재 노드(cur)의 다음 노드로 이동
    public void operation4() {
        if (cur != null && cur.next != null) {
            cur = cur.next;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        DoublyLinkedList dll = new DoublyLinkedList(s);
        int a = Integer.parseInt(br.readLine());
        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            if (b ==1 ){
                String s1 = st.nextToken();
                dll.operation1(s1);
                dll.print();
            } else if (b==2) {
                String s2 = st.nextToken();
                dll.operation2(s2);
                dll.print();
            } else if (b==3) {
                dll.operation3();
                dll.print();
            } else{
                dll.operation4();
                dll.print();
            }
        }
    }
}