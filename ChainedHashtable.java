package chainingHT;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

	private LinkedList<HashedObject>[] hashtable;

	@SuppressWarnings("unchecked")
	public ChainedHashtable(int size) {

		hashtable = new LinkedList[size];

		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<HashedObject>();
		}

	}

	public void put(String key, Person value) {

		int hashedKey = hashKey(key);

		hashtable[hashedKey].add(new HashedObject(key, value));
	}

	public Person get(String key) {

		int hashedKey = hashKey(key);

		ListIterator<HashedObject> iterator = hashtable[hashedKey].listIterator();

		HashedObject temp = null;

		while (iterator.hasNext()) {
			temp = iterator.next();
			if (temp.key.equals(key)) {
				return temp.person;
			}

		}

		return null;
	}

	public Person remove(String key) {

		int hashedKey = hashKey(key);

		ListIterator<HashedObject> iterator = hashtable[hashedKey].listIterator();

		HashedObject temp = null;
		int index = -1;

		while (iterator.hasNext()) {

			temp = iterator.next();
			index++;
			if (temp.key.equals(key)) {
				break;
			}

		}

		if (temp != null && temp.key.equals(key)) {

			hashtable[hashedKey].remove(index);
			return temp.person;

		} else
			return null;
	}

	private int hashKey(String key) {

		//return Math.abs(key.hashCode()) % hashtable.length;
		return key.length() % hashtable.length;

	}

	public void printHashtable() {

		for (int i = 0; i < hashtable.length - 1; i++) {
			
			if (hashtable[i].isEmpty()) {
				System.out.println("Empty");
			} else {
				ListIterator<HashedObject> looper = hashtable[i].listIterator();
				while (looper.hasNext()) {
					System.out.print(looper.next().person.getName() + "=>");
				}
				System.out.println("null");
			}
		}
	}

}
