package com.deloitte.employee;

public final class ClassRoom {
	private String name;
	private int classRoom_Id;
	private int noof_System;
	private boolean projector;
	private  boolean ac;
	private String faculty;
	private  boolean availability;
    private static int count;
    private String  userid="admin";
    private String  pass;
    public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
   static {

	 count=0;

}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		ClassRoom.count = count;
	}

	public ClassRoom() {
		count++;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getClassRoom_Id() {
		return classRoom_Id;
	}
	public void setClassRoom_Id(int classRoom_Id) {
		this.classRoom_Id = classRoom_Id;
	}
	public int getNoof_System() {
		return noof_System;
	}
	public void setNoof_System(int noof_System) {
		this.noof_System = noof_System;
	}
	public boolean isProjector() {
		return projector;
	}
	public void setProjector(boolean projector) {
		this.projector = projector;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", classRoom_Id=" + classRoom_Id + ", noof_System=" + noof_System
				+ ", projector=" + projector + ", ac=" + ac + ", faculty=" + faculty + ", availability=" + availability
				+ "]";
	}
}
