package JavaCampSecondDayHomeworkOne;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id = 1;
		course1.courseName = "Java + React";
		course1.courseTeacher = "Engin Demiroğ";
		
		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "Programlamaya Giriş Temelleri";
		course2.courseTeacher = "Engin Demiroğ";
		
		Course course3 = new Course(3, "C# + Angular", "Engin Demiroğ");
		
		Course [] courses = {course1,course2,course3};
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course1);
		
		
		CourseManager courseManager2 = new CourseManager();
		courseManager.remove(course1);
		
		
	
			
		
	

	
	
	}
	
	
	

}
