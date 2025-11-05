class Solution {
    public int getCount(Node head) {
        // code here
        if(head==null)return 0;
        int i=0;
        while(head!=null){
            i++;
            head=head.next;
        }
        return i;
    }
}
