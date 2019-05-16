import java.util.List;
import java.util.LinkedList;

class LinkedListCollection {
	public static void main(String[] args){
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Alex");

		for( String s : list ) 
			System.out.println( s + '\t');
		System.out.println();

		list.remove(0);

		for( String s : list) 
			System.out.println( s + '\t');
		System.out.println();
	}
}
