package com.staples.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(new Topic("1", "Spring", "Spring Description"),
			new Topic("2", "Angular", "Angular Description"));
	
	public List<Topic> getAllTopics(){
		return topics;
	}

}
