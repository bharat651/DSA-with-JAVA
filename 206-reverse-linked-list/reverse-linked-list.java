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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            // System.out.println(temp.val);
            // temp = temp.next;
            
            if(temp.next != null){
                ListNode nextNode = temp.next;
                temp.next = prev;
                prev = temp;
                temp = nextNode; 
            }
            
            else{
                temp.next = prev;
                head = temp;
                temp = null;
            }
        }
        return head;
        
    }
}