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
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists.length == 0){
      return null;
    }else{
      return dc(lists, 0 , lists.length-1);
    }
  }
  public ListNode mta(ListNode list1, ListNode list2){
    if(list1 == null){
      return list2;
    }
    if(list2 == null){
      return list1;
    }
    if(list1.val < list2.val){
      list1.next = mta(list1.next, list2);
      return list1;
    }else {
      list2.next = mta(list1, list2.next);
      return list2;
    }
  }
  private ListNode dc(ListNode[] lists, int left , int right){
    if(left == right){
      return lists[left];
    }
    int mid = left + (right - left)/2;
    ListNode list1 = dc(lists , left , mid);
    ListNode list2 = dc(lists , mid + 1, right);
    return mta(list1, list2);
  }      
}
