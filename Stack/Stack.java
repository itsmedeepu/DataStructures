package Stack;

public class Stack {
	private Object[] a = new Object[5];
	private int p;

	public void push(Object ele) {
		if (p >= a.length)
			increase();

		a[p] = ele;
		p++;

	}

	public Object pop() {

		if (size() == 0)
			return null;

		Object e = a[p - 1];
		a[p - 1] = null;
		p--;

		return e;

	}

	public Object peek() {
		if (size() == 0)
			return null;
		return a[p - 1];

	}

	public int size() {
		return p;
	}

	public boolean isEmpty() {
		if (size() == 0)
			return true;
		return false;
	}

	public void increase() {
		Object[] b = new Object[a.length + 3];
		int i = 0;
		while (i < a.length) {
			b[i] = a[i];
			i++;
		}
		a = b;

	}

	public void clear() {

		a = new Object[5];
		p = 0;
	}

	public String toString() {
		if (size() == 0)
			return "[]";
		String s = "[" + a[0];

		int i = 1;
		while (i < size()) {
			s += "," + a[i];
			i++;
		}
		s += "]";
		return s;

	}

}
