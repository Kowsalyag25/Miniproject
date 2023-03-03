package Preproject1;

import java.util.Scanner;

public class Smartcity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******             Welcome to Smart city           **********");
		int option=0;	
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Input your choice from the following menu");
			System.out.println("1.Hotel");
			System.out.println("2.Transportation");
			System.out.println("3.Shopping Details");
			System.out.println("4.City news");
			System.out.println("5.Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				Hotel h=new Hotel();
				h.hotel1();
				break;
			case 2:
				Transport t=new Transport();
				t.transport1();
				break;
			case 3:
				Shopping s=new Shopping();
				s.shopping1();
				break;
			case 4:
			News n=new News();
			n.news1();
			break;
			case 5:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Plese enter valid menu");
			}
		}
	}
}


			
