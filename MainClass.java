package chainingHT;

public class MainClass {

	public static void main(String[] args) {
		
		Person one = new Person(26, "Rohan", "Patna");
		Person two = new Person(21, "Abhijeet", "Kolkata");
		Person three = new Person(22, "Ankita", "Bangalore");
		Person four = new Person(24, "Richa", "Ranchi");
		Person five = new Person(24, "Rahul", "Raipur");

		ChainedHashtable ht = new ChainedHashtable(10);
		
		ht.put("Rohan", one);
		ht.put("Abhijeet", two);
		ht.put("Ankita", three);
		ht.put("Richa", four);
		ht.put("Rahul", five);
		

		ht.printHashtable();
		
		System.out.println();
		System.out.println(ht.get("Richa").getName());
		//System.out.println(ht.get("Ankita").getName());
		
		System.out.println("Removed : " + ht.remove("Richa").getName());
		System.out.println();
		ht.printHashtable();

	}

}
