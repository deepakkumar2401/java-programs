package interview_related;

class ListNode {
    Object data;
    ListNode next;

    ListNode(Object data) {
        this.data = data;
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(5);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);

        System.out.print("Original: ");
        printList(head);

        head = reverse(head);
        System.out.print("Reversed (Iterative): ");
        printList(head);

        head = reverseRecursive(head);
        System.out.print("Reversed Again (Recursive): ");
        printList(head);
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Recursive approach
    public static ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseRecursive(head.next);
        head.next.next = head; // reverse
        head.next = null;      // break link

        return newHead;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
