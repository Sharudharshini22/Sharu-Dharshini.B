package javadec;
import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int num1=30;
	System.out.println(num1/3);
	int arr[]= {2,3,5,6,1};
	try
	{
		System.out.println("start");
		System.out.println("enter n:");
		int n=input.nextInt();
		System.out.println(num1/0);
		System.out.println(arr[2]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("cannot divided by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index out of bounds ");
	}
    catch(Exception e)
	{
    	System.out.println("some error occurs");
    }
	finally
	{
		System.out.println("end");
	}
	
}
}
