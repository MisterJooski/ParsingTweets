/*
 *
 * Purpose: The purpose of this program is to help structure tweets
 * through a process to make easier for computers to classify them.
 * The idea behind this is known as "Tweak the Tweet" (TtT) where
 * "hastags" are utilized to mark information.
 *
 */

import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		
		//Set Scanner
		Scanner keyboard = new Scanner(System.in);
		//Enter the input
		System.out.println("Enter a tweet below");
		
		//Establish String, slice using substring, make upper cases
		//The additional String is used to assign and use the sliced substring
		String type = keyboard.nextLine();
		String type1;
		int end = type.indexOf(";");
		type1 = type.substring(5,end);
		type1 = type1.toUpperCase();
		
		//Establish new String, assign to previous String, slice using indexOf and substring
		String det;
		String det1;
		det = type.substring(end);
		det = det.substring(2);
		int end2 = det.indexOf(";");
		det1 = det.substring(5,end2);
		
		//Repeat same process of new String and slice
		String loc;
		String loc1;
		loc = det.substring(end2);
		loc = loc.substring(2);
		int end3 = loc.indexOf(";");
		loc1 = loc.substring(5,end3);
		
		//Repeat same process of new String and slice
		String lat;
		String lat1;
		lat = loc.substring(end3);
		lat = lat.substring(2);
		int end4 = lat.indexOf(";");
		lat1 = lat.substring(5,end4);
		
		//Repeat same process of new String and slice
		String lng;
		String lng1;
		lng = lat.substring(end4);
		lng = lng.substring(2);
		int end5 = lng.indexOf(";");
		lng1 = lng.substring(5,end5);
		
		//Print individual Strings
		// String loc1 (location), replace() is used to replace "," with "-"
		System.out.println("Type:\t\t" + type1);
		System.out.println("Detail:\t\t " + det1);
		System.out.println("Location:\t " + loc1.replace(",", "-"));
		System.out.println("Latitude:\t " + lat1);
		System.out.println("Longitude:\t" + lng1);
		
		/*
		 * Although I did not use the Trim() method, the example below
		 * is the structure if it were used for this coding process
			String det;
			String det1;
			det = type.substring(end);
			det = det.substring(1);
			det = det.trim();
			int end2 = det.indexOf(";");
			det1 = det.substring(5,end2);
		 */
	}

}
