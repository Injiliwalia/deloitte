package com.deloitte.employee;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.*
;public class Demo{
	public static void main(String[]args) {
		
		ClassRoom cls=new ClassRoom();
		Utilities util=new Utilities();
		Scanner  s=new Scanner(System.in);
		
		Map<Integer,ClassRoom> list=new HashMap<Integer,ClassRoom>();
		
		
		
	
		ClassRoom[] arrayOfRooms=null;
		while(true) {
		System.out.println("please enter option 1to add new room"+ "option 2 to searchroom "+
		"option 3 to display all rooms"+
		"option 4 to allocate the room"+
		"option 5 to display room details"+"option 5 to exit the application ");
		
		
		
		RoomImpl mainClassRoomObj=new 	RoomImpl();
//		String option=s.next();
		
		switch (option) {
		
		
		case "1":
			String ClassRoom_Id="";
			while(true) {
				System.out.println("please enter ClassRoom_Id");	
				ClassRoom_Id=s.next();
				if(util.roomidValidation(ClassRoom_Id)) {
					break;
				}
				else {
					continue;
				}
			}
			System.out.println("please enter total no of rooms");
			String Noof_Rooms=s.next();
	

		System.out.println("please enter Name");
		String Name=s.next();	
		
		System.out.println("enter Noof_System");
		String Noof_System=s.next();
		
		System.out.println("AC");
		String ac=s.next();
		
		System.out.println("ENTER Projector REQUIREMENT");
		String Projector=s.next();
		
		
	   System.out.println("Availability");
	   String ava=s.next();
		
	   mainClassRoomObj.addRooms(Projector,Noof_System,ClassRoom_Id,Name);
			list.put(cls.getClassRoom_Id(),cls);

		 break;
			
		case"2":
			
		 System.out.println("enter userid");
		 String userid=s.next();
		 System.out.println("enter password");
		 String pass=s.next();
		 boolean validateuserFlag=mainClassRoomObj.validate(userid, pass);
		if(validateuserFlag==true) {
			System.out.println("valid user");
		}else
		{
			System.out.println("valid user");
		}
		 case"3":
			 Set<Integer> setOfRoomKeys=list.keySet();
		for(Integer clsObj: setOfRoomKeys) { 
			System.out.println(list.get(clsObj));
		}
			break;
			
		 case"4":
			 System.out.println("enter Noof_System");
				String noOfSystem=s.next();
				
				System.out.println("enter Noof rooms");
				String noOfRoomsNeeded=s.next();
				
		Map<Integer,Rooms> availableRooms= mainClassRoomObj.availabilityOfRooms(Integer.parseInt(noOfSystem),list);
			if(availableRooms.size()>=Integer.parseInt(noOfRoomsNeeded)) {
				for(Integer avlRoomKey : availableRooms.keySet()) {
					for(Integer roomFromMainListKey : list.keySet()) {
			
						iflist.get(avlRoomKey.getClassRoom_Id()==list.roomFromMainListKey.getClassRoom_Id());	
						System.out.println("please enter faculty name");		 
			String faculty=s.next();
			list.get(roomFromMainListKey).setFaculty(faculty);
			list.get(roomFromMainListKey).setAvailability(false);
			 
			 break;
		}}}
		 case"5":
			 System.out.println("please enter ClassRoom_Id");
				String Room_Id=s.next();
			 Boolean flag=false;	
		
				  System.out.println(mainClassRoomObj.searchRooms(Integer.parseInt(Room_Id),list));	
				 break;
			 
		
			case"6":
				System.exit(0);
		}
		
		
		
		
	}
		
	
	


}   }                             
