interface Stack{
int size=5;
void push(int value);
int pop();
void display();
}
class IntegerStack implements Stack{
 int[] stack=new int[size];
int top=-1;

public void push(int value){
if(top==size-1){
System.out.println("Stack Overflow,cannot push"+value);
return;
}
stack[++top]=value;
System.out.println(value+"pushed.");
}

public int pop(){
if (top==-1){
System.out.println("Stack underflow,cannot pop.");
return -1;
}
return stack[top--];
}

public void display(){
if(top==-1){
System.out.println("Stack is empty.");
return;
}
System.out.println("stack:");
for(int i=0;i<=top;i++){
System.out.print(stack[i]+" ");
}
System.out.println();
}
}

class StackTest{
public static void main(String[] args){
IntegerStack myStack=new IntegerStack();
myStack.pop();
myStack.push(10);
myStack.push(20);
myStack.push(30);
myStack.push(40);
myStack.push(50);
myStack.push(60);
myStack.display();
System.out.println("Popped:"+myStack.pop());
myStack.display();
}
}


