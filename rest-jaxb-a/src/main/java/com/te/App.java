package com.te;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.beans.Student;

public class App {
	
	/* 
	 * JAXB
	 * 
	 * @XmlRootElement , @XmlElement 
	 * 
	 * StringWriter, marshaller.JAXB_FORMATTED_OUTPUT
	 * 
	 * */
	public static void main(String[] args) throws JAXBException {
		System.out.println("Hello World!");
		
		Student student = new Student();
		student.setsId(1);
		student.setsName("Name 01");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		// Marshaling
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter stringWriter = new StringWriter();
		marshaller.marshal(student, stringWriter);
		System.out.println(stringWriter);
	}
}
