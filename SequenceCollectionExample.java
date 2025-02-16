import java.util.LinkedList;
import java.util.SequencedCollection;

public class SequenceCollectionExample{
	public SequenceCollectionExample(){
		SequencedCollection sc = new  LinkedList();
		sc.addFirst(5);
		sc.addFirst(10);
		sc.addLast(3);
		System.out.println(sc.getFirst());
		System.out.println(sc.removeLast());
		System.out.println(sc);
		System.out.println(sc.reversed());	
	}
	public static void main(String []args)
	{
		new SequanceCollectionExample();
	}
}