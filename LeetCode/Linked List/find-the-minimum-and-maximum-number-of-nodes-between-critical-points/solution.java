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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return new int[]{-1,-1};
        
        List<Integer> list=new ArrayList<>();

        ListNode prev=head,nxt=head.next.next,curr=head.next;
        int j=1;
        while(nxt!=null){
          if((curr.val<prev.val && curr.val<nxt.val) || (curr.val>prev.val && curr.val>nxt.val)){
            list.add(j);
          }
          prev=prev.next;
          curr=curr.next;
          nxt=nxt.next;
          j++;
        }

        Collections.sort(list);
        if(list.size()<2) return new int[]{-1,-1};

        int max=list.get(list.size()-1)-list.get(0);
        int min=Integer.MAX_VALUE;

        for(int i=1;i<list.size();i++){
            min=Math.min(min,list.get(i)-list.get(i-1));
        }
        return new int[]{min,max};
    }
}