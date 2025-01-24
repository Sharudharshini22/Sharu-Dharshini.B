package javadec;
import java.util.Scanner;
public class Multi {
    public static void main (String[]args)
    {
      Scanner input=new Scanner(System.in);
      int arr[][]=new int [3][2];
      int i,j,Sum=0;
      for(i=0;i<arr.length;i++)
      {
    	 for(j=0;j<arr[j].length;j++);
    	 {
    		 System.out.println("enter array value:");
    		 arr[i][j]=input.nextInt();
    	 }
      }
      for(i=0;i<arr.length;i++)
      {
    	  for(j=0;j<arr[j].length;j++)
    	  {
    		  Sum=Sum+arr[i][j];
    	  }
    	System.out.println(Sum);
    	Sum=0;
      }
    }
}

