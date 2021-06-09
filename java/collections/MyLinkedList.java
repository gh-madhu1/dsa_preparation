package my.collections;


public class MyLinkedList {

	public Node head;
	
	public MyLinkedList insert(MyLinkedList list, Object data) {
		if (list.head == null) {
			list.head = new Node(data);
		}

		Node last = list.head;
		while (last.next != null) {
			last = last.next;
		}	
		last.next = new Node(data);
		return list;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

	public static class Node {
		
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

		public Object data;
		public Node next;

		public <T> Node(T data) {
			super();
			this.data = data;
		}

	}

}
