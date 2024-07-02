package DDT;

import java.io.File;

import javax.print.Doc;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline;
import org.apache.pdfbox.text.PDFTextStripper;

public class FetchingDataFormPDF {

	public static void main(String[] args)  throws Throwable {
	File file = new File("./src/test/resources/2. Introduction to Web application.pdf")	;
	PDDocument doc = PDDocument.load(file);
	int pages = doc.getNumberOfPages();
	
	PDFTextStripper pdfdata = new PDFTextStripper();
	pdfdata.setStartPage(4);
	pdfdata.setStartPage(2);
	pdfdata.setStartPage(4);
	String pageDatas = pdfdata.getText(doc);
	System.out.println(pageDatas);
	}
	
	
	}


