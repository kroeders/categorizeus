package us.categorize.communication.query;

import java.util.Arrays;

import us.categorize.model.Tag;

public class ThreadCriteria {
	private Tag[] searchTags = new Tag[]{}; //TODO is it a good idea to introduce a tag categorizeus:id for each top level post?
	private Tag[] transitiveTags = new Tag[]{};
	private int maxResults = 10; //max results for the top level search
	private int maxTransitiveDepth = 3; //number of links to follow, e.g. replies, replies of replies, so forth
	private int maxTransitiveResults = 5; //total number to load for each predicate, so max number of replies to a member
	private Integer startingId = null;
	private boolean reverse = false;
	
	public String toString(){
		String result ="Criteria\n";
		result = result + "Search " + Arrays.toString(searchTags) + " \n ";
		result = result + "Transitive Tags " + Arrays.toString(transitiveTags)+"\n";
		result = result + " starting at " + startingId;
		result = result + " reversed ? " + reverse;
		return result;
	}
	public Tag[] getSearchTags() {
		return searchTags;
	}
	public void setSearchTags(Tag[] searchTags) {
		this.searchTags = searchTags;
	}
	public Tag[] getTransitiveTags() {
		return transitiveTags;
	}
	public void setTransitiveTags(Tag[] transitiveTags) {
		this.transitiveTags = transitiveTags;
	}
	public int getMaxResults() {
		return maxResults;
	}
	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}
	public int getMaxTransitiveDepth() {
		return maxTransitiveDepth;
	}
	public void setMaxTransitiveDepth(int maxTransitiveDepth) {
		this.maxTransitiveDepth = maxTransitiveDepth;
	}
	public int getMaxTransitiveResults() {
		return maxTransitiveResults;
	}
	public void setMaxTransitiveResults(int maxTransitiveResults) {
		this.maxTransitiveResults = maxTransitiveResults;
	}
	public Integer getStartingId() {
		return startingId;
	}
	public void setStartingId(Integer startingId) {
		this.startingId = startingId;
	}
	public boolean isReverse() {
		return reverse;
	}
	public void setReverse(boolean reverse) {
		this.reverse = reverse;
	}
	
	
}
