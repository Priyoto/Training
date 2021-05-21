package Day1.Exercise4;

public final class Employee {
		
	private final String firstname;
	private final String lastname;
	private final int age;
	private final String company;
	private final int experience;
	
	public Employee(Builder builder) {
		this.firstname = builder.firstname;
		this.lastname=builder.lastname;
		this.age =builder.age;
		this.company =builder.company;
		this.experience =builder.experience;
		
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	public String getCompany() {
		return company;
	}
	public int getExperinece() {
		return experience;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", company=" + company
				+ ", experience=" + experience + "]";
	}
	public static class Builder{
		private  String firstname;
		private  String lastname;
		private  int age;
		private String company;
		private int experience;
		
		public Builder Firstname(String name) {
			this.firstname=name;
			return this;
		}
		
		public Builder Lastname(String name) {
			this.lastname=name;
			return this;
		}
		
		public Builder Age(int age) {
			this.age=age;
			return this;
		}
		
		public Builder Compay(String company) {
			this.company=company;
			return this;
		}
		
		public Builder Experience(int exp) {
			this.experience=exp;
			return this;
		}
		
		public Employee build() {
			if(firstname==null)
				throw new FirstNameException();
	         return new Employee(this);
	       }
		
	}
	
}
