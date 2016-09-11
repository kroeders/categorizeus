package us.categorize.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Message {
	private Map<Tag, List<Message>> relatedMessages = new HashMap<>();
	private String title;
	private String body;
	private User postedBy;
	private long id;
	private String link;
	
	public String toString(){
		return id+":"+title+":"+body+":"+postedBy;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Map<Tag, List<Message>> getRelatedMessages() {
		return relatedMessages;
	}
	public void setRelatedMessages(Map<Tag, List<Message>> relatedMessages) {
		this.relatedMessages = relatedMessages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public User getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
