public class StackQueue {

    
    static class Stack {
        int[] stack = new int[5];
        int top = -1;

        void push(int value) {
            if (top == 4) {
                System.out.println("Stack Overflow");
                return;
            }
            stack[++top] = value;
        }

        void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return;
            }
            System.out.println("Popped from stack: " + stack[top--]);
        }

        void display() {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

  
    static class Queue {
        int[] queue = new int[5];
        int front = 0, rear = -1;

        void enqueue(int value) {
            if (rear == 4) {
                System.out.println("Queue Overflow");
                return;
            }
            queue[++rear] = value;
        }

        void dequeue() {
            if (front > rear) {
                System.out.println("Queue Underflow");
                return;
            }
            System.out.println("Dequeued from queue: " + queue[front++]);
        }

        void display() {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.display();
        s.pop();
        s.display();

        System.out.println();

        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.display();
        q.dequeue();
        q.display();
    }
}
