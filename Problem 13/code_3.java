class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            while(curr!=null && curr.val==prev.val){
                curr=curr.next;
            }
            prev.next=curr;
            prev=curr;
            if(curr==null)return head;
            curr=curr.next;
        }
        return head;
    }
}
