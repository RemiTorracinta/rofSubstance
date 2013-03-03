package com.remitorracinta.rofSubstance;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import com.omrlnr.jreddit.subreddit.*;
import com.omrlnr.jreddit.user.User;
import com.omrlnr.jreddit.utils.Utils;


public class Lists {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/password.txt");
		File actsub = new File("src/act.sub.txt");
		Scanner scanner = new Scanner(file);
		String password = scanner.nextLine();
		scanner.close();
		User user = new User("RedditsOfSubstance", password);
		Utils.setUserAgent("RedditsofSubstance V0.1");
		
        try {
			user.connect();
		} catch (Exception e) {
			System.out.println("Couldn't connect!");
			e.printStackTrace();
		}

        List<Subreddit> subreddits = Subreddits.list(user, "popular");
        List<Subreddit> actSubList = subreddits
        		
        
        fout = new FileWriter(
        	    "Distribution_" + Double.toString(_lowerBound) + "_" + Double.toString(_highBound) + ".txt");
        	    fileout = new PrintWriter(fout,true);
        fileout.print(now.getTime().toString() + ", " + weight + ","+ count +"\n");
        fileout.close();
        /*for (Subreddit sr : subreddits) {
            System.out.println(sr.getUrl() + " " + sr.getTitle());
        }
        */

	}

}
