package com.rdayala.dp.factory.examplecode;

public class ClientCode {

	public static void main(String[] args) {

		// client code is completely unaware of concrete classes.
		
		// creates an instance of XML document
	    Document document = new DocumentFactory().getInstance("XML");
	    document.processDocument();
	    
	 // creates an instance of PDF document
	    document = new DocumentFactory().getInstance("PDF");
	    document.processDocument();
	}
}
