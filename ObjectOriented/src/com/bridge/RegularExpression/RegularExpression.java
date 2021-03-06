package com.bridge.RegularExpression;


import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String str = " Hello <<name>>, We have your full name as <<full name>> in our system."
					+ " your contact number is 91-xxxxxxxxxx. "
					+ "Please,let us know in case of any clarification Thank you BridgeLabz xx/xx/xxxx.";
		String name = "";
		int i = 0;String num = null;
		Date date = new Date();
		String strDate = DateFormat.getInstance().format(date); 
		try {
			System.out.println("Enter Your Full Name");
			name = sc.nextLine();
			System.out.println("Enter 10 digit Mobile Number");
			num = sc.next();
			for (i = 0; i < name.length(); i++) {
				if(name.charAt(i) == ' ')
					break;
			}
			
			//Match and Replace Only Name
			Pattern p = Pattern.compile("<<name>>");
			Matcher m = p.matcher(str);
			StringBuffer sb = new StringBuffer();
			while(m.find()) {
				m.appendReplacement(sb, name.substring(0, i));
			}
			
			m.appendTail(sb);
			 
			 
			//Match And Repalce Full Name
			  p = Pattern.compile("<<full name>>"); 
			  m = p.matcher(sb.toString()); 
			  sb = new StringBuffer();
			  while(m.find()) 
			  {
				  m.appendReplacement(sb, name); 
			  } 
			  m.appendTail(sb);
			  
			
			  
			  //Match ANd Replace XXXXX with Mobile Number
			  p = Pattern.compile("xxxxxxxxxx"); 
			  m = p.matcher(sb.toString()); 
			  sb = new StringBuffer();
			  while(m.find()) 
			  {
				  m.appendReplacement(sb, num); 
			  } 
			  m.appendTail(sb);
			  
			  
			 // System.out.println(date);
			//Match ANd Replace XXXXX with Mobile Number
			  p = Pattern.compile("xx/xx/xxxx"); 
			  m = p.matcher(sb.toString()); 
			  sb = new StringBuffer();
			  while(m.find()) 
			  {
				  m.appendReplacement(sb, strDate); 
			  } 
			  m.appendTail(sb);
			  
			  
			  System.out.println(sb.toString());
			  sc.close();
			  
		} catch (Exception e) {
			System.out.println("Wrong Input ");
			e.printStackTrace();
		}
		
	}
}
