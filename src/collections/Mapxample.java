package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapxample {
	
	
	public static void main (String []args) {
		
		
	HashMap<Integer,String>map =new HashMap<Integer,String>();
	
	map.put(1, "harry");
	map.put(2,"abhi");
	map.put(3,"tripathi");
	map.put(2, "aditya");
	map.put(4, "philips");
	
Set<Integer> keys =map.keySet();
	for (Integer key :keys) {
		System.out.println(key);
	}
	
	
	Set<Map.Entry<Integer, String> >values=map.entrySet();
	
	for (Map.Entry<Integer,String> e : values ) {
		
		System.out.println(e.getKey()+":"+e.getValue());
	}
	
//	System.out.println();
//Collection<String>values=map.values();
//
//for (String value :values) {
//	
//	System.out.println(value);
//}
//	
//	
//	
//	
//	//  map.replaceAll((k,v) -> "Ajay");
//	  
//	System.out.println(  map.containsKey(2)); 
//	
//	System.out.println(map.get(1));
//	
//	  map.put(3, "warner");
//	
//	System.out.println(map);
//	
//	map.remove(2);
//	
//	System.out.println(map);
//	
//	map.putIfAbsent(1, "virat");
//	
//	map.replace(1, "virat");
//	
//	System.out.println(map);
//	for(Integer key:keys) {
//		
//		System.out.println(map.getKey()+"  "+map.getValue());
//	}
////	  
//	  
//	
////System.out.println("before the replace0:"+map);
////	map.replace(4,"sunder");
//	
//	System.out.println("after itreation:"+map);
//	
//	map.replaceAll(null);
//	System.out.println("after itreation:"+map);

}
}