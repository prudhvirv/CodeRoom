
public class ArrayStack implements Stack {
	
	private static final int MAX_SIZE = 1024;
	private int top = -1;
	private Object[] s;
	
	
	public ArrayStack() {
		s[MAX_SIZE] = new Object();
	}
	
	public ArrayStack(int size){
		
		if(size>MAX_SIZE){
			size = MAX_SIZE;
		}
		
		s[size] = new Object();
	}

	@Override
	public void push(Object object) throws StackFullException {
		
		if(top == MAX_SIZE -1){
			throw new StackFullException("Stack is already Full");
		}
		
		s[++top] = object;
	}

	@Override
	public Object pop() throws StackEmptyException {

		if(isEmpty()){
			throw new StackEmptyException("Stack is Already Empty");
		}
		
		Object element = s[top];
		s[top--] = null;
		
		return element;
	}

	@Override
	public Object top() throws StackEmptyException {

		if(isEmpty()){
			throw new StackEmptyException("Stack is Already Empty");
		}
		
		return s[top];
	}

	@Override
	public boolean isEmpty() {
		
		return (top<0) ?true:false;
	}

	@Override
	public int size() {
		
		return top+1;
	}

}
