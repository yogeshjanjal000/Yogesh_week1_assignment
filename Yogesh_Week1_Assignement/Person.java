class Person
{
	
		private String name;
		private int age;
		
		public Person(String name, int age){
			this.name=name;
			this.age=age;
		}
		
		public String getName(){
			return name;
		}

		public int getAge(){
			return age;
		}

		public void display(){
			System.out.println("Name =\t"+name);
			System.out.println("age =\t"+age);
		}

	public static void main(String[] args){
    Person person=new Person("Shyam",22);
	person.display();
	}
}
