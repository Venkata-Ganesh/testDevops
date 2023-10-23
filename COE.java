import java.util.*;
import java.io.*;
public class COE {
public static void main(String args[]) throws Exception {
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	HashMap<String,Integer> list=new HashMap<>();
	String student_name;
	int marks_ca1,ca2,ca3;
	int roll_no;
	String type;
	int j=1;
	try {
	while(j<6) {
     System.out.println("enter "+(j)+"student details");
     student_name=sc.readLine();
     roll_no=Integer.parseInt(sc.readLine());
     marks_ca1=Integer.parseInt(sc.readLine());// 30 marks
     ca2=Integer.parseInt(sc.readLine());//30mrks
     ca3=Integer.parseInt(sc.readLine());//40mrks
     
    	 type=sc.readLine();
    
    	 if(type!="U" || type!="P") {
    		 throw new Exception("Course not available");}
    	 
     
     
     list.put(student_name,(marks_ca1+ca2+ca3));
     j++;
	}
	}
	catch(Exception e) {
   	 System.out.println(e);
    }
	int count=0;
	for(Integer i:list.values()) {
		if(i<40) {
			count++;
		}
		}
	System.out.println(count+"are eligible");
	list.forEach((k,v)-> System.out.println("name : "+k+", marks ="+v));
}
}
