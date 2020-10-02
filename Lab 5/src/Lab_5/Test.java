package Lab_5;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Name n1 = new Name("Sourabh,S,Yelluru");
		System.out.println(n1.getName());
		Name n2 = new Name("Yelluru;S;Sourabh");
		System.out.println(n2.getName());
	}
}
class Name{
	private String fname; //First Name
	private String mname; //Middle Name
	private String lname; // Last Name
	Name(String name){
		StringTokenizer st1;
		int flag=0;
		if(name.indexOf(",")!=-1) st1 = new StringTokenizer(name,",");
		else{
			flag = 1;
			st1 = new StringTokenizer(name,";");
		}
		if(flag==0) {
			fname = st1.nextToken();
			mname = st1.nextToken();
			lname = st1.nextToken();
		}
		else {
			lname = st1.nextToken();
			mname = st1.nextToken();
			fname = st1.nextToken();
		}
	}	

	public String getName() {
		String finalname = fname + " " + mname + " " + lname;
		return finalname;
	}
}
class Student {
	private Name name;
	private int age;
	
	public Student(Name name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		String res = name.getName() + " " + this.age;
		return res;
	}
}

class StudentList{
	public static Student[] List= new Student[10];
	public static int count = 0; //Count of student added in the list
	
	public static void addStudent(Student std) {
		if(count>=20) return;
		List[count]  = std;
		count++;
	}
	
	public static Student[] getStudentsWith(int age) {
		int count = 0,j=0;
		for(int i=0;i<10;i++) {
			Student x = List[i];
			if(x.getAge()==age) count++;
		}
		Student[] res = new Student[count];
		for(int i=0;i<10;i++) {
			Student x = List[i];
			if(x.getAge()==age) {
				res[j]=x;
				j++;
			}
		}
		return res;
	}
	
	public static Student[] getStudentsWithLastName(String lastName) {
		int count = 0,j=0;
		for(int i=0;i<10;i++) {
			Student x = List[i];
			Name xname = x.getName();
			String funame = xname.getName();
			StringTokenizer st = new StringTokenizer(funame," ");
			String laname = st.nextToken();
			laname = st.nextToken();
			laname = st.nextToken();
			if(laname == lastName) count++;
		}

		Student[] res =  new Student [count];
		for(int i=0;i<10;i++) {
			Student x = List[i];
			Name xname = x.getName();
			String funame = xname.getName();
			StringTokenizer st = new StringTokenizer(funame," ");
			String laname = st.nextToken();
			laname = st.nextToken();
			laname = st.nextToken();
			if(laname == lastName) {
				res[j]=x;
				j++;
			}
		}
		return res;
	}
	public static Student[] getStudentsinRange(int minAge, int maxAge) {
		int count = 0,j=0;
		for(int i=0;i<10;i++) {
			Student x = List[i];
			int xage = x.getAge();
			if(xage<maxAge && xage>minAge) count++;
		}
		Student[] res = new Student [count];
		for(int i=0;i<10;i++) {
			Student x = List[i];
			int xage = x.getAge();
			if(xage<maxAge && xage>minAge) {
				res[j]=x;
				j++;
			}
		}
		return res;
	}
}