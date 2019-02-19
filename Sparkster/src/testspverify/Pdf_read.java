package testspverify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;



public class Pdf_read {

	public static void main(String[] args) throws IOException {
    
		  try {
		        InputStream file = new FileInputStream(new    File("C:\\2r4r.pdf"));
		       
		        FileOutputStream copy = new FileOutputStream("C:\\saftoutput\\concatenatedforms.pdf");
		        int b;
		        while ((b = file.read()) != -1) {
		            copy.write(b);
		        }
		        file.close();
		    } catch(Exception e) {
		        System.out.println(e);
	
   

	}

	}}
 