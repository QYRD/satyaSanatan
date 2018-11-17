package com.app.S2S.dao;

import java.util.List;

import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.Maicategory;

public interface SanatanDaoInteface {
	
	public void saveContact(ContactUs contact);
	public int login(LoginDetails l);
	public List<LoginDetails> loginId(LoginDetails l);
	public void saveDocument(AddUserDocument addDoc);
	public void saveCategory(Maicategory mainCat);
	public List<Maicategory> getMainCategory();
	public Maicategory getMainCategory(int id);
	public void deleteMainCategory(int id);

}
