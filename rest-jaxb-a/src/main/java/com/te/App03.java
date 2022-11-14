package com.te;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.beans.Student;

public class App03 {
	
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
		String source = "<student>\r\n" + 
						"    <sId>2</sId>\r\n" + 
						"    <sName>Name 02</sName>\r\n" + 
						"</student>";
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		// Un-Marshaling
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Student student = (Student) unmarshaller.unmarshal(new StringReader(source));
		System.out.println(student);
	}
}
