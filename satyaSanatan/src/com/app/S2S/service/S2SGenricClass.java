package com.app.S2S.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.itextpdf.text.pdf.codec.Base64.OutputStream;

@Service
public class S2SGenricClass {
	
public Object saveFile(CommonsMultipartFile[] file,String path ,Object vi,String fileval) throws InstantiationException, IllegalAccessException{
	Class e = vi.getClass();
	String className = e.getName();
	Object obj = e.newInstance();
	try {
		
	String newPath = "";
	String newfile = "";
	
	if (file != null) {

		for (CommonsMultipartFile fl : file) {
			if (!fl.isEmpty()) {
				File f = new File(path);
				f.mkdirs();
				String filename = fl.getOriginalFilename();
				String ex = filename.substring(filename.lastIndexOf(".") + 1);
				newfile = fileval + "." + ex;
				System.err.println("----" + ex + "-------");
				System.out.println(path + " " + filename);
				newPath = path + "\\" + newfile;
				byte[] bytes = fl.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + newfile)));
				stream.write(bytes);
				stream.flush();
				
					stream.close();
					Method setfilenameVale =e.getMethod("setFileName", String.class);
					setfilenameVale.invoke(obj, newfile);
					Method setfilepath =e.getMethod("setFilePath", String.class);
					setfilepath.invoke(obj, newPath);
				}
			}
		}
	}
		catch (Exception e1) {
					e1.printStackTrace();
				}
				return obj;
				
			
		
		
	}


public String DownloadDoc(HttpServletResponse response, String filePath) throws ServletException, IOException {
			// reads input file from an absolute path
			File downloadFile = new File(filePath);
			FileInputStream inStream = new FileInputStream(downloadFile);
		
			// if you want to use a relative path to context root:
		
			// obtains ServletContext
		
			response.setContentLength((int) downloadFile.length());
		
			// forces download
			response.setContentType("APPLICATION/OCTET-STREAM");   
			response.setHeader("Content-Disposition","attachment; filename=\"" + downloadFile + "\"");
		
			// obtains response's output stream
			ServletOutputStream outStream = response.getOutputStream();
		
			byte[] buffer = new byte[4096];
			int bytesRead = -1;
		
			while ((bytesRead = inStream.read(buffer)) != -1) {
				outStream.write(buffer, 0, bytesRead);
			}
		
			inStream.close();
			outStream.close();
			return filePath;
		}
}
