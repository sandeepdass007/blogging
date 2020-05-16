package com.blogging.designpattern.observer.user;

import com.blogging.designpattern.observer.listener.YouTubeUser;
import com.blogging.designpattern.observer.subject.YouTubeChannel;

/**
 * Hypothetical representation of YouTube User
 * @author Sandeep
 *
 */
public class User implements YouTubeUser {
	private String name;

	public String getName() {
		return name;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public void notifyUser(String channelName, String videoName) {
		System.out.println(String.format("New video [%s] is uploaded by channel: [%s]", videoName, channelName));
	}

	@Override
	public void subscribeChannel(YouTubeChannel youTubeChannel) {
		youTubeChannel.addUser(this);
	}

	@Override
	public void unsubscribeChannel(YouTubeChannel youTubeChannel) {
		youTubeChannel.removeUser(this);
	}
}
