package com.blogging.designpattern.observer.subject;

import java.util.HashSet;
import java.util.Set;

import com.blogging.designpattern.observer.listener.YouTubeUser;
import com.blogging.designpattern.observer.user.User;

/**
 * Hypothetical representation of YouTube channel for better understanding
 * @author Sandeep
 *
 */
public class YouTubeChannel {
	// Using set to have unique set of YouTube users
	private Set<YouTubeUser> subscribedUsers = new HashSet<YouTubeUser>();
	
	// Name of channel
	private String channelName; 
	
	/**
	 * Create a YouTube channel
	 * @param channelName
	 */
	public YouTubeChannel(String channelName) {    
		super();
		this.channelName = channelName;
	}

	/**
	 * Hypothetical representation of new video upload to the channel
	 * @param videoName
	 */
	public void addNewVideo(String videoName) {   
		System.out.println("New Video Added: " + videoName);
		notifyAllSubscribers(videoName);
	}
	
	/**
	 * Hypothetical representation of adding users
	 * @param youTubeUser
	 */
	public void addUser(YouTubeUser youTubeUser) {  
		subscribedUsers.add(youTubeUser);
	}
	
	/**
	 * Notifying all the subscribed users
	 * @param videoName
	 */
	private void notifyAllSubscribers(String videoName) {  
		// Iterate over each subscribed user
		subscribedUsers.forEach(subscribedUser -> {
			// failure in notifying one user should not impact others
			new Thread(() -> {
				try {
					System.out.println("Notifying User: " + ((User)subscribedUser).getName());
					subscribedUser.notifyUser(channelName, videoName);
				} catch(Exception exception) {
					System.out.println("Error while notifying the user!");
				}
			}).start();
		});
	}

	/**
	 * function to remove user
	 * @param user
	 */
	public void removeUser(User user) {   
		subscribedUsers.remove(user);
	}
}
