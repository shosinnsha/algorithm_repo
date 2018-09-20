/*
*
*
给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

你可以假设除了数字 0 之外，这两个数字都不会以零开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
*
*/




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp_l1 = l1;
        ListNode temp_l2 = l2;
        ListNode res = new ListNode(0);
        ListNode temp_res = res;
        int sum = 0;
        while((temp_l1 != null) || (temp_l2 != null)){
            sum /= 10;
            if(temp_l1 != null){
                sum += temp_l1.val;
                temp_l1 = temp_l1.next;
            }
            if(temp_l2 != null){
                sum += temp_l2.val;
                temp_l2 = temp_l2.next;
            }
            temp_res.next = new ListNode(sum%10);
            temp_res = temp_res.next;
        }
        if(sum > 9){temp_res.next = new ListNode(1);}
        return res.next;
    }
}