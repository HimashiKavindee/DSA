import java.util.Arrays;
public class ArrayTest{
       public static void main(String[]args){
	   Integer a[] = new Integer[]{3,7,8,9,0};
	   System.out.println("before swapping");
	   System.out.println( Arrays.deepToString(a));
	   int temp=a[2];
	   a[2]=a[1];
	   a[1]=temp;
	   
	   System.out.println("after swapping");
	   System.out.println( Arrays.deepToString(a));
	   }
}