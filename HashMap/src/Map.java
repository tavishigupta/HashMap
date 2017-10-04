/**
 * This class builds a fixed-size hash map that associates string keys with
 * arbitrary data object references.
 *
 * @author Tavishi Gupta */

public class Map<K, V> {
	private int completeSize;
	private int size;
	private final int DEFAULT_CAPACITY = 10;
	private Entry<K, V>[] map = new Entry[DEFAULT_CAPACITY];

	/**
	 * Constructor method initializes an instance of the class with
	 * pre-allocated space for the given number of objects.
	 *
	 * @param size the initial size of the hash map.
	 */
	public Map(int size){
		this.completeSize = size;
		this.size = 0;
		map = new Entry[size];
	}

	/**
	 * Stores the given key/value pair in the hash map.
	 *
	 * @param key the key of the key/value pair.
	 * @param value the value of the key/value pair.
	 * @return boolean value indicating success/failure of the operation.
	 */
	public boolean set(K key, V value){
		boolean insert = true;

		// checks if the key already exists in the hash map
		for(int i = 0; i < size; i++){
			if(map[i].getKey().equals(key)){
				map[i].setValue(value);
				insert = false;
			}
		}

		// inserts a key/value pair if key does not already exist
		if(insert){
			if(size >= completeSize){
				return false;
			}
			else{
				map[size] = new Entry<K, V>(key, value);
				size++;
			}
		}
		return true;
	}

	/**
	 * Gets the value associated with the given key.
	 *
	 * @param key the key for the value that needs to be returned.
	 * @return the value associated with the given key, or null if no value is set.
	 */
	public V get(K key){
		for(int i = 0; i < size; i++){
			if(map[i].getKey().equals(key))
				return map[i].getValue();
		}
		return null;
	}

	/**
	 * Deletes the value associated with the given key.
	 *
	 * @param key the key for the key/value that needs to be deleted.
	 * @return the value on success or null if the key has no value.
	 */
	public V delete(K key){
		for(int i = 0; i < size; i++){
			if(map[i].getKey().equals(key)){
				V value = map[i].getValue();
				map[i] = null;
				size--;

				// condensing the array
				for(int j = i; j < size; j++)
					map[j] = map[j + 1];

				return value;
			}
		}
		return null;
	}

	/**
	 * Calculates the load factor of the hash map.
	 * Since the size is fixed, this will never be greater than 1.
	 *
	 * @return a float value representing the load factor
	 */
	public float load(){
		return (float)(size) / (float)(completeSize);
	}
}
