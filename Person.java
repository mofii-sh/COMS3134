public class Person implements Comparable<Person>{
	private String firstName;
	private String lastName;

	public Person(String last, String, first){
		lastName = last;
		firstName = first;
	}

	@Override
	public int compareTo(Person other){
		int lastNameComp = lastName.compareTo(other.lastName);
		if (lastNameComp == 0){
			return firstName.compareTo(other.firstName);
		}else{
			return lastNameComp;
		}
	}

	@Override
	public String toString(){
		return firstName + " " + lastName;
	}
}