package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


interface FistName {
	public String validate1(String regex, String firstname);
}

interface LastName {
	public String validate2(String regex, String Lastname);
}
interface EmailId {
	public String validate3(String regex, String emailid);
}

interface PhoneNumber {
	public String validate4(String regex, String phonenumber);
}
interface PreDefinedPassword {
	public String validate5(String regex, String predefinedpassword);
}

interface OneUpperCase {
	public String validate6(String regex, String oneuppercase);
}
interface NumricNumber {
	public String validate7(String regex, String onenumricnumber);
}
interface SpcialCharacter {
	public String validate8(String regex, String specialcharacter);
}

public class LambdaEpression {

		public static void main(String[] args) {
			  Scanner scanner = new Scanner(System.in);
		      System.out.println("First name starts with Cap andminimum 3 characters");
		      String name = scanner.next();
		      FistName firstname = (pattern, firstName) -> {

				return " " + Pattern.compile(pattern).matcher(firstName).matches();
			  };

		      System.out.println(firstname.validate1("^[A-Z][a-zA-Z]{3}[a-z]{2,}$", name));
		      System.out.println("******************************");
		      System.out.println("Last name starts with Cap and minimum 3 characters:");
	      	  String name1= scanner.next();
	          LastName lastname = (pattern, lasttName) -> {

			  return " " + Pattern.compile(pattern).matcher(lasttName).matches();
		      };
         	 System.out.println(lastname.validate2("^[a-z][a-zA-Z]{2,}[A-Z]{3}$", name1));
         		
         	 System.out.println("****************************************");
             System.out.println("Enter The Emailid EX :enter abc.xzy@bl.co.in");
	         String email = scanner.next();
		     EmailId vailemail = (pattern, emailid) -> {

			 return " " + Pattern.compile(pattern).matcher(emailid).matches();
		     };

	         System.out.println(vailemail.validate3("^([a-z]{3}[-.])([a-z]+)*@([a-z]{2}[-.])([a-z]{2}[-.])([a-z]+)*$", email));
	         
	         System.out.println("********************** ******");
	         
	         System.out.println("Enter The Phone Number with space ex 91 1234567892 :");
      	     String  number= scanner.next();
         	 PhoneNumber vaildphonenumber = (pattern, phonenumber) -> {

     			return " " + Pattern.compile(pattern).matcher(number).matches();
     		};

     	     System.out.println(vaildphonenumber.validate4("^([a-z]{3}[-.])([a-z]+)*@([a-z]{2}[-.])([a-z]{2}[-.])([a-z]+)*$", number));
     	
     	    System.out.println("******************************");
     	    System.out.println("Enter the Password Minimum 8 Character: All Rules Must Be Passed");
     	    String password = scanner.next();
     	    PreDefinedPassword validpassword = (pattern, predefinedpassword) -> {

			return " " + Pattern.compile(pattern).matcher(password).matches();
     	    };
		
		     System.out.println(validpassword.validate5(" ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8}$", password));
		          
		     System.out.println("*****************************");      
	
             System.out.println("Enter the Password At Least One Upper Case: ");
             String uppercase = scanner.next();
             OneUpperCase uppercasevalid = (pattern, oneuppercase) -> {

	         	return " " + Pattern.compile(pattern).matcher(uppercase).matches();
             };

           	System.out.println(uppercasevalid.validate6("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{0,}$" , uppercase));
	
           	System.out.println("**********************************");
           	System.out.println("Enter the Password At Least One NumricNumber::");
           	String numric = scanner.next();
           	NumricNumber numricnumber = (pattern, onenumricnumber) -> {

 			return " " + Pattern.compile(pattern).matcher(numric).matches();
           	};

 	        System.out.println(numricnumber.validate7(" ^(?=.*[0-9]){1}(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{0,}$" , numric));
 	        System.out.println("*******************************");
 	        System.out.println("Enter the Password At Least One Special Character:");
 	        String spcial = scanner.next();
 	        SpcialCharacter specialchar = (pattern, specialcharacter) -> {

			return " " + Pattern.compile(pattern).matcher(spcial).matches();
 	        };
 	        System.out.println(specialchar.validate8(" ^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]){1}.{0,}$" , spcial));
     		}
		
		
			}

		
		
		
		
	
		

         
	
		



