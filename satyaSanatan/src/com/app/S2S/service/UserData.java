package com.app.S2S.service;

import java.util.List;

import com.app.S2S.beans.AddContent;
import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.Maicategory;
import com.app.S2S.beans.SubCategory;
import com.app.S2S.beans.Topics; 

public interface UserData {
	
	public void saveContact(ContactUs contact);
	
	public int login(LoginDetails l);
	public List<LoginDetails> loginId(LoginDetails l);
	
	public void saveDocument(AddUserDocument addDoc);
	
	public void saveMainCategory(Maicategory mainCat);
	public List<Maicategory> getMainCategory();
	public void deleteMainCategory(int id);
	public Maicategory getMainCategory(int id);

	public void saveSubCategory(SubCategory mainCat);
	public void deleteSubCategory(int id);
	public SubCategory getSubCategory(int id);
	public List<SubCategory> getSubCategoryByID(int id);

	public List<AddUserDocument> getUploadedDocument();

	public List<Topics> getTopic();
	public void saveTopic(Topics tpc);
	public void removeTopics(int id);	

	public List<AddUserDocument> showAcceptedFiles();
	public AddUserDocument getdata(int id);
	public List<AddUserDocument> showMisc();
	public List<AddUserDocument> showDeclinedFiles();
	
	public List<AddContent> getaddContent(int id ,String lang);
	public void saveContant(AddContent a);

}
