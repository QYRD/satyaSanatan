package com.app.S2S.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity(name="AddUserDocument")
@Table(name="AddUserDocument")
public class AddUserDocument {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column 
	private String mobile;
	@Column
	private String mail;
	@Column
	private String fileDiscription;
	@Column
	private String fileName;
	@Column
	private String filePath;
	@Column
	private String topic;
	@Column
	private String flag;

	@Transient
	public CommonsMultipartFile[] files;
	public CommonsMultipartFile[] getFiles() {
		return files;
	}
	public void setFiles(CommonsMultipartFile[] files) {
		this.files = files;
	}
	public AddUserDocument(int id,String name,String mobile,String mail,String fileDiscription,String fileName,String filePath,String topic,String flag){
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.mail=mail;
		this.fileDiscription=fileDiscription;
		this.fileName=fileName;
		this.filePath=filePath;
		this.topic=topic;
		this.flag=flag;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getFileDiscription() {
		return fileDiscription;
	}
	public void setFileDiscription(String fileDiscription) {
		this.fileDiscription = fileDiscription;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

	public AddUserDocument()
	{
		
	}

}
