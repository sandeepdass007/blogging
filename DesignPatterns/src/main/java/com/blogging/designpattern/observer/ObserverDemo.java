package com.blogging.designpattern.observer;

import com.blogging.designpattern.observer.listener.YouTubeUser;
import com.blogging.designpattern.observer.subject.YouTubeChannel;
import com.blogging.designpattern.observer.user.User;

/**
 * Demonstration of observer design pattern
 * @author Sandeep
 *
 */
public class ObserverDemo {

	public static void main(String[] args) {
		// create a youtube channel with name "sandeepdass003.wordpress.com"
		YouTubeChannel channel1 = new YouTubeChannel("sandeepdass003.wordpress.com");
		// create another youtube channel with name "FinancialReports"
		YouTubeChannel channel2 = new YouTubeChannel("FinancialReports");
		
		/*
		 * Creating users as follows:
		 * user1 - Sandeep 
		 * user2 - Rajesh
		 * user3 - Thomas
		 * user4 - User3829
		 * */
		YouTubeUser user1 = new User("Sandeep");
		YouTubeUser user2 = new User("Rajesh");
		YouTubeUser user3 = new User("Thomas");
		YouTubeUser user4 = new User("User3829");
		
		/*
		 * users subscribing channels:
		 * user1, user2, user3 -> channel1
		 * user4 -> channel2
		 * */
		
		user1.subscribeChannel(channel1);
		user2.subscribeChannel(channel1);
		user3.subscribeChannel(channel1);
		user4.subscribeChannel(channel2);
		
		// Channels uploading new video with respective video name:
		channel1.addNewVideo("What is Observer Design Pattern");
		channel2.addNewVideo("Budget 2020");
	}

}
