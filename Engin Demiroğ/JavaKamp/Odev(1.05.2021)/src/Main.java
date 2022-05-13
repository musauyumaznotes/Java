
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Musa","Uyumaz","fafsafas");
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(student1);
		studentManager.remove(student1);
		studentManager.update(student1);
		
		InstructorManager.add(student1);
		

	}

}
