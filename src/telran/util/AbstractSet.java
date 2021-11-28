package telran.util;

import java.util.NoSuchElementException;

public abstract class AbstractSet<T> implements Set<T> {

	protected int size;
	
	@Override
	public int size() {
		
		return size;
	}
	
	protected void noSuchElementException() {
		throw new NoSuchElementException();
	}
	
	protected void illegalStateException() {
		throw new IllegalStateException();
	}
}
