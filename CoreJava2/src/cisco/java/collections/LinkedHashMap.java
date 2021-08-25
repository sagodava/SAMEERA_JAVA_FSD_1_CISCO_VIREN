package cisco.java.collections;

import java.util.*;

//import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMap
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map < Integer, String> linkedHashMap =new LinkedHashMap <Integer ,String>();
		linkedHashMap.put(1,  new String("Samsung"));
		linkedHashMap.put(2,  new String("Mi"));
		linkedHashMap.put(3,  new String("Toshiba"));
		linkedHashMap.put(4,  new String("HCL"));
		linkedHashMap.put(5,  new String("Wipro"));
		
		System.out.println("Coontents of LinkedhashMap :"+linkedHashMap);
		System.out.println("\n Values of map after iterating over it");
		
		for(Integer key:linkedHashMap.keySet()) 
		{
			System.out.println(key+"\t"+linkedHashMap.get(key));
		}
		
			System.out.println("\n the size of linkedHashMAp is :"+linkedHashMap.size()	);
			System.out.println("\n Linkedhashmap empty?:"+linkedHashMap.isEmpty());
			System.out.println("\n LinkedHashmap contains 2 as akey? :"+linkedHashMap.containsKey(2));
			System.out.println("\n LinkedHashMap contains HCL as value:"+linkedHashMap.containsValue("HCL")	);
			System.out.println("\n Remove entry for key 3"+linkedHashMap.remove(3)	);
			System.out.println("\n content of linkedHashmap: after removing key 2"+linkedHashMap);
			linkedHashMap.clear();
			System.out.println("\n content of LinkedHashMap after clearing:"+linkedHashMap);
		
	}

}
