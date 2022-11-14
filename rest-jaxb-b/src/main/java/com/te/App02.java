package com.te;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.te.beans.Student;

public class App02 {
	
	/* 
	 * JAXB
	 * 
	 * @XmlRootElement , @XmlElement, @XmlAttribute, @XmlTransient, name attribute
	 * @XmlAccessorType
	 * 
	 * 
	 * */
	public static void main(String[] args) throws JAXBException {
		System.out.println("Hello World!");
		String source = "<student>\r\n" + 
						"    <course>\r\n" + 
						"        <c_id>1</c_id>\r\n" + 
						"        <c_name>Science</c_name>\r\n" + 
						"    </course>\r\n" + 
						"    <s_name>Name 01</s_name>\r\n" + 
						"</student>";
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(source);
		Student student = (Student) unmarshaller.unmarshal(reader);
		System.out.println(student);
	}
}
