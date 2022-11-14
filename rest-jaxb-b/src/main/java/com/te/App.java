package com.te;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.beans.Course;
import com.te.beans.Student;

public class App {
	
	/* 
	 * JAXB
	 * 
	 * @XmlRootElement , @XmlElement, @XmlAttribute, @XmlTransient, name attribute
	 * 
	 * 
	 * */
	public static void main(String[] args) throws JAXBException {
		System.out.println("Hello World!");
		
		Course course = new Course();
		course.setcId(1);
		course.setcName("Science");
		
		Student student = new Student();
		student.setsId(1);
		student.setsName("Name 01");
		student.setCourse(course);
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		StringWriter stringWriter = new StringWriter();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(student, stringWriter);
		System.out.println(stringWriter);
	}
}
