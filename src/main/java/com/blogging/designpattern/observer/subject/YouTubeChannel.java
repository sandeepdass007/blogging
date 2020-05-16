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
	private Set<YouTubeUser> subscribedUsers = new HashSet<YouTubeUser>();
	private String channelName;
	
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

	public void removeUser(User user) {
		subscribedUsers.remove(user);
	}
}
