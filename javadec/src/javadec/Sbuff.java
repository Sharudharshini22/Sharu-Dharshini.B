package javadec;

public class Sbuff {

	public static void main(String[] args) {
	StringBuffer SB=new StringBuffer("");
	System.out.println("the given SB is:"+SB);
	SB.append("java ");
	System.out.println(SB);
	SB.append("is a programming language");
	System.out.println(SB);
	SB.insert(7,"programming");
	System.out.println(SB);
	SB.replace(0, 5,"python");
	System.out.println(SB);
	SB.reverse();
	System.out.println(SB);
	}

}
