package javadec;
import java.util.LinkedList;
public class List {

	public static void main(String[] args) {
	LinkedList<String>LL=new LinkedList<String>();
	System.out.println(LL);
	LL.add("sharu");
	LL.add("dharshini");
	LL.add("rasiga");
	LL.addFirst("balaji");
	LL.addLast("revathi");
	System.out.println(LL);
	System.out.println(LL.size());
	System.out.println(LL);
	System.out.println(LL.peek());
	System.out.println(LL.peekFirst());
	System.out.println(LL.peekLast());
	System.out.println(LL.poll());
	System.out.println(LL.pollFirst());
	System.out.println(LL.pollLast());
	}

}
