package telran.util;

public abstract class AbstractSet<T> implements Set<T> {

	protected int size;
	
	@Override
	public int size() {
		
		return size;
	}

}
