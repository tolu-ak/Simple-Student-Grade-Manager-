package a3;

 public class Student {
	private int grade; //declaring variable grade
	private String name; //declaring variable string
	
	public Student (String name, int grade) {  //constructor
		this.name=name;
		this.grade=grade;
	}
	
	
	public String getname() {    
	return name;
		
	}
	
   public Student(int grade) { //creating constructor for grade
	this.grade=grade;
			
	}
	
   public int getGrade() {  //getter method for grade
   return grade;
	   
   
   }
   public void setGrade(int grade) { //setter method for grade 
	   this.grade=grade;
   }
   
 }
 
