package com.app.S2S.dao;

import java.util.List;

import com.app.S2S.beans.AddContent;
import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.Maicategory;
import com.app.S2S.beans.SubCategory;
import com.app.S2S.beans.Topics;

public interface SanatanDaoInteface {
	
	public int login(LoginDetails l);
	public List<LoginDetails> loginId(LoginDetails l);
	public void saveDocument(AddUserDocument addDoc);
	public void saveContact(ContactUs contact);

	
	public void saveMainCategory(Maicategory mainCat);
	public List<Maicategory> getMainCategory();
	public Maicategory getMainCategory(int id);
	public void deleteMainCategory(int id);

	public void saveSubCategory(SubCategory subCat);
	public void deleteSubCategory(int id);
	public List<SubCategory> getSubCategoryByID(int id);
	public SubCategory getSubCategory(int id);
	
	public List<AddUserDocument> getUserDocumentByTopic(String topic);
	public List<AddUserDocument> getUploadedDocument(); 	

	public List<Topics> getTopic();
	public void saveTopic(Topics tpc);
	public void removeTopics(int id);

	public List<AddUserDocument> showAcceptedFiles();
	public AddUserDocument getdata(int id);
	public List<AddUserDocument> showMisc();
	public List<AddUserDocument> showDeclinedFiles();

	public void saveContant(AddContent a);
	public List<AddContent> getaddContent(int id,String lang);
}
