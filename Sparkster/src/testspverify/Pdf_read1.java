package testspverify;

import java.io.File;
import java.io.IOException;

public class Pdf_read1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Thread.sleep(2000);
	
		
		String path = "C:\\Users\\abhijit.patel\\Downloads\\readpdf";

	     String files;
	     File folder = new File(path);
	     File[] listOfFiles = folder.listFiles();

	     for (int i = 0; i < listOfFiles.length; i++)
	     { 
          Thread.sleep(2000);
	     if (listOfFiles[i].isFile())
	     {
	     files = listOfFiles[i].getName();
	     if (files.endsWith(".pdf") || files.endsWith(".PDF"))
	     {
	     System.out.println(files);
	     String nfiles = "C:\\Users\\abhijit.patel\\Downloads\\readpdf";
	     PDFManager pdfManager = new PDFManager();
	     String pdfToText = pdfManager.pdftoText(nfiles+files);

	     if (pdfToText == null) {
	     System.out.println("PDF to Text Conversion failed.");
	     }
	     else {
	     System.out.println("\nThe text parsed from the PDF Document....\n" + pdfToText);
	     pdfManager.writeTexttoFile(pdfToText,nfiles+files+".txt");
	     }
	     }
	    }
	     }
	}}
