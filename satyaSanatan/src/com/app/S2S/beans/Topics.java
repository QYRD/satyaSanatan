package com.app.S2S.beans;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Topics")
@Table(name="Topics")
public class Topics {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String topic;

	public Topics(){}

	public Topics(int id,String topic){
		this.id=id;
		this.topic=topic;		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
}
