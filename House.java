package com.assignments;


/*Write a program to create a room class, the attributes of this class is 
roomno, roomtype, roomarea and ACmachine. In this class the member 
functions are setdata and displaydata.*/
/*Write a program for reuse class. For this program use the above ‘room 
class’ program.*/

public class House {

	Room r; 
	 void createHouse() 
	 { 
	 r = new Room(); 
	 } 
	void displayHouse() 
	 { 
	 r.displayData(); 
	 } 
	public static void main (String args[]) 
	 { 
	 House h = new House(); 
	 h.createHouse(); 
	 h.displayHouse(); 
	 } 
}
