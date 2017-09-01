package datastructure;

import databases.ConnectDB;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Sia");
		arrayList.add("Khaliffa");
		arrayList.add("Bujra");
		arrayList.add("Simmy");

		arrayList.remove("Khaliffa");
		arrayList.remove(1);

		for (String name : arrayList) {
			System.out.println(name);
		}

		System.out.println("________");

		Iterator<String> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		ConnectDB connectDB = new ConnectDB();

		connectDB.InsertDataFromArrayListToMySql(arrayList, "Name", "People");
		try {
			connectDB.readDataBase("Name", "People");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}