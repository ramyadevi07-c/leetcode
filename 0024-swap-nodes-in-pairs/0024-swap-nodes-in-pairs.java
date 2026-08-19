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
// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         ListNode temp= head;
//         ListNode current= temp;
//         while(temp.next!=null){
//             current = temp;
//             temp = temp.next;
//             current.next = current.next.next;
//             temp.next=current;
//             temp = current.next;
//         }
//         return head;
//     }
// }
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy; 
        while (head != null && head.next != null) {
            ListNode firstnode = head;
            ListNode secondnode = head.next;
            prev.next = secondnode;               
            firstnode.next = secondnode.next;     
            secondnode.next = firstnode;          
            prev = firstnode;
            head = firstnode.next;
        }
        return dummy.next;
    }
}
