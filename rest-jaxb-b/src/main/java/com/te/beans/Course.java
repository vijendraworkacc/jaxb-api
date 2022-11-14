package com.te.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course {
	private int cId;
	private String cName;

	public Course() {
		super();
	}

	public Course(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	@XmlElement(name = "c_id")
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	@XmlElement(name = "c_name")
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + "]";
	}
}
