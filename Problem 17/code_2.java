class MyCircularQueue {
    int[] q;
    int rear;
    int front;
    int size;
    public MyCircularQueue(int k) {
        rear=-1;
        front=-1;
        size=k;
        q=new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        rear++;
        if(front==-1)front++;
        if(rear==size)rear=rear%size;
        q[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        if(front==rear){
            rear=-1;
            front=-1;
        }
        else if(front==size-1)front=0;
        else front++;
        return true;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return q[front];
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return q[rear];
    }
    
    public boolean isEmpty() {
        return rear==-1;
    }
    
    public boolean isFull() {
        return (rear+1)%size==front;
    }
}
