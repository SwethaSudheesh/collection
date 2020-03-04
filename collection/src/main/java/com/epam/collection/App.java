package com.epam.collection;
import java.util.Scanner;
public class App { 
	public static void main(String[] args) {
	 Data<Integer> list = new Data<>();
	 Scanner in=new Scanner(System.in);
	 int ch;
	 char choice;
	 do
	 {
	 System.out.println("1. Add\n2. Fetch\n3. Remove\n4. Print\n");
	 ch=in.nextInt();
	 switch(ch)
	 {  
	     case 1: System.out.println("Enter the elements\n");
	             int ele=in.nextInt(); 
	             list.add(ele);
	             break;
	     case 2: System.out.println("Enter the position of the element you want to fetch\n");
	             int pos=in.nextInt();
	             System.out.println(list.get(pos));
	             break;
	     case 3: System.out.println("Enter the position of the element you want to remove\n");
	             int del=in.nextInt();
	             list.remove(del);
	             break;
	     case 4: System.out.println(list);
	             break;
	     default:
	    	      System.out.println("Invalid option\n");
	    	      break;
	 }
	 System.out.println("Would you like to continue? Y|N");
	 choice=in.next().charAt(0);
	 }while(choice=='Y'||choice=='y');
     in.close();
     System.out.println("Finished");
    } 
}