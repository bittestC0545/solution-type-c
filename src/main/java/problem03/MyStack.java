package problem03;

public class MyStack {
	
	private String[] buffer;
	int top;
	
	public MyStack( int size ) {
		buffer = new String[size +2];
		this.top =-1;
	}
	
	public void push(String item) {
		buffer[++top] = item;
	}

	public String pop() {
		if(top == -1) {
			return null;
		}
		return buffer[top--];
	}

	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return 0;
	}
}