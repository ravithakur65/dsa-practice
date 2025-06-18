package dsa.practice;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        root.next(node1).next(node2).next(node3).next(node4);
        printList(root);
        System.out.println();
        printList(reverseList(root));
    }

    public static ListNode reverseList(ListNode root){
        ListNode currNode = root;
        ListNode prev = null;
        while (currNode != null) {
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }

    public static void printList(ListNode root) {
        while (root != null) {
            System.out.print(root.val+" ");
            root = root.next;
        }
    }
}



