package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator 
{
	//date class object
   private Date date;
   //Constructor method
   public WishMessageGenerator(Date date) {
	   System.out.println("WishMessageGenerator.WishMessageGenerator()-1 param constructor");
	   this.date=date;
   }
   public void setDate(Date date) {
	   System.out.println("WishMessageGenerator.setDate()-setter injection");
	   this.date=date;
   }
   //Business method
   public String generateMessage(String user) {
	   System.out.println("generatemessage method............"+date);
	   int hour=date.getHours();
	   if(hour<12) {
		   return "Good Morning"+user;
	   }else if(hour<16){
		   return "Good afternoon"+user;
	   }else if(hour<20) {
		   return "Good evening"+user;
	   }else {
		   return "Good night"+user;
	   }
   }
   
}
