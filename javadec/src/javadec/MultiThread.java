package javadec;
class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("1st:"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
}
class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("2nd:"+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}
}
public class MultiThread {

	public static void main(String[] args) {
		First F1=new First();
		Second S1=new Second();
		F1.start();
		S1.start();
	}

}
