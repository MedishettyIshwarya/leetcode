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
        ListNode result = new ListNode(0);
         ListNode ptr = result;
         int carry = 0;// default carry
         while (l1 != null || l2 != null){
            int sum = 0+ carry; /// initialize sum
            if (l1 != null){
                sum+= l1.val;// use number from first list
                l1=l1.next;
            }
            if (l2 != null){
                sum+= l2.val;// use number from second list
                l2=l2.next;

         }
         carry = sum/10;// gets sum and carry holds carry
         sum = sum%10 ;// gets last digit ex 18 holds 8
         ptr.next = new ListNode(sum);
         ptr = ptr.next;

        
    }
    if (carry ==1) ptr.next = new ListNode(1);
    return result.next;
}}