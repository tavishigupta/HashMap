/**
 * Wrapper class to keep track of all key and value pairs in the hashmap.
 * This class has accessor methods to get and set values to different keys.
 *
 * @author Tavishi Gupta */

public class Entry<K, V> {
	private final K key;
	private V value;

	/**
	 * Constructor method initializes an instance of the class with
	 * a key/value pair.
	 *
	 * @param key the key of the key/value pair.
	 * @param value the value of the key/value pair.
	 */
	public Entry(K key, V value){
		this.key = key;
		this.value = value;
	}

	/**
	 * Getter method for the key of an entry.
	 *
	 * @return the appropriate key.
	 */
	public K getKey(){
		return key;
	}

	/**
	 * Getter method for the value of an entry.
	 *
	 * @return the appropriate value.
	 */
	public V getValue(){
		return value;
	}

	/**
	 * Setter method to set the value of a key.
	 *
	 * @param value the value of a key.
	 */
	public void setValue(V value){
		this.value = value;
	}
}
