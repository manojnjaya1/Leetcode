class MyCircularQueue {
        int[] arr;
    int front=-1;
    int rear=-1;
    int n;
    public MyCircularQueue(int k) {
        arr=new int[k];
       n=k;
    }
    
    public boolean enQueue(int value) {
       if((rear+1)%n==front){
           return false;
       }
        if(front==-1)front=0;
        rear=(rear+1)%n;
        arr[rear]=value;
        
        return true;
    }
    
    public boolean deQueue() {
        if(front==-1)return false;
        if(front==rear){
            front=-1;
            rear=-1;
            return true;
        }else front=(front+1)%n;
        
        return true;
    }
    
    public int Front() {
        if(front==-1)return -1;
        
        return arr[front];
    }
    
    public int Rear() {
       if(rear==-1)return -1;
        
        return arr[rear];
    }
    
    public boolean isEmpty() {
         if(front==-1)return true;
        
        return false;
    }
    
    public boolean isFull() {
         if((rear+1)%n==front)return true;
        
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */