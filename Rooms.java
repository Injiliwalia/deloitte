package com.deloitte.employee;
import java.util.ArrayList;
import java.util.Map;

public interface Rooms {
	
	public ClassRoom addRooms(String ClassRoom_Id, String Name,String Noof_System,String Projector);
	public ClassRoom searchRooms(int roomid,ArrayList<ClassRoom> list);
    public ClassRoom allocateRooms(int noOfSystem );
    public ClassRoom[] dispalyAllRooms();
    public ArrayList<ClassRoom> availabilityOfRooms(int noOfSystems,Map<Integer,Rooms> list);
    public boolean validate(String userid,String pass);
}
