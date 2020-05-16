package com.blogging.designpattern.observer.listener;

import com.blogging.designpattern.observer.subject.YouTubeChannel;

public interface YouTubeUser {
	public void notifyUser(String channelName, String videoName);
	public void subscribeChannel(YouTubeChannel youTubeChannel);
	public void unsubscribeChannel(YouTubeChannel youTubeChannel);	
}
