package collections;

import java.util.HashMap;
import java.util.Map;

public class List1{
	
	
	public static void main (String[]args) {
		
		
		Map<Integer,String>map =new HashMap<Integer,String>();
		
		
		map.put(1 , "sai");
		map.put(2 , "sai");
		map.put(3 , "sai");
		map.put(4 , "sai");
		map.put(5 , "sai");
		map.put(6 , "sai");
		map.put(1 , "kumar");

			  for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue()); 
		
		
	}}}
//		
////		
//
//		Set<String >list =new HashSet<String>();	
//		list.add("virat");
//		list.add("kohli");
//		list.add("abd");
//		list.add("dk");
//		list.add("virat");
//		list.add("kohli");
//	list.size();
//		
//	for (String lis :list) {
//		
//		System.out.println(lis);
//		}
//	Iterator<String>itr =list.iterator();
//	
//	while (itr.hasNext()) {
//		
//		System.out.println(itr.next());
//	}	
//	}
//	
//}
