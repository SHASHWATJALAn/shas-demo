import java.util.Scanner;
public class months
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of the month--");
	int n = sc.nextInt();

switch(n)
{
case 1:
System.out.println("January"); 
break;

case 2:
System.out.println("Febuary"); 
break;

case 3:
System.out.println("March"); 
break;

case 4:
System.out.println("April"); 
break;

case 5:
System.out.println("May"); 
break;

case 6:
System.out.println("June"); 
break;

case 7:
System.out.println("July"); 
break;

case 8:
System.out.println("August"); 
break;

case 9:
System.out.println("September"); 
break;

case 10:
System.out.println("October"); 
break;

case 11:
System.out.println("November"); 
break;

case 12:
System.out.println("December"); 
break;

default: // if the user enters a number other than 1-12
	// then this message will be printed
	// and the program will terminate
	// without executing any other code
System.out.println("Invalid input");
	}
	sc.close(); // closed the scanner object
	} // end of main
}
// end of class



    

