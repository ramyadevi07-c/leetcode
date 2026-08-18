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
        Stack <Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            stack.push(temp.val);// as the value given for that is used here as val
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.val=stack.peek();
            stack.pop();
            temp=temp.next;
        }
        return head;
    }
}