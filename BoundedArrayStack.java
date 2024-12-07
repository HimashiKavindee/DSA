import java.util.NoSuchElementException;                //LIFO

public class BoundedArrayStack {
    
    private int maxsize; //size of the stack array
    private int[] stackArray; //array creation
    private int tos; //top of the stack

    public BoundedArrayStack (int s){

        maxsize = s; // set array size
        stackArray = new int [maxsize]; 
        tos = -1; //no item in this stack
    }

    //is Empty method 
    public boolean isEmpty() {
        return tos == -1; //stack is full if the top reaches maxsize - 1
    }

    //isFull method
	public boolean isfull()
	{
		return tos == maxsize - 1; //stack is full if the top reaches maxSize - 1
	}


    //push operation 
    public void push(int j){
        //check whether the stack is full
        if(isfull()){
            throw new IllegalStateException("Stack is full");
        }else{
            //increament top
            //inser item
            stackArray[++tos] = j;
        }
    }

    // pop operation
    public int pop(){
        //Check whether stack is empty
        //if not
        // access item
        if(isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }else {
            return stackArray[tos --];
        }
    }

    //peek operation
	public int peek()
	{
		if(tos==-1)
		{
			throw new NoSuchElementException("Stack is empty");
		}
		else
		{
			return stackArray[tos];
		}
	}


    public void display(){
        System.out.print("Stack elements: [");
        for (int i = tos; i >= 0; i--){ // Traverse from 
            System.out.print(stackArray [i] + " ");
        }
        System.out.println(("]"));
    }

}