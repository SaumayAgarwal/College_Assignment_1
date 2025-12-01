class myQueue {
    
    int[] q;
    int r;
    int f;
    int n;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        q=new int[n];
        r=-1;
        f=-1;
        this.n=n;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return r==-1;
    }

    public boolean isFull() {
        // Check if queue is full
        return r==n-1;
    }

    public void enqueue(int x) {
        // Enqueue
        if(!isFull()){
            if(r==-1){
                f++;
            }
            r++;
            q[r]=x;
        }
    }

    public void dequeue() {
        // Dequeue
        if(!isEmpty()){if(f==r){
            f=-1;
            r=-1;
        }
        else f++;}
    }

    public int getFront() {
        // Get front element
        if(isEmpty())return -1;
        return q[f];
    }

    public int getRear() {
        // Get last element
        if(isEmpty())return-1;
        return q[r];
    }
}
