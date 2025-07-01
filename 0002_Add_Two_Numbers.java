
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode f = l1; 
        ListNode s = l2;
        
        int c = 0;
        
        ListNode res = new ListNode(0); // result linked list
        ListNode p = res; 
        
        while (f != null || s != null || c != 0) {
            
            if (f != null) {
                c += f.val;
                f = f.next;
            }
            if (s != null) {
                c += s.val;
                s = s.next;
            }
            p.next = new ListNode(c % 10);
            p = p.next;
            c /= 10; 

        }
        return res.next;
    }
}
