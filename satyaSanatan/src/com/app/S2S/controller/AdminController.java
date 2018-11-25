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
import com.app.S2S.beans.Topics;

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
		List<Maicategory> ls = udv.getMainCategory();
		request.setAttribute("maincatValues", ls);
		return "home";
	}
	@RequestMapping(value = "Sub-Category", method = RequestMethod.GET)
	public String dashbord(HttpServletRequest request,@RequestParam("val") int id) {
		List<SubCategory> ls = udv.getSubCategoryByID(id);
		Maicategory mainVal=udv.getMainCategory(id);
		request.setAttribute("catName", mainVal.getCatName());
		request.setAttribute("catDiscription", mainVal.getCatDiscription());
		request.setAttribute("subcatValues", ls);
		return "BrowsSubCategory";
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
	public String addsubCategory(HttpServletRequest request,@RequestParam("val") int id) {	
		List<SubCategory> ls = udv.getSubCategoryByID(id);
		request.setAttribute("subcatValues", ls);
		request.setAttribute("val", id);
		return "subCategory";
	}

	@RequestMapping(value = "Add-Sub-Category-Value", method = RequestMethod.POST)
	public String addSubCategoryValue(HttpServletRequest request,@ModelAttribute("subCat") SubCategory subCat,@RequestParam("val") int id) {
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
		request.setAttribute("val", id);
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
		List<Topics> ls = udv.getTopic();
		request.setAttribute("getTopic", ls);
		return "uploadDoc";
	}
	@RequestMapping(value = "Add-Topic", method = RequestMethod.GET)
	public String addTopic(HttpServletRequest request) {
		List<Topics> ls = udv.getTopic();
		request.setAttribute("getTopic", ls);
		return "AddTopic";
	}
	@RequestMapping(value = "Add-Topic-Value", method = RequestMethod.POST)
	public String addTopicValue(HttpServletRequest request,@ModelAttribute("tpc") Topics tpc) {
		udv.saveTopic(tpc);
		List<Topics> ls = udv.getTopic();
		request.setAttribute("getTopic", ls);
		return "AddTopic";
	}

	@RequestMapping(value = "deleteTopics", method = RequestMethod.POST)
	public @ResponseBody int deleteTopics(HttpServletRequest request, @RequestParam("val") int id) {
		int pas=0;
		try{
		udv.removeTopics(id);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return pas;
	}
	@RequestMapping(value = "Update-Main-Category", method = RequestMethod.POST)
	public @ResponseBody int updateMainCategory(HttpServletRequest request,@RequestParam("val") String id) {
		System.out.println("-----------------------S2S----------------------------------");
		return 1;
	}
	@RequestMapping(value = "Upload_document_value", method = RequestMethod.POST)
	public String uploadDocValue(HttpServletRequest request, @ModelAttribute("up") AddUserDocument up) throws MessagingException {
		try {
			AddUserDocument ad=(AddUserDocument) s2s.saveFile(up.getFiles(), path, up, "newFile");
			up.setFileName(ad.getFileName());
			System.out.println(up.getFileName());
			up.setFilePath(ad.getFilePath());
			up.setFlag("n");
			System.out.println(up.getFilePath());
			udv.saveDocument(up);
			} 
		catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			}
		
	    System.out.println("-----------------------S2S Sending Mail----------------------------------");
	    String email=up.getMail();
	    sendmail.sendMail("Delivary Message from SatyaSanatan", "Thank you for sumbit your Document. We will get back to you with in 72 hours", email);
	    List<AddUserDocument> show= udv.getUploadedDocument();
		request.setAttribute("AddUserDocument", show);
		request.setAttribute("Success", 1);
		List<Topics> ls = udv.getTopic();
		request.setAttribute("getTopic", ls);
		return "uploadDoc";
	}
	@RequestMapping(value = "loginPerson", method = RequestMethod.GET)
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

	@RequestMapping(value="ShowMisc", method=RequestMethod.GET)
	String ShowMisc(HttpServletRequest request){
		List<AddUserDocument> show= udv.showMisc();
		request.setAttribute("MiscList", show);

		return"Miscellenous";
	}
	
	@RequestMapping(value="Misc-Approve-Data",method=RequestMethod.POST)
	public @ResponseBody int ApproveFile(HttpServletRequest request, @RequestParam ("val") int id)
	{
		int pos=0;
		AddUserDocument ad=udv.getdata(id);
		ad.setFlag("A");
		System.out.println("Approve");
		udv.saveDocument(ad);
		List<AddUserDocument> list=udv.showMisc();
		request.setAttribute("MiscList", list);
		return pos;
	}
	
	@RequestMapping(value = "Misc-Decline-Data", method = RequestMethod.POST)
	public @ResponseBody int MiscDeclineData(HttpServletRequest request, @RequestParam("val") int id) 
	{
		int pas=0;
			AddUserDocument ad=udv.getdata(id);
		ad.setFlag("D");
		System.out.println("Decline");
		udv.saveDocument(ad);
			List<AddUserDocument> show= udv.showMisc();
		request.setAttribute("MiscList", show);
		return pas;
}
	
	@RequestMapping(value="showApprovedFiles", method=RequestMethod.GET)
	public String showApprovedFiles(HttpServletRequest request)
		{
		List<AddUserDocument> list=udv.showAcceptedFiles();
		request.setAttribute("AcceptedFIles", list);
		return"AcceptedFiles";
		}
	
	@RequestMapping(value="showDeclinedFiles", method=RequestMethod.GET)
	public String showDeclinedFiles(HttpServletRequest request)
		{
		List<AddUserDocument> list=udv.showDeclinedFiles();
		request.setAttribute("DeclinedFiles", list);
		return"DeclinedFiles";
		}

}