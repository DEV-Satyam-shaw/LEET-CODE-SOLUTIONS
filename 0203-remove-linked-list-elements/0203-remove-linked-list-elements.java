/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if( head == null)
        {
            return null;
        }
        ListNode temp = head;
        ListNode last = head;
        
        while(temp != null)
        {
            if(temp.val == val && head == temp )
            {
                head = head.next;
                temp = head;
                last = head;
            } else if(temp.val == val)
            {
                last.next = temp.next;
                temp = temp.next;
            }
            else
            {
                last = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}