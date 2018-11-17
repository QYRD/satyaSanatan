package com.app.S2S.service;

import java.util.List;

import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.Maicategory;
import com.app.S2S.beans.SubCategory; 

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
	public List<SubCategory> getSubCategoryByID(String id);
}
