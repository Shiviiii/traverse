import java.util.*;
class Solution
{
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String inp = sc.nextLine();
			if(inp=="Served")
				pq.poll();
			else
            {
				String name = sc.nextLine();
				float cgpa = sc.nextFloat() ;
				int token = sc.nextInt();
				pq.add(new Student(name,cgpa,token));
			}
		}
	}
}
class Student
{
	String name;
	float cgpa;
	int token;
	Student(String name  ,float cgpa,int token)
	{
		this.name = name;
		this.cgpa = cgpa;
		this.token = token;
	}
}
class StudentComparator implements Comparator<Student>
{
	public int compare(Student s1 , Student s2)
	{
		int t1 = s1.token,t2 = s2.token;
		float c1 = s1.cgpa ,c2 = s2.cgpa;
		int token_compare  =t1-t2;
		int cgpa =(int) (c1-c2);
		if(token_compare == 0 )
			  return ((cgpa==0)?token_compare:cgpa);
		else
		      return token_compare;	
	}
}