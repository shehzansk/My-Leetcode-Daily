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
    public void reverseLL(ListNode head){

    }
    public int getDecimalValue(ListNode head) {
        
        ListNode prev = null, curr = head; 
        // if(head == null) return 0; as not ept given

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        int pow = 1;
        int ans = 0;
        while(prev != null){
            ans += prev.val * pow;
            pow *= 2;
            prev = prev.next;
        }
    
        return ans;
        
    }
}