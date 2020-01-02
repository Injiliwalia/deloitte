package com.deloitte.employee;

import java.util.ArrayList;

public class RoomImpl implements Rooms{


 @Override
public ClassRoom addRooms(String ClassRoom_Id, String Name,String Noof_System,
		String Projector) {
	// TODO Auto-generated method stub
	
	ClassRoom cls=new ClassRoom();	
	cls.setClassRoom_Id(Integer.parseInt(ClassRoom_Id));
	cls.setName(Name);
	cls.setNoof_System(Integer.parseInt(Noof_System));
	cls.setProjector(Boolean.parseBoolean(Projector));
  
	return cls;
}

@Override
public ClassRoom searchRooms(int roomid, ArrayList<ClassRoom> list) {
	// TODO Auto-generated method stub
	for(ClassRoom cls:list) {
		if(cls.getClassRoom_Id()==roomid) {
			 return cls;
		}}
	return null;
}

@Override
public ClassRoom[] dispalyAllRooms() {
	// TODO Auto-generated method stub
	
	return null;
}



@Override
public ClassRoom allocateRooms(int noOfSystem) {
	// TODO Auto-generated method stub
	 
	
	return null;
}


@Override
public  boolean validate(String userid,String pass) {
	// TODO Auto-generated method stub
if(userid.equals("admin") && pass.equals("admin")) {
	System.out.println("valid user");
	return true;
}
else {
	return false;
}
}

@Override
public ArrayList<ClassRoom> availabilityOfRooms(int noOfSystem,ArrayList<ClassRoom> list) {
	// TODO Auto-generated method stub
	ArrayList<ClassRoom> availabelRooms=new ArrayList<ClassRoom>();
	for(ClassRoom cls:list) {
		if(cls.getNoof_System()>=noOfSystem && cls is.Availability())
		{
			 availabelRooms.add(cls);
		}
	}
	
	
	
	return  availabelRooms;
}




}