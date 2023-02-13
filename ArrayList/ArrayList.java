package ArrayList;

public class ArrayList {

	private Object[] a = new Object[5];
	private int p;

	public void add(Object ele) {
		if (p >= a.length)
			increase();

		a[p] = ele;
		p++;

	}
	public void add(int index, Object ele) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if(p>=a.length)increase(); 

		for (int i = size() - 1; i >= index; i--) {

			a[i + 1] = a[i];
		}
		a[index] = ele;
		p++;

	}
	public void remove(int index) {
		if (index <= -1 || index>= size()) {
			throw new IndexOutOfBoundsException();
		}

		for (int i = index+1; i<size(); i++) {

			a[i - 1] = a[i];
		}
		p--;
		a[p]=null;
	}
	
	public int size() {
		return p;
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

	public Object get(int index) {
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		return a[index];

	}
	
	public void clear() {
		
		a= new Object[5];
		p=0;
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
