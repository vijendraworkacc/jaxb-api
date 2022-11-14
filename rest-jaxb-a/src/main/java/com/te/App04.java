package com.te;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.beans.Student;

public class App04 {
	
	/* 
	 * JAXB
	 * 
	 * @XmlRootElement , @XmlElement 
	 * 
	 * StringReader
	 * 
	 * */
	public static void main(String[] args) throws JAXBException {
		System.out.println("Hello World!");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		// Un-Marshaling
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Student student = (Student) unmarshaller.unmarshal(new File("src/main/java/source.xml"));
		System.out.println(student);
	}
}
