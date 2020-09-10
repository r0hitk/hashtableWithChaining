package chainingHT;

public class Person {
	private int age;
	private String name;
	private String city;

	Person(int age, String name, String city) {
		this.age = age;
		this.name = name;
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
