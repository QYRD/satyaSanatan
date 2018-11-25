package com.app.S2S.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.S2S.beans.AddContent;
import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.Maicategory;
import com.app.S2S.beans.SubCategory;
import com.app.S2S.beans.Topics;
import com.app.S2S.dao.SanatanDao;

@Service
@Transactional
public class UserDataValue implements UserData {
@Autowired
SanatanDao dao;

@Override
public void saveContact(ContactUs contact){
	
	dao.saveContact(contact);
	
	
}
 
@Override
public int login(LoginDetails l) {
	return dao.login(l);
}

@Override
public List<LoginDetails> loginId(LoginDetails l) {
	return dao.loginId(l);
}

@Override
public void saveDocument(AddUserDocument addDoc) {
	
	dao.saveDocument(addDoc); 
	}

@Override
public List<Maicategory> getMainCategory() {	
	return dao.getMainCategory();
}

public void deleteMainCategory(int id) {
	dao.deleteMainCategory(id);	
}

@Override
public Maicategory getMainCategory(int id) {

	return dao.getMainCategory(id);
}

@Override
public void saveMainCategory(Maicategory maiCat) {
	dao.saveMainCategory(maiCat);	
}

@Override
public void saveSubCategory(SubCategory subCat) {
	dao.saveSubCategory(subCat);		
}


@Override
public List<SubCategory> getSubCategoryByID(int id) {
	return dao.getSubCategoryByID(id);
}

@Override
public void deleteSubCategory(int id) {
	dao.deleteSubCategory(id);	
}

@Override
public SubCategory getSubCategory(int id) {
	return dao.getSubCategory(id);
}

public List<AddUserDocument> getUploadedDocument() {
	return dao.getUploadedDocument();
}

@Override
public List<Topics> getTopic() {
	return dao.getTopic();
}

@Override
public void saveTopic(Topics tpc) {
	 dao.saveTopic(tpc);
	
}

@Override
public void removeTopics(int id) {
	dao.removeTopics(id);	
	
}

@Override
public List<AddUserDocument> showAcceptedFiles() {
	return dao.showAcceptedFiles();
}

@Override
public AddUserDocument getdata(int id) {
	return dao.getdata(id);
}

@Override
public List<AddUserDocument> showMisc() {
	return dao.showMisc();
}

@Override
public List<AddUserDocument> showDeclinedFiles() {
	return dao.showDeclinedFiles();
}

@Override
public List<AddContent> getaddContent(int id, String lang) {
	return dao.getaddContent(id,lang);
}

@Override
public void saveContant(AddContent a) {
	dao.saveContant(a);	
	
}


}
