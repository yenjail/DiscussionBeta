package model;

public class CommentsModel {
	private int postID;
	private String username;
	private String commento;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getComments() {
		return commento;
	}
	public void setCommento(String commento) {
		this.commento = commento;
	}
	public int getPostID() {
		return postID;
	}
	public void setPostID(int postID) {
		this.postID = postID;
	}
	
}
