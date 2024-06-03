import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {

		Hashtable ht=new Hashtable();
	    ht.put(1, "rohit");
	    ht.put(2, "dhoni");
	    ht.put(3, "virat");
	    
	    System.out.println(ht);
	    
	    Set entrySet = ht.entrySet();
	    Iterator itr = entrySet.iterator();
	    while(itr.hasNext()) {
	    	Object next = itr.next();
	    	System.out.println(next);
	    }
	}

}
