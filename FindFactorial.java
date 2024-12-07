public  class FindFactorial{
        public static long factorial (int n){
		       if(n==1)
			      return 1;
			   else
                  return n*factorial(n-1);
}				  
 public static void main(String[]args){
		       long result= factorial(100);
			   System.out.println("Factorial is " + result);

     }
}
			   