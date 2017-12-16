package generix;

import java.io.Serializable;

public class MyEntry<K, V> implements Serializable {

	private static final long serialVersionUID = 5139123533162365557L;

	private K Key;

	private V Value;

	public MyEntry(K key, V value) {
		Key = key;
		Value = value;
	}

	public K getKey() {
		return Key;
	}

	public void setKey(K key) {
		Key = key;
	}

	public V getValue() {
		return Value;
	}

	public void setValue(V value) {
		Value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Key == null) ? 0 : Key.hashCode());
		result = prime * result + ((Value == null) ? 0 : Value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEntry<?, ?> other = (MyEntry<?, ?>) obj;
		if (Key == null) {
			if (other.Key != null)
				return false;
		} else if (!Key.equals(other.Key))
			return false;
		if (Value == null) {
			if (other.Value != null)
				return false;
		} else if (!Value.equals(other.Value))
			return false;
		return true;
	}

	@Override
		public String toString() {
			return "MyEntry [Key=" + Key + ", Value=" + Value + "]";
		}
}