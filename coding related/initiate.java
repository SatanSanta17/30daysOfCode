import java.util.Scanner;

import org.w3c.dom.Node;

public class initiate {
    static class node {
        public int data;
        public node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class linkedList {
        public node head, tail;

        public linkedList() {
            this.head = null;
            this.tail = null;
        }
    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int listItem = sc.nextInt();
            node newNode = new node(listItem);
            if (ll.head == null) {
                ll.head = newNode;
            } else {
                node temp = ll.head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        sc.close();

        node last = ll.head;
        for (int i = 0; i < n; i++) {
            System.out.println(last.data);
            last = last.next;
        }

    }
}