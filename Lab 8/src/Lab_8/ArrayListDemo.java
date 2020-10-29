package Lab_8;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		//Creating new ArrayList
		ArrayList arlTest = new ArrayList();
		//Size of ArrayList
		System.out.println("Size of ArrayList at creation: "+arlTest.size());
		arlTest.add("B");
		arlTest.add("I");
		arlTest.add("T");
		arlTest.add("S");
		System.out.println("Size of ArrayList after adding elements: "+arlTest.size());
		System.out.println("List of all elements: "+arlTest);
		arlTest.remove("B");
		System.out.println("Contents of ArrayList after removing one element: "+arlTest);
		arlTest.remove(2); //Removing by index
		System.out.println("Contents after removing element by index: "+arlTest);
		System.out.println("Size of ArrayList after removing element by index: "+arlTest.size());
		System.out.println(arlTest.contains("T"));
		System.out.println(arlTest.contains("B"));
	}
}
