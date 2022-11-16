package layeredarchitecture;

public interface Dao {
	
	
	boolean add(Object o);
	
	boolean remove(Object o);
	//boolean remove(int id);
	
	//Object get(int id);
	
	Object[] getAll();
	
	

}
