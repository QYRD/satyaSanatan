package com.app.S2S.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity(name="Maicategory")
@Table(name="Maicategory")
public class Maicategory {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String catName;
	@Column
	private String catTitle;
	@Column
	private String catDiscription;
	@Transient
	public CommonsMultipartFile[] files;
	@Column
	private String fileName;
	@Column
	private String filePath;


	public Maicategory(){}
	public Maicategory(int id ,String catDiscription,String CatName,String fileName,String filePath,String catTitle){
		this.catDiscription=catDiscription;
		this.id=id;
		this.catName=catName;
		this.fileName=fileName;
		this.filePath=filePath;
		this.catTitle=catTitle;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatDiscription() {
		return catDiscription;
	}
	public void setCatDiscription(String catDiscription) {
		this.catDiscription = catDiscription;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
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
	public String getCatTitle() {
		return catTitle;
	}
	public void setCatTitle(String catTitle) {
		this.catTitle = catTitle;
	}

}
