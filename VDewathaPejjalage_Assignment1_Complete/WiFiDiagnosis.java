/*
* Class: CMSC203
* Instructor:
* Description: (This is a program that helps the user with wifi diagnostic by asking them severel qustions)
* Due: 2/14/2022
* Platform/compiler:eclipse
* I pledge that I have completed the programming assignment
independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Vishwa Dewatha Pejjalage
*/

import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String choice;
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis\r\n"
				+ "might work.\r\n");
		System.out.println("First step: reboot your computer\r\n"
				+ "Are you able to connect with the internet? (yes or no)");//First question
		choice=scan.nextLine();
		if(choice.equals("yes")) {
			System.out.println("Rebooting your computer seemed to work");}
		else {
			System.out.println("Second step: reboot your router\r\n"
					+ "Now are you able to connect with the internet? (yes or no)");//second question
			choice=scan.nextLine();
			if(choice.equals("yes")) {
				System.out.println("Rebboting the router seemed to work.");}		
			else {
					System.out.println("Third step: make sure the cables to your router are plugged in firmly\r\n"
							+ "and your router is getting power\r\n"
							+ "Now are you able to connect with the internet? (yes or no)");//Third question
					choice=scan.nextLine();
				if(choice.equals("yes")) {
						System.out.println("Checking the router's cables seemed to work.");}
					
				else {
						System.out.println("Fourth step: move your computer closer to your router\r\n"
								+ "Now are you able to connect with the internet? (yes or no)");//Fourth question
						choice=scan.nextLine();
					if(choice.equals("yes")) {
							System.out.println("Moving your computer closer seems to work.");}
					
					else {
							System.out.println("Fifth step: contact your ISP\r\n"
								+ "Make sure your ISP is hooked up to your router.");//Fifth question
							choice=scan.nextLine();
						if(choice.equals("yes")) {
								System.out.println("Cheking the ISP cable connected to the router seems to work.");}
						else {
								System.out.println("You will have to contact a technician to cheak your router.");
								
							}
						}
					}
				}
			}
		}
	}

		
		


