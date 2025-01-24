package javadec;

import java.util.ArrayList;

public class AList1 {

	public static void main(String[] args) {
    ArrayList<String>AL=new ArrayList<String>();
    System.out.println(AL);
    AL.add("java");
    System.out.println(AL);
    AL.add("javascript");
    System.out.println(AL);
    AL.add("python");
    System.out.println(AL);
    AL.add(2,"css");
    System.out.println(AL);
    System.out.println(AL.get(2));
    AL.set(1,"perl");
    System.out.println(AL);
    AL.remove("css");
    AL.remove(2);
    AL.removeLast();
    System.out.println(AL.contains("python"));
    AL.clear();
    System.out.println(AL);
  
	}

}
