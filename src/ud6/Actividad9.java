package ud6;

import java.util.HashSet;
import java.util.Set;

public class Actividad9 {

	public static void main (String[]args) {
		
		Set<String> conjunto1 = new HashSet<>();
		
		conjunto1.add("Pablo");
		conjunto1.add("Julio");
		conjunto1.add("Charo");
		
		Set<String> conjunto2 = new HashSet<>();
		
		conjunto1.add("Jorge");
		conjunto1.add("José Manuel");
		conjunto1.add("Charo");
		
		Set<String> unionSet = union(conjunto1, conjunto2);
        System.out.println("Unión de conjunto1 y conjunto2: " + unionSet);
    }
		

	    public static <T> Set<T> union(Set<T> conjunto1, Set<T> conjunto2) {
	        Set<T> unionSet = new HashSet<>(conjunto1);
	        unionSet.addAll(conjunto2);
	        return unionSet;
	    }
}


