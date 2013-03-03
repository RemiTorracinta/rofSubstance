package com.remitorracinta.rofSubstance;
import com.omrlnr.jreddit.submissions.Submissions;
import com.omrlnr.jreddit.submissions.Submissions.Page;
import com.omrlnr.jreddit.submissions.Submissions.Popularity;
import com.omrlnr.jreddit.user.User;

import com.omrlnr.jreddit.utils.Utils;


public class Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User("username", "password");
        user.connect();

        List<Subreddit> subreddits = Subreddits.list(user, "popular");
        // Alternativly use: Subreddits.listDefault(user);

        for (Subreddit sr : subreddits) {
            System.out.println(sr.getUrl() + " " + sr.getTitle());
        }


	}

}
