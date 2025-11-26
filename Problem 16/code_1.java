class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
class MinStack {
    Node head;
    Node last;
    List<Integer> list=new ArrayList<>();
    public MinStack() {
        head=new Node(0);
        last=head;
    }
    public void push(int val) {
        Node temp=new Node(val);
        last.next=temp;
        temp.prev=last;
        last=last.next;
    }
    
    public void pop() {
        if(last==head)return;
        last=last.prev;
        last.next=null;
    }
    
    public int top() {
        return last.val;
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        Node curr=head.next;
        while(curr!=null){
            if(min>curr.val)min=curr.val;
            curr=curr.next;
        }
        return min;
    }
}
