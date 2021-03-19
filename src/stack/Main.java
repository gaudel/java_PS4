package stack;

public class Main {

	private static void example(Stack s) throws IsEmptyException {
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();        
		System.out.println(s.pop() + "(expect 2)");        
		System.out.println(s.top() + "(expect 1)");        
		System.out.println(s.isEmpty() + "(expect False)");   
		System.out.println(s.pop() + "(expect 1)");        
		System.out.println(s.isEmpty() + "(expect True)");   

		try {
		    s.pop();
		    throw new RuntimeException("s.pop() aurait du lancer une erreur.");
		}
		catch (IsEmptyException e) {
			if (!e.getMessage().equals("pop() is invalid for an empty stack.")) {
		        throw e;
			}
		}

		for (int i =0; i<10; i++) {
		    s.push(i);
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) throws IsEmptyException {
		example(new ArrayStack());
		example(new LinkedListStack());
	}

}
