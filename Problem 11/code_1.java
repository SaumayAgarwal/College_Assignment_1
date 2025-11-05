class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
class MyLinkedList {
    ListNode head;
    int size=0;
    public MyLinkedList() {
        head=new ListNode(-1);
    }
    
    public int get(int index) {
        if(index>=size)return -1;
        ListNode curr=head.next;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode temp=new ListNode(val);
        temp.next=head.next;
        head.next=temp;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        ListNode temp=new ListNode(val);
        curr.next=temp;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(size<index)return;
        ListNode curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        ListNode temp=new ListNode(val);
        temp.next=curr.next;
        curr.next=temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size)return;
        ListNode curr=head;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        if(curr.next.next==null)curr.next=null;
        else curr.next=curr.next.next;
        size--;
    }
}
