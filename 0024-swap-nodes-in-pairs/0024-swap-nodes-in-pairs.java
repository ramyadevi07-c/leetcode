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
 class Solution{
    public ListNode swapPairs(ListNode head){
        ListNode swap = new ListNode(0);
        swap.next = head ;
        ListNode curr = swap;
        while(curr.next!=null && curr.next.next!=null){
            ListNode first = curr.next;
            ListNode second = curr.next.next;
             // swap
            first.next = second.next;
            second.next = first;
            curr.next = second;
            curr=first;
        }
        return swap.next;
    }
 }
//THE DOWN SOLUTION ALSO CORRECT ...

// class Solution {
//     public ListNode swapPairs(ListNode head) {
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode prev = dummy; 
//         while (head != null && head.next != null) {
//             ListNode firstnode = head;
//             ListNode secondnode = head.next;
//             prev.next = secondnode;               
//             firstnode.next = secondnode.next;     
//             secondnode.next = firstnode;          
//             prev = firstnode;
//             head = firstnode.next;
//         }
//         return dummy.next;
//     }
// }
