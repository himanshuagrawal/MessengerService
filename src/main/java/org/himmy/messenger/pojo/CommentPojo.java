package org.himmy.messenger.pojo;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CommentPojo {

	private int messageId;
	private int commentId;
	private String message;
	private String author;
	private Date dateOfCreation;
	private int likes;

	public CommentPojo() {
	}

	public CommentPojo(int messageId, int commentId, String message, String author, Date dateOfCreation, int likes) {
		super();
		this.messageId = messageId;
		this.commentId = commentId;
		this.message = message;
		this.author = author;
		this.dateOfCreation = dateOfCreation;
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "CommentPojo [messageId=" + messageId + ", commentId=" + commentId + ", message=" + message + ", author="
				+ author + ", dateOfCreation=" + dateOfCreation + ", likes=" + likes + "]";
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

}
