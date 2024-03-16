package LeetCode_questions;

import java.util.ArrayList;

public class zerosumconsectuive1171 {
}


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
      if(head==null) {
          return null;
      }
        ListNode cur=head;
      ListNode prev=null;

      int sum=0;
      while(cur!=null){
          sum+=cur.val;
          if(sum==0){
              if(prev==null){
                  head=cur.next;
              }else{}
              removeZeroSumSublists(head);
          }
          cur=cur.next;
      }
    }
}
