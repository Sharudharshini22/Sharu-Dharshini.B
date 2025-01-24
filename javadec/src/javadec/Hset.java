package javadec;
import java.util.HashSet;
public class Hset {
	public static void main(String[] args) {
	HashSet<String>HS=new HashSet<String>();
	System.out.println(HS);
	HS.add("cat");
	HS.add("dog");
	HS.add("tiger");
	HS.add("lion");
	HS.add("deer");
	System.out.println(HS);
	System.out.println(HS.size());
	System.out.println(HS.contains("tiger"));
	HS.remove("Dog");
	HS.clear();
	System.out.println(HS);
	System.out.println(HS.isEmpty());

	}

}
