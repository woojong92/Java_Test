import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

class AsListCollection {
	public static void main( String[] args ) {
		List<String> list = Arrays.asList("Alex", "Bob", "Chuck", "Trudy");
		list = new ArrayList<>(list);

		for(Iterator<String> iter = list.iterator(); iter.hasNext() ; ) 
			System.out.print( iter.next() + '\t' );
		System.out.println();

		for(Iterator<String> iter = list.iterator() ; iter.hasNext() ; ){
			if( iter.next().equals("Bob") ) 
				iter.remove();
		}

		for(Iterator<String> iter = list.iterator() ; iter.hasNext() ; ) 
			System.out.print( iter.next() + '\t' );
		System.out.println();
	}
}
