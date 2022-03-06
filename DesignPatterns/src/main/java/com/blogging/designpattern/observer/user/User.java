package com.blogging.designpattern.observer.user;

import com.blogging.designpattern.observer.listener.YouTubeUser;
import com.blogging.designpattern.observer.subject.YouTubeChannel;

/**
 * Hypothetical representation of YouTube User
 * @author Sandeep
 *
 */
public class User implements YouTubeUser {
	// name of the user
	private String name; 

	/**
	 * returns name of the user
	 * @return name
	 */
	public String getName() {   
		return name;
	}

	/**
	 * create user with parameterized name
	 * @param name
	 */
	public User(String name) {   
		super();
		this.name = name;
	}

	/**
	 * This method is invoked by {@link YouTubeChannel} to notify when new video is uploaded.
	 */
	@Override
	public void notifyUser(String channelName, String videoName) {   
		System.out.println(String.format("New video [%s] is uploaded by channel: [%s]", videoName, channelName));
	}

	/**
	 * Subscribe a channel by the user
	 */
	@Override
	public void subscribeChannel(YouTubeChannel youTubeChannel) {   
		youTubeChannel.addUser(this);
	}

	/**
	 * Unsubscribe a channel by the user
	 */
	@Override
	public void unsubscribeChannel(YouTubeChannel youTubeChannel) {  
		youTubeChannel.removeUser(this);
	}
}
