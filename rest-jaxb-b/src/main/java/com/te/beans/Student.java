package com.te.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Student {
	private int sId;
	private String sName;
	private Course course;

	public Student() {
		super();
	}

	public Student(int sId, String sName, Course course) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.course = course;
	}

	@XmlTransient
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	@XmlElement(name = "s_name")
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}
	@XmlElement
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", course=" + course + "]";
	}
}
