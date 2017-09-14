import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		Student[] student=new Student[n];
		
		for(i=0;i<n;i++)
		{
		int id=s.nextInt();
			String fullname=s.next();
			Date date=s.nextDate();
			double avgmrk=s.nextDouble();
		
		student[i]=new Student(id,fullname,date,avgmrk);
		}
		
			StudentGroup st=new StudentGroup();
			for(i=0;i<n;i++)
			{
				st.setStudent(student[i],i);
			}
			st.display();
	}
}
