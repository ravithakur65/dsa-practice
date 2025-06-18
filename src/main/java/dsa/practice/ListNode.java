package dsa.practice;

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    public ListNode next(ListNode node){
        return this.next = node;
    }
}
