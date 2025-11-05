class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode heir=head;
        ListNode turtle=head;
        while(heir.next!=null && heir.next.next!=null){
            heir=heir.next.next;
            turtle=turtle.next;
        }
        if(heir.next!=null)return turtle.next;
        return turtle;
    }
}
