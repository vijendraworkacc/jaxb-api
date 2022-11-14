package com.te;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.beans.Student;

public class App02 {
	
	/* 
	 * JAXB
	 * 
	 * @XmlRootElement, @XmlElement
	 * 
	 * File, marshaller.JAXB_FORMATTED_OUTPUT
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
		File file = new File("src/main/java/result.xml");
		marshaller.marshal(student, file);
	}
}
