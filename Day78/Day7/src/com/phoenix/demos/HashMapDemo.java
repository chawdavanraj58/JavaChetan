package com.phoenix.demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> movies=new HashMap();
		movies.put("movieName", "Shawshank Redemption");
		movies.put("actorName", "Tim Robbins");
		movies.put("directorName", "Frank Darabont");
		movies.put("rating", "4.8");
		movies.put("actorName", "Morgan Freeman");
		movies.put(null, "default Value");
		//System.out.println(movies.get("actorName"));
		
		Set<Map.Entry<String,String>> entries=movies.entrySet();
		
		Iterator<Map.Entry<String, String>> iter=entries.iterator();
		while(iter.hasNext())
		{
			Map.Entry<String, String> singleEntry=iter.next();
			System.out.println(singleEntry.getKey()+" "+singleEntry.getValue());
		}
	}

}
