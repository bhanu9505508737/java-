//Armstrong Number

package javaassignments;
import java.util.Scanner;
import java.lang.*;

public class ArmstrongNumber {
	
	
int countFunction(int a)
{ 
        int count = 0; 
        while (a != 0) { 
            a = a / 10; 
            ++count; 
           
        } 
        return count;
        
}



public static void main(String args[])
{
	int k1;
	int sum=0;
int count=0;
	int a;
int number;
	Scanner s = new Scanner(System.in);     //giving a value
	a=s.nextInt();                          //assigning input value to a
System.out.println("input value"+a);
ArmstrongNumber value=new  ArmstrongNumber();
int x=value.countFunction(a);               //function call to count the lenth of a number
 
System.out.println("count"+x);
int j=a;                                    //Assigning that input to j
while(a!=0)
{
	k1=a%10;

	sum= (sum+Math.pow(k1, x));                    //finding the sum 
 	a=a/10;

}

System.out.println(sum);                    //printing the sum

if(sum==j)                                  //if condition to check whether given number is Armstrong or not
{
	System.out.println("armstrong number");
}
else
{
	System.out.println("not armstrong");
}
	}


}