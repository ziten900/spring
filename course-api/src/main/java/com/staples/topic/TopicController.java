package com.staples.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> gerAllTopics() {
		return Arrays.asList(new Topic("1", "Spring", "Spring Description"),
				new Topic("2", "Angular", "Angular Description"));
	}

}
