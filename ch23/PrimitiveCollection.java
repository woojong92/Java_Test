import java.util.Iterator;
import java.util.LinkedList;

class PrimitiveCollection {
	public static void main( String[] args ) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10); list.add(20); list.add(30); // auto boxing

		int n;
		for( Iterator<Integer> iter = list.iterator() ; iter.hasNext() ; ) {
			n = iter.next(); // auto unboxing
			System.out.print( n + '\t' );
		}
		System.out.println();
	}
}
