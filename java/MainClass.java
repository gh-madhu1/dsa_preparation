import my.collections.MyLinkedList;

public class MainClass {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 40);
				
		System.out.println(list);
		
		int []i = new int[0];
		
		System.out.println(i.length);

	}

}
