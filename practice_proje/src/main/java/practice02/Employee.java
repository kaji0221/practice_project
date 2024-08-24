package practice02;

public class Employee {
	private String name;
	private int age;

	public Employee() {
		this.name = "名前なし";
		this.age = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
