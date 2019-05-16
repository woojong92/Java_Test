import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class IteratorCollection {
	public static void main( String[] args ) {
		List<String> list = new LinkedList<>();
		list.add("Alex");
		list.add("Tredy");
		list.add("Bob");
		list.add("Chuck");

		Iterator<String> iter = list.iterator();

		while( iter.hasNext() ) {
			System.out.print( iter.next() + '\t' );
		}
		System.out.println();

		iter = list.iterator();

		String str;
		while( iter.hasNext() ) {
			str = iter.next();
			if( str.equals("Bob") ) 
				iter.remove();
		}

		iter = list.iterator();

		while( iter.hasNext() ) 
			System.out.print( iter.next() + '\t' );
		System.out.println();
	}
}
