package com.te.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// JAXB

@XmlRootElement
public class Student implements Serializable {
	private int sId;
	private String sName;

	public Student() {
		super();
	}

	public Student(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}
	
	@XmlElement
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	@XmlElement
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}
}
