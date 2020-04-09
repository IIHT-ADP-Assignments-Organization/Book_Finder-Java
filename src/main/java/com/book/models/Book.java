package com.book.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Book")
public class Book {
	@Id
	   @Column(name="bookId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int bookId;
	
	@Column(name="title")
	String title;
	
	@Column(name="Author")
	String	Author;
	
	@Column(name="ISBN")
	long ISBN ;
	
	@Column(name="PublishedDate")
	Date PublishedDate;
	
	@Column(name="coverPageUrl")
	String coverPageUrl;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public Date getPublishedDate() {
		return PublishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		PublishedDate = publishedDate;
	}
	public String getCoverPageUrl() {
		return coverPageUrl;
	}
	public void setCoverPageUrl(String coverPageUrl) {
		this.coverPageUrl = coverPageUrl;
	}

}