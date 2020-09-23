package softest;

public class Student {
    /* create variables */
	String name;
	int id_no;
	float marks;
    /* create constructors */
	public Student(String name, int id_no,float marks) {
		this.name = name;
		this.id_no = id_no;
		this.marks = marks;
	}
    /* create getter and setter methods */
	public float get_marks() {
		return marks;
	}

	public void set_marks(float marks) {
		this.marks = marks;
	} 
	
    public String get_name() {
		return name;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public int get_id_no() {
		return id_no;
	}
	public void setId_no(int id_no) {
		this.id_no = id_no;
	}
	/* User defined method to compare two students*/
    public boolean Comparison(Student x, Student y) {
    	if(x.get_marks()>y.get_marks()) return true;
    	else
    	     return false;
    }

	
}
