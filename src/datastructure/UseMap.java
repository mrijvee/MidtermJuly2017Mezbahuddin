package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, String> list = new HashMap<>();

		list.put("USA", "WASHINGTON, D.C.");
		list.put("ENGLAND", "LONDON");
		list.put("CANADA", "OTTAWA");
		list.put("SWITZERLAND", "BERN");

		for (Map.Entry entry : list.entrySet()) {
			System.out.println("The capital of " + entry.getKey() + " is " + entry.getValue());
		}

		System.out.println("_____________________________________________");

		Iterator<Map.Entry<String,String>> iterator = list.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String,String> entry = iterator.next();
			System.out.println("The capital of " + entry.getKey() + " is " + entry.getValue());
		}
	}
}