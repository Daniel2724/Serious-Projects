package Daniel;

import java.util.*;
/*
 * Name : Daniel
 * Date : 8.12.2018
 * This program need to say if the law has been passed or not.
 * V.2 (adding creater info ^^^^^ )
 */
public class vote {

	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		double yes = 0;
		double no = 0;
		double count = 0;
		int num = 0;
		double min;
		double yesPR;
		double noPR;
			while (num != 99) 
			{		
				System.out.println("If you in favor enter 1"); //asking the vote
				System.out.println("If you aganinst enter 2"); // 1 is in favor. 2 in against
				num = reader.nextInt(); //taking the vote from the voter
				count = count + 1; //counting how much voters we have
				
				if (num == 1) 
					yes = yes + 1;
				else 
					if (num == 2) {
					no = no + 1;
				}
				else 
					if (num == 99) {
					System.out.println("The voteing is ended !");
					count = count - 1;
				} 
					else 
				{
					System.out.println("You are entering the wrong number !");
					count = count - 1;
				}
			}

			min = (count/100)*60; // calculate how much voters need to vote in favor to pass the law
			yesPR = (yes/count)*100; // calculate how much % of the voter, vote in favor (just for fun and statistics)	
			noPR = (no/count)*100; // calculate how much % of the voters, vote against the low (jut for fun and statistics)
										

			System.out.println((int)count + " congress members took part in the voteing !"); //saying to the public, how much voters are voted
			System.out.println((int)yes + " congress member vote in fover of this law " + "( " + yesPR + " % )"); //saying to the public how much voters vote in favor and how much percentage it is
			System.out.println((int)no + " congress members vote against this law " + "( " + noPR + " % )"); //saying to the public how much voters vote against and how much percentage it is
			System.out.println(""); //just free line
			System.out.println("------------------------------------"); //just splits the voting report
			System.out.println(""); //just another free line
			
			if (yes > min) {
				System.out.println("The law has been passed in favor of " + yesPR + " %" + " ( " + (int)yes + " congress members of " + (int)(count) + " )" ); //saying to the public that the law has been passed and in which percentage
						
			} else {
				System.out.println("The law has`t been passed when " + noPR + " %" + " is against" + " and " + yesPR + " %" + " is in favor" + " ( " + (int)no + " congress members of " + (int)(count) + " )" ) ; //saying to the public that the law has`t been passed and in which percentage
						
			}
			
			//just statistics !!!
			System.out.println("-------------------------------------------------");
			System.out.println("Tehnical info : ");
			System.out.println("min to pass the law = " + min + " voters");
			System.out.println("how much voters has voted (count) = " + (int)count);
			System.out.println("how much votes is in favor (yes) = " + (int)yes);
			System.out.println("how much votes is against (no) = " + (int)no);
			System.out.println("yes in percentage = " + yesPR);
			System.out.println("no in percentage= " + noPR);
			
		}

	
	}


