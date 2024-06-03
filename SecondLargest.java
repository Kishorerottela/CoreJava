import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int size=8;
		int count=0;
		Set<Integer> s=new TreeSet<Integer>();

		while(count<size) {
		System.out.println("Enter the element");
		 s.add(scan.nextInt());
		 count++;
		}
		 System.out.println();
		 
		 Integer max = s.stream().min((n1,n2)->n1.compareTo(n2)).get();
		 System.out.println(max);
		 
	}

}
