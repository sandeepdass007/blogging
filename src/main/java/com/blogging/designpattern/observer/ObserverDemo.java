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
		YouTubeChannel channel1 = new YouTubeChannel("sandeepdass003.wordpress.com");
		YouTubeChannel channel2 = new YouTubeChannel("FinancialReports");
		
		YouTubeUser user1 = new User("Sandeep");
		YouTubeUser user2 = new User("Rajesh");
		YouTubeUser user3 = new User("Thomas");
		YouTubeUser user4 = new User("User3829");
		
		channel1.subscribeChannel(user1);
		channel1.subscribeChannel(user2);
		channel1.subscribeChannel(user3);
		
		channel2.subscribeChannel(user4);
		
		channel1.addNewVideo("What is Observer Design Pattern");
		channel2.addNewVideo("Budget 2020");
	}

}
