package javadec;
public class SBuild {
	public static void main(String[] args) {
	StringBuilder SB=new StringBuilder("");
	System.out.println("the given SB is:"+SB);
	SB.append("java");
	System.out.println(SB);
	SB.insert(4,"program");
	System.out.println(SB);

	}

}
