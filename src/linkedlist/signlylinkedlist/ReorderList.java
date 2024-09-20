package linkedlist.signlylinkedlist;

import java.util.Stack;

public class ReorderList {
    static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(5);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        reorderList(head);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    static void reorderList(ListNode head) {
        ListNode temp = head.next;
        Stack<ListNode> stack = new Stack<>();
        while(temp != null) {
            stack.add(temp);
            temp = temp.next;
        }
        temp = head;
        while(!stack.isEmpty()) {
            temp.next = new ListNode(stack.pop().val);
            temp = temp.next;
        }
    }
}
