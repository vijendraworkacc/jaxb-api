package com.te;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.te.beans.Employee;

public class App06 {
	
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
		
		Employee employee = new Employee();
		employee.seteId(4);
		employee.seteName("Name 04");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter handler = new StringWriter();
		marshaller.marshal(employee, handler);
		System.out.println(handler);
	}
}
