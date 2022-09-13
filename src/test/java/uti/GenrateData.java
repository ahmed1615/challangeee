package uti;

import java.util.Random;

public class GenrateData { 
	public static String genrate() {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(5);
		for (int i = 0; i < 5; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}
	 public static String genrtaephone() {
	     String nums="0123456789";
		 Random rand = new Random();
	     StringBuilder sb = new StringBuilder(5);
			for (int i = 0; i < 10; i++)
				sb.append(nums.charAt(rand.nextInt(nums.length())));
			return sb.toString();
	        
	    }
}
 