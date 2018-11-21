 package com.app.S2S.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity(name="SubCategory")
@Table(name="SubCategory")
public class SubCategory {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private int mainCatId;
	@Column
	private String catName;
	@Column
	private String catTitle;
	@Column
	private String catDiscription;
	@Column
	private String fileName;
	@Column
	private String filePath;
	@Transient
	public CommonsMultipartFile[] files;
	public SubCategory(){}
	public SubCategory(int id ,String catDiscription,String catName,String fileName,String filePath, String catTitle, int mainCatId){
		this.catDiscription=catDiscription;
		this.id=id;
		this.mainCatId=mainCatId;
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
	public int getMainCatId() {
		return mainCatId;
	}
	public void setMainCatId(int mainCatId) {
		this.mainCatId = mainCatId;
	}

}
