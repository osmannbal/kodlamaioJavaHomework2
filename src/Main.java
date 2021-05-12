public class Main {

    public static void main(String[] args) {
	Student student = new Student();
	student.setId(1);
	student.setStudentNumber(1);
	student.setFirstName("Osman");
	student.setLastName("Bal");
	student.setEmail("osman@osman.com");
	student.setPassword("123456");

	UserManager userManager = new UserManager();
	userManager.Add(student);

	StudentManager studentManager = new StudentManager();
	studentManager.add(new FileLogger());
    }
}
