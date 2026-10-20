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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode node = new ListNode();
    ListNode head = node;
    ListNode currNode = list1;
    ListNode nNode = list2;
    while(currNode != null && nNode != null){
        if(currNode.val < nNode.val){
            node.next = currNode;
            currNode = currNode.next;
        }else{
            node.next = nNode;
            nNode = nNode.next;
        }
        node = node.next; 
    }
    if(currNode != null){               
            node.next = currNode;
        } else {
            node.next = nNode;
        }
    return head.next;
    }
}