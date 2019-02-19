package testspverify;


import java.io.IOException;

public class Pdf_extract {

	public static void main(String[] args) throws IOException {
		PDFManager pdfManager = new PDFManager();
	       pdfManager.setFilePath("C:\\2r4r.pdf");
	       System.out.println(pdfManager.ToText());     
		 

	} }
 

