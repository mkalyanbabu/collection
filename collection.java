package gprec.cse;


import java.util.*; 


class studentData 
{ 
	int rollno; 
	String student_name; 
	char grade; 
	studentData(int rollno, String student_name, char grade) 
	{ 
		this.rollno = rollno; 
		this.student_name = student_name; 
		this.grade=grade; 
	} 
} 
class CustomArrayList 
{ 
	static ArrayList<studentData> list=new ArrayList<studentData>();
	public static void main(String args[]) 
	{ 
		int n;
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter number of students (>10):");
	    n=sc.nextInt();
		while(n<=2)
		{
			System.out.println("Enter number of students (>10):");
			n=sc.nextInt();
		}
		int rollno[] = new int[n]; 
		String student_name[] =new String[n] ; 
		char grade[] = new char[n]; 
        System.out.println("Enter student details");
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter rollno of student "+(i+1)); 
            rollno[i]=sc.nextInt();
            System.out.println("Enter student_name of student "+(i+1)); 
            sc.nextLine();
            student_name[i]=sc.nextLine();
            System.out.println("Enter grade of student "+(i+1)); 
            grade[i]=sc.next().charAt(0);
            addValues(rollno[i], student_name[i], grade[i]); 
        }
        printValues(list);
	} 
	public static void addValues(int rollno, String student_name, char grade) 
	{
			 
			list.add(new studentData(rollno, student_name, grade));  
	} 
	public static void printValues(ArrayList<studentData> list) 
	{ 
		System.out.println("Student details:");
		for (int i = 0; i < list.size(); i++) 
		{ 
			studentData data = list.get(i); 
			System.out.println(data.rollno+" "+data.student_name+" "+data.grade); 
		} 
	} 
} 
