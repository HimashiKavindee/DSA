public class stackApp {
    public static void main(String[] args) {
        BoundedArrayStack theStack =new BoundedArrayStack(5);//create a stack with max size

        //push operation
        for(int i=1; i<=6; i++){
            if (!theStack.isfull()) {
                //insert item
                theStack.push(i *10);
            } else {
                System.out.println("Cannot push.Stack is full");
            }
        }

        theStack.display(); 

        //peek the top element
        if (!theStack.isEmpty()) {
            System.out.println("Top element is : "+theStack.peek());
        } else {
            System.out.println("stack is Empty,nothing to peek");
        }

        //pop operation
        if (!theStack.isEmpty()) {
            //util the stack is empty ,delete items from stack
            int val = theStack.pop();
            System.out.println(val);
            System.err.println(" ");
        }
        else{
            System.out.println("Cannot pop. Stack is Empty");
        }
    }
}