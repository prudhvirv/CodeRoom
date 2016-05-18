
public class Node<T> implements Comparable<T>{
	
	private Node<T> nextRef;
	
	private T data;
	
	public Node(T dataValue) {
		data = dataValue;
		nextRef = null;
	}
	
	public Node(T dataValue, Node<T> nextNode){
		nextRef = nextNode;
		data = dataValue;
	}
	
	public Node<T> getNextRef() {
		return nextRef;
	}
	
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public int compareTo(T arg) {
		
		if(arg == data)
			return 0;
		else
			return 0;
	}
}
