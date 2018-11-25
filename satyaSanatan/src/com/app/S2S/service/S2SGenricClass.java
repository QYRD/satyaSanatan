package com.app.S2S.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.apache.poi.POITextExtractor;
import org.apache.poi.extractor.ExtractorFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.txt.TXTParser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.xmlbeans.XmlException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.xml.sax.SAXException;

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
 public String readFile(String pathname) throws IOException {

    File file = new File(pathname);
    StringBuilder fileContents = new StringBuilder((int)file.length());        

    try (Scanner scanner = new Scanner(file)) {
        while(scanner.hasNextLine()) {
            fileContents.append(scanner.nextLine() + System.lineSeparator());
        }
        return fileContents.toString();
        
        
       
        
    }
}
 public String readFile1(String pathname ,String name) throws IOException, InvalidFormatException, OpenXML4JException, XmlException, TikaException, SAXException {
	 BodyContentHandler handler = new BodyContentHandler();
	 AutoDetectParser parser = new AutoDetectParser();

	 
	    Metadata metadata = new Metadata();
	   
	 FileInputStream inputstream = new FileInputStream(new File(pathname));
     ParseContext pcontext=new ParseContext();
     
     //Text document parser
     TXTParser  TexTParser = new TXTParser();
     TexTParser.parse(inputstream, handler, metadata,pcontext);
     System.out.println("Contents of the document:" + handler.toString());
     System.out.println("Metadata of the document:");
     String[] metadataNames = metadata.names();
     
     for(String name1 : metadataNames) {
        System.out.println(name1 + " : " + metadata.get(name));
	
     
     
 }
     return handler.toString();
}
}
