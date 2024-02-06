package ch10.collevtion01.ch15.sec05.exam03;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name =name;
		this.age =age;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name)*-1; //역정렬
	}

//	@Override	나이순서 정렬
//	public int compareTo(Person o) {
//		if(age<o.age) return -1;
//		else if(age == o.age)return 0;
//		else return 1;
//	}

	

}
