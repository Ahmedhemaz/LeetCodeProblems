/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head; // asign to temp node
        ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current.next; // store next in aribitary temp node
            current.next = prev; // reverse ptr of curr next item to prev as we need to reverse
            prev = current; // store in some other node fo future linking
            current = next; // iterate over to next node
        }
        return prev; // this way we keep on storing to prev and eventually we will have reversd list
                     // in prev node

    }
}