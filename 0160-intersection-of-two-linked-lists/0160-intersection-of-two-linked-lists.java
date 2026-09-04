/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA, currB = headB;
        int lenA = 0, lenB = 0;
        while (currA != null) {
            lenA++;
            currA = currA.next;
        }
        while (currB != null) {
            lenB++;
            currB = currB.next;
        }
        currA = headA;
        currB = headB;

        int diff = Math.abs(lenA - lenB);

        if (lenA > lenB) {
            int i = 0;
           
            while (i < diff) {
                currA = currA.next;
                i++;
            }
        } else {
            int j = 0;
         
            while (j < diff) {
                currB = currB.next;
                j++;
            }
        }
        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }
}