package stack;

public interface Stack {
	public boolean isEmpty();
	public void push(int value);
	public int top() throws IsEmptyException;
	public int pop() throws IsEmptyException;
	public int size();
}
