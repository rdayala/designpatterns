package com.rdayala.dp.factory.examplecode;

public class ClientCode {

	public static void main(String[] args) {

		// client code is completely unaware of concrete classes.
		DocumentFactory documentFactory = new DocumentFactory();
		
		// creates an instance of XML document	  
		Document document = documentFactory.getInstance("XML");
	    document.processDocument();
	    
	 // creates an instance of PDF document
	    document = documentFactory.getInstance("PDF");
	    document.processDocument();
	}
}
