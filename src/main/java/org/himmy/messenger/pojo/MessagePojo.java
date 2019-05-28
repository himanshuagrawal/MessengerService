package org.himmy.messenger.pojo;

import java.util.Date;
import java.util.List;


import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class MessagePojo {

	@Override
	public String toString() {
		return "MessagePojo [messageId=" + messageId + ", message=" + message + ", author=" + author
				+ ", dateOfCreation=" + dateOfCreation + ", likes=" + likes + ", replies=" + replies + ", comments="
				+ comments + "]";
	}

	private int messageId;
	private String message;
	private String author;
	private Date dateOfCreation;
	private int likes;
	private int replies;
	private List<CommentPojo> comments;

	public MessagePojo() {
	}

	public MessagePojo(int messageId, String message, String author, Date dateOfCreation, int likes, int replies,
			List<CommentPojo> comments) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.author = author;
		this.dateOfCreation = dateOfCreation;
		this.likes = likes;
		this.replies = replies;
		this.comments = comments;
	}

	public List<CommentPojo> getComments() {
		return comments;
	}

	public void setComments(List<CommentPojo> comments) {
		this.comments = comments;
	}

	public int getMessageId() {
		return messageId;
	}

	public int getLikes() {
		return likes;
	}

	public int getReplies() {
		return replies;
	}

	public void setReplies(int replies) {
		this.replies = replies;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

}
