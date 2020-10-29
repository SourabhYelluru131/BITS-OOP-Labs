package Lab_8;
import java.util.*;
public class Stack {
	private LinkedList stacklist;
	public int size;
	public Stack(LinkedList list) {
		stacklist = list;
		size = list.size();
	}
	public Stack() {
		stacklist = new LinkedList();
		size = 0;
	}
	public void push(Object element) {
		stacklist.add(element);
		size++;
	}
	public Object pop() {
		if(size==0) return -1;
		else {
			size--;
			Object ret = stacklist.getFirst();
			stacklist.remove();
			return ret;
		}
	}
	public Object top() {
		if(size==0) return -1;
		else {
			return stacklist.getFirst();
		}
	}
	public boolean isEmpty() {
		return size==0;
	}
	public static void main(String[] args) {
		Stack mys = new Stack();
		System.out.println(mys.isEmpty());
		System.out.println(mys.size);
		mys.push(1);
		mys.push(2);
		mys.push(3);
		mys.push(4);
		System.out.println(mys.isEmpty());
		System.out.println(mys.size);
		System.out.println(mys.top());
		mys.push(5);
		mys.push(6);
		mys.push(7);
		mys.push(8);
		mys.push(9);
		mys.push(10);
		System.out.println(mys.isEmpty());
		System.out.println(mys.size);
		mys.pop();
		System.out.println(mys.isEmpty());
		System.out.println(mys.size);
		System.out.println(mys.top());
		mys.push(11);
		System.out.println(mys.top());
		System.out.println(mys.isEmpty());
		System.out.println(mys.size);
	}
}
