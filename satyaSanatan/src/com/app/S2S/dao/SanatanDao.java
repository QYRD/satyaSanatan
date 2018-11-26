package com.app.S2S.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.Maicategory;
import com.app.S2S.beans.SubCategory;
import com.app.S2S.beans.Topics;
import com.app.S2S.beans.AddContent;
import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
@Repository
public class SanatanDao implements SanatanDaoInteface {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveContact(ContactUs contact) {
		
sessionFactory.getCurrentSession().saveOrUpdate(contact);
		
	}
	@Override
	public int login(LoginDetails l) {

		int count = ((Long) sessionFactory.getCurrentSession()
				.createQuery("select count(*) from LoginDetails where password= '"+l.getPassword()+"' and username= '"+l.getUsername()+"'")
				.uniqueResult()).intValue();
		return count;
	}
	
	@Override
	public List<LoginDetails> loginId(LoginDetails l) {
		Query query = sessionFactory.getCurrentSession()
				.createQuery("from LoginDetails where password=:pass and username=:user");
		query.setParameter("user", l.getUsername());
		query.setParameter("pass", l.getPassword());
		List<LoginDetails> list = ((org.hibernate.query.Query) query).list();
		return list;
	}
	@Override
	public void saveDocument(AddUserDocument addDoc) {
		sessionFactory.getCurrentSession().saveOrUpdate(addDoc);	
	}
	
	@Override
	public void saveMainCategory(Maicategory mainCat) {
		sessionFactory.getCurrentSession().saveOrUpdate(mainCat);		
	}

	@Override
	public List<Maicategory> getMainCategory() {
	Query query = sessionFactory.getCurrentSession().createQuery("from Maicategory");
	List<Maicategory> ls = ((org.hibernate.query.Query) query).list();
	return ls;	
	}

	public void deleteMainCategory(int id)
	{
	    try
	    {           
	    	Query query=sessionFactory.getCurrentSession().createQuery("delete from Maicategory where id=:val");  
	        query.setParameter("val", id);
	        query.executeUpdate();        
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
   
}
	@Override
	public Maicategory getMainCategory(int id) {
		return sessionFactory.getCurrentSession().get(Maicategory.class,id);
	}
	
	
	@Override
	public void saveSubCategory(SubCategory subCat) {
		sessionFactory.getCurrentSession().saveOrUpdate(subCat);
	}

	@Override
	public void deleteSubCategory(int id) {
	    try
	    {           
	    	Query query=sessionFactory.getCurrentSession().createQuery("delete from SubCategory where id=:val");  
	        query.setParameter("val", id);
	        query.executeUpdate();        
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
   
		
	}
	@Override
	public SubCategory getSubCategory(int id) {
		return sessionFactory.getCurrentSession().get(SubCategory.class,id);
	}

	@Override
	public List<SubCategory> getSubCategoryByID(int id) {
		Query query = sessionFactory.getCurrentSession().createQuery("from SubCategory where mainCatId=:id" );
		query.setParameter("id", id);
		List<SubCategory> ls = ((org.hibernate.query.Query) query).list();
		return ls;
}
	public List<AddUserDocument> getUploadedDocument() {
		Query query = sessionFactory.getCurrentSession().createQuery("from AddUserDocument");
		List<AddUserDocument> ls = ((org.hibernate.query.Query) query).list();
		return ls;	
	}
	@Override
	public List<Topics> getTopic() {
		Query query = sessionFactory.getCurrentSession().createQuery("from Topics");
		List<Topics> ls = ((org.hibernate.query.Query) query).list();
		return ls;	
	}
	@Override
	public void saveContant(AddContent a) {
		 sessionFactory.getCurrentSession().saveOrUpdate(a);
	}

	@Override
	public void saveTopic(Topics tpc) {
		sessionFactory.getCurrentSession().saveOrUpdate(tpc);			
	}

	public void removeTopics(int id)
	{
	    try
	    {           
	    	Query query=sessionFactory.getCurrentSession().createQuery("delete from Topics where id=:val");  
	        query.setParameter("val", id);
	        query.executeUpdate();        
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	
}
	@Override
	public List<AddUserDocument> showMisc()
	{
		Query query=sessionFactory.getCurrentSession().createQuery("from AddUserDocument where flag<>'D' and flag<>'A'");
		List<AddUserDocument> list=((org.hibernate.query.Query) query).list();
		return list;
	}
	@Override
	public List<AddContent> getaddContent(int id ,String lang) {
		Query query = sessionFactory.getCurrentSession().createQuery("from AddContent where sID='"+id+"' and language='"+lang+"'");
		List<AddContent> ls = ((org.hibernate.query.Query) query).list();
		return ls;	
	
	}

	
	@Override
	public AddUserDocument getdata(int id)
	{
		return sessionFactory.getCurrentSession().get(AddUserDocument.class,id);
	}
	
	@Override
	public List<AddUserDocument> showAcceptedFiles()
	{
		String flag="A";
	Query query=sessionFactory.getCurrentSession().createQuery("from AddUserDocument where Flag=:val");
	query.setParameter("val", flag);
	List<AddUserDocument> list=((org.hibernate.query.Query) query).list();
	return list;
	}
	
	public List<AddUserDocument> showDeclinedFiles()
	{
		String flag="D";
		Query query=sessionFactory.getCurrentSession().createQuery("from AddUserDocument where Flag=:val");
		query.setParameter("val", flag);
		List<AddUserDocument> list=((org.hibernate.query.Query) query).list();
		return list;

	}
	@Override
	public List<AddUserDocument> getUserDocumentByTopic(String topic) {
		Query query = sessionFactory.getCurrentSession().createQuery("from AddUserDocument where topic=:tpc and flag='A'" );
		query.setParameter("tpc", topic);
		List<AddUserDocument> ls = ((org.hibernate.query.Query) query).list();
		return ls;
	}

}
