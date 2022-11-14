package com.te;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.te.beans.Employee;
import com.te.beans.Student;

public class App05 {
	
	/* 
	 * JAXB
	 * 
	 * @XmlRootElement , @XmlElement, @XmlAttribute
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) throws JAXBException {
		System.out.println("Hello World!");
		String source = "<employee eId=\"3\">\r\n" + 
						"    <eName>Name 03</eName>\r\n" + 
						"</employee>"; 
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Employee employee = (Employee) unmarshaller.unmarshal(new StringReader(source));
		System.out.println(employee);
		System.out.println(employee.geteId());
	}
}
