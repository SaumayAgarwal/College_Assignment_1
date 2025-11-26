class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        int count=1;
        ListNode temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        if(k==0)return head;
        temp.next=head;
        int newHeadLoc=count-k;
        ListNode newHead=head;
        ListNode newTail=head;
        for(int i=1;i<newHeadLoc;i++){
            newTail=newTail.next;
        }
        newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}
