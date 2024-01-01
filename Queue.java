public class Queue {
    int front;
    int rear;
    int[] queue;
    int size;


    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public int getFront() {
        return queue[front];
    }

    public int getRear() {
        return queue[rear];
    }
    public int[] getQueue() {
        return queue;
    }
    public String toString() {
        String result = "";
        for (int i = 0; i < queue.length; i++) {
            result += queue[i] + " ";
        }
        return result;
    }
    public void add(int value) {
      
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            queue[rear] = value;
        }
    }
    
    public int remove() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        else {
            int value = queue[front];
            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
            if (rear == -1) {
                front = -1;
            }
            return value;
        }
    }
}
