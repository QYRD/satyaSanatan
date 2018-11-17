package com.app.S2S.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.Maicategory;
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
public void saveCategory(Maicategory mainCat) {
	dao.saveCategory(mainCat);
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


}
