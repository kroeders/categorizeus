package us.categorize.model;

import java.util.LinkedList;
import java.util.List;

public class MessageThread {
	private List<Message> thread = new LinkedList<>();
	private ThreadCriteria searchCriteria;
	private List<MessageRelation> relations= new LinkedList<>();
	
	
	public String toString(){
		String result = "All Messages In Thread";
		for(Message message:thread){
			result = result + ","+message.getId();
		}
		result = result +"\n Relationships Involved \n";
		for(MessageRelation relation: relations){
			
		}
		return result;
	}
	
	public List<Message> getThread() {
		return thread;
	}
	public void setThread(List<Message> thread) {
		this.thread = thread;
	}
	public ThreadCriteria getSearchCriteria() {
		return searchCriteria;
	}
	public void setSearchCriteria(ThreadCriteria searchCriteria) {
		this.searchCriteria = searchCriteria;
	}
	public List<MessageRelation> getRelations() {
		return relations;
	}
	public void setRelations(List<MessageRelation> relations) {
		this.relations = relations;
	}
}
