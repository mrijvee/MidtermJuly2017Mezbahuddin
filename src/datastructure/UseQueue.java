package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> justiceLeageDateOfRelease = new LinkedList<>();

		justiceLeageDateOfRelease.add("Naruto Uzumaki");
		justiceLeageDateOfRelease.add("Floyd Mayweather");
		justiceLeageDateOfRelease.add("Mez Rij");
		justiceLeageDateOfRelease.offer("Kevin Nash");

		System.out.println("Unfortunately, " + justiceLeageDateOfRelease.peek() + " won't make it to the movie due to his budget");
		justiceLeageDateOfRelease.remove("Kevin Nash");
		justiceLeageDateOfRelease.poll();
		System.out.println(justiceLeageDateOfRelease.element() + " won't make it either as he's got a match on 11/17/17");
		justiceLeageDateOfRelease.poll();

		for(String n: justiceLeageDateOfRelease) {
			System.out.println("Good news!!! " + n + " has bought the ticket for the Justice League movie which releases November 17, 2017");
		}

		System.out.println("_________________________________________________________________________________________________________________");

		Iterator<String> it = justiceLeageDateOfRelease.iterator();
		while (it.hasNext()) {
			System.out.println("Looks like " + it.next() + " will be the only one to make it to the movie on 11/17/17");
		}
	}
}
