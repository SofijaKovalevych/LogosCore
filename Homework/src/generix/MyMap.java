package generix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyMap<K, V> {
	Set<MyEntry<K, V>> set = new HashSet<>();

	public void addSome(K key, V value) {
		set.add(new MyEntry<K, V>(key, value));
		System.out.println(set);
	}

	public void deleteSomeK(K key) {
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K, V> next = iter.next();
			if (next.getKey().equals(key)) {
				iter.remove();
			}
		}
		System.out.println(set);
	}

	public void deleteSomeV(V value) {
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			MyEntry<K, V> next = iter.next();
			if (next.getValue().equals(value)) {
				next.setValue(null);
			}
		}
		System.out.println(set);
	}

	public void getKeys() {
		System.out.println("---------getKeys--------------");
		Set<K> keys = new HashSet<>();
		for (MyEntry<K, V> myEntry : set) {
			keys.add(myEntry.getKey());
		}
		System.out.println(keys);
	}

	public void getValues() {
		System.out.println("GetValues");
		List<V> values = new ArrayList<>();
		for (MyEntry<K, V> myEntry : set) {
			values.add(myEntry.getValue());
		}
		System.out.println(values);
	}

	public void printSomeKV() {
		set.forEach(System.out::println);
	}
}