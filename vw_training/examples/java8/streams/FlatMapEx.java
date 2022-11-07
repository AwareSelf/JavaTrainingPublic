package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEx {

	public static void main(String[] args) {
	
		String[][] arr = {{"a","b"},{"c","d"},{"e","f"}};
		Stream<String[]> str = Stream.of(arr);
		Stream<String[]> str1 = Arrays.stream(arr);
		str.forEach(x->System.out.println(Arrays.toString(x)));
		str1.forEach(x->System.out.println(Arrays.toString(x)));

		//flatten the 2d array into 1d array and filter out
		//all strings except string "a"
		List<String> lst = Stream.of(arr).flatMap(Stream::of)
		.filter(x->!"a".equals(x))
		.collect(Collectors.toList());
		
		lst.forEach(System.out::println);
		
		
		List<Student> l = new ArrayList<Student>();
		Student s1 = new Student(1,new String[] {"java","c","python"});
		Student s2 =  new Student(2,new String[] {"c++","microservices","oracle"});
		l.add(s1);
		l.add(s2);
		
		//Set<String> diffcourses = l.stream().flatMap(null);
	}

}

class Student
{
	int id;
	String[] courses;
	
	
	public Student(int id, String[] courses) {
		super();
		this.id = id;
		this.courses = courses;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", courses=" + Arrays.toString(courses) + "]";
	}
	
	
}
