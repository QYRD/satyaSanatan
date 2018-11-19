package com.app.S2S.controller;

import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.S2S.beans.AddUserDocument;
import com.app.S2S.beans.ContactUs;
import com.app.S2S.service.S2SGenricClass;
import com.app.S2S.service.SendMail;
import com.app.S2S.service.UserDataValue;
import com.app.S2S.beans.LoginDetails;
import com.app.S2S.beans.Maicategory;
import com.app.S2S.beans.SubCategory;

@Controller
public class AdminController {
	@Autowired
	SendMail sendmail;

	@Autowired
	UserDataValue udv;
	@Autowired
	S2SGenricClass s2s;
	@Autowired
	@Value("${pathForDoc}")
	String path;
	@Value("${retrivepath}")
	String fileURL;
	
	
	private HttpSession session;

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String ragistration(HttpServletRequest request) {
		System.out.println("________________________"+fileURL);
		System.out.println("h......");
		return "home";
	}
	@RequestMapping(value = "dashbord", method = RequestMethod.GET)
	public String dashbord(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "AdminDashboard";
	}

	@RequestMapping(value = "Dashboard", method = RequestMethod.GET)
	public String dashboard(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "Dashboard";
	}
	@RequestMapping(value = "Add-Main-Category", method = RequestMethod.GET)
	public String addMainCategory(HttpServletRequest request,@ModelAttribute("mainCat") Maicategory mainCat) {
		List<Maicategory> ls = udv.getMainCategory();
		request.setAttribute("maincatValues", ls);
		System.out.println("-----------------------S2S----------------------------------");
		return "AddCategory";
	}
	
	@RequestMapping(value = "Add-Main-Category-Value", method = RequestMethod.POST)
	public String addMainCategoryValue(HttpServletRequest request,@ModelAttribute("mainCat") Maicategory mainCat) {
		try {
			Maicategory mc=(Maicategory) s2s.saveFile(mainCat.getFiles(), path, mainCat, "newFile");
		mainCat.setFileName(mc.getFileName());
		mainCat.setFilePath(mc.getFilePath()); 
		udv.saveMainCategory(mainCat);
		} 
		catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		List<Maicategory> ls = udv.getMainCategory();
		request.setAttribute("maincatValues", ls);
		return "AddCategory";
	}

	@RequestMapping(value = "deleteMainCat", method = RequestMethod.POST)
	public @ResponseBody int deleteMainCat(HttpServletRequest request, @RequestParam("val") int id) {
		int pas=0;
		try{
		udv.deleteMainCategory(id);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return pas;

	}

	@RequestMapping(value = "Get-Main-Category", method = RequestMethod.POST)
	public @ResponseBody Maicategory getMainCategory(HttpServletRequest request,@RequestParam("val") int id) {
		return udv.getMainCategory(id);
	}

	
	@RequestMapping(value = "Add-Sub-Category", method = RequestMethod.GET)
	public String addsubCategory(HttpServletRequest request,@RequestParam("id" ) int id) {	
		List<SubCategory> ls = udv.getSubCategoryByID(id);
		request.setAttribute("subcatValues", ls);
		return "subCategory";
	}

	@RequestMapping(value = "Add-Sub-Category-Value", method = RequestMethod.POST)
	public String addSubCategoryValue(HttpServletRequest request,@ModelAttribute("subCat") SubCategory subCat,@RequestParam("id") int id) {
		try {
			SubCategory sc=(SubCategory) s2s.saveFile(subCat.getFiles(), path, subCat, "newFile");
		subCat.setFileName(sc.getFileName());
		subCat.setFilePath(sc.getFilePath()); 
		udv.saveSubCategory(subCat);

		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		List<SubCategory> ls = udv.getSubCategoryByID(id);
		request.setAttribute("subcatValues", ls);
		return "subCategory";
	}
	
	@RequestMapping(value = "deleteSubCat", method = RequestMethod.POST)
	public @ResponseBody int deleteSubCat(HttpServletRequest request, @RequestParam("val") int id) {
		int pas=0;
		try{
		udv.deleteSubCategory(id);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return pas;
	}
	@RequestMapping(value = "Get-Sub-Category", method = RequestMethod.POST)
	public @ResponseBody SubCategory getSubCategory(HttpServletRequest request,@RequestParam("val") int id) {
		return udv.getSubCategory(id);
	}

	
	@RequestMapping(value = "Contact_US", method = RequestMethod.GET)
	public String contactUs(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "ContactUs";
	}
	
	@RequestMapping(value = "getContactUsInfo", method = RequestMethod.GET)
	public String getContact(@ModelAttribute("contact") ContactUs contact,HttpServletRequest request) throws MessagingException {
		System.out.println(contact.getName());
		udv.saveContact(contact);
		sendmail.sendMail("Thank You", "Thank You for your Feedback", contact.getEmail());
		String msg= "thankyou";
		request.setAttribute("msge",msg);
		return "ContactUs";
	}
	@RequestMapping(value = "About_Us", method = RequestMethod.GET)
	public String about(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "about";
	}
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "login";
	}
	@RequestMapping(value = "Upload_document", method = RequestMethod.GET)
	public String uploadDoc(HttpServletRequest request) {
		System.out.println("-----------------------S2S----------------------------------");
		return "uploadDoc";
	}
	@RequestMapping(value = "Update-Main-Category", method = RequestMethod.POST)
	public @ResponseBody int updateMainCategory(HttpServletRequest request,@RequestParam("val") String id) {
		System.out.println("-----------------------S2S----------------------------------");
		return 1;
	}
	@RequestMapping(value = "Upload_document_value", method = RequestMethod.POST)
	public String uploadDocValue(HttpServletRequest request,@ModelAttribute("up") AddUserDocument up) {
		try {
			AddUserDocument ad=(AddUserDocument) s2s.saveFile(up.getFiles(), path, up, "newFile");
		up.setFileName(ad.getFileName());
		up.setFilePath(ad.getFilePath()); 
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------S2S----------------------------------");
		return "uploadDoc";
	}
	@RequestMapping(value = "loginPerson", method = RequestMethod.POST)
	public String loginPerson(HttpServletRequest request,@ModelAttribute("login") LoginDetails login) {
		int value=udv.login(login);
		if(value!=0)
		{
		List<LoginDetails>auth=udv.loginId(login);
		LoginDetails ld=auth.get(0);
		session.setAttribute("userObj",ld.getId());
		return "Dashboard";
		}
		request.setAttribute("errorMessage","Username or Password is incorrect." );
		return "login";
	}		
}