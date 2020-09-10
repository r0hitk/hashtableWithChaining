package chainingHT;

import java.util.LinkedList;

public class ChainedHashtable {

	private LinkedList<HashedObject>[] hashtable;

	@SuppressWarnings("unchecked")
	public ChainedHashtable(int size) {

		hashtable = new LinkedList[size];

		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<HashedObject>();
		}

	}
	

}
