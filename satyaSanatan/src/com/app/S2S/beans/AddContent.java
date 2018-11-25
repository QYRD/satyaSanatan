package com.app.S2S.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity(name="AddContent")
@Table(name="AddContent")
public class AddContent {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String fileDiscription;
	@Column
	private String language;
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Column
	private int sID;
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public CommonsMultipartFile[] getFiles() {
		return files;
	}
	public void setFiles(CommonsMultipartFile[] files) {
		this.files = files;
	}
	@Column
	private String fileName;
	@Column
	private String filePath;
	@Transient
	public CommonsMultipartFile[] files;
}
