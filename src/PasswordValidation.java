import java.util.*;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int MAX=8;
final int MIN_Uppercase=1;
final int MIN_Lowercase=2;
final int NUM_Digits=2;
final int Special=1;
int uppercaseCounter=0;
int lowercaseCounter=0;
int digitCounter=0;
int specialCounter=0;
System.out.println("Enter the Password--->");
Scanner sc=new Scanner(System.in);
String password=sc.nextLine();
for(int i=0;i<password.length();i++)
{
	char c=password.charAt(i);
	if(Character.isUpperCase(c))
		uppercaseCounter++;
	else if(Character.isLowerCase(c))
		lowercaseCounter++;
	else if(Character.isDigit(c))
		digitCounter++;
	if(c>=33 && c<=46 || c==64)
	{
		specialCounter++;
	}
	
	
}
if(password.length()>=MAX && uppercaseCounter>=MIN_Uppercase && lowercaseCounter>=MIN_Lowercase && digitCounter>=NUM_Digits &&specialCounter>=Special)
{
	System.out.println("Valid Password");
	
}
else
{
	System.out.println("Your Password does not contain the following");
	if(password.length()<MAX)
		System.out.println("Atleast 8 character");
	if(lowercaseCounter<MIN_Lowercase)
		System.out.println("Minimum LowerCase letters");
	if(uppercaseCounter<MIN_Uppercase)
		System.out.println("One UpperCase letters");
	if(digitCounter<NUM_Digits)
		System.out.println("Minimum Number of Numeric digit");
	if(specialCounter<Special)
		System.out.println("Password should be contain at least 3 special charaters");
		
}
	
	}

}
