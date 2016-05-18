
public interface Stack {
	
	public void push(Object object);
	public Object pop() throws StackEmptyException;
	public Object top() throws StackEmptyException;
	
	public boolean isEmpty();
	public int size();

}
