
public class LinkedListImpl<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	private int size;
	
	public boolean isEmpty(){
		if(size == 0)
			return true;
		else
			return false;
	}
	
	public int getSize(){
		return size;
	}
	
	public LinkedListImpl() {
		size = 0;
		head = tail = null;
	}
	
	public LinkedListImpl(T ele) {
		
		Node<T> node = new Node<T>(ele);
		head = node;
		tail = node;
		size = 1;
	}
	
	public void add(T ele){
		Node<T> node = new Node<T>(ele);
		
		if(isEmpty()){
			head = node;
			tail = node;
			size = 1;
			return;
		}
		
		tail.setNextRef(node);
		tail = node;
	}
	
	public void addFirst(T ele){
		
		Node<T> node = new Node<T>(ele);
		
		if(isEmpty()){
			head = node;
			tail = node;
			size = 1;
			return;
		}
		
		node.setNextRef(head);
		head = node;
		
	}
	
	
	
	
	
	
}
