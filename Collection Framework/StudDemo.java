//StudDemo.java
import java.util.*;
import sp.Student;
import sdr.StudentDataRead;
class StudDemo
{
 public static void main(String[] args)
{
 Student s1 = new Student(101,"Ram",18.8f); 
 Student s2 = new Student(102,"Rohan",19.6f); 
 Student s3 = new Student(103,"Sohan",20); 

 // Return all the student object by adding them into 1d collection framework var

 ArrayList al = new ArrayList();
 al.add(s1);
 al.add(s2);
 al.add(s3);
 StudentDataRead sdr = new StudentDataRead();
 sdr.readStudData(al);
 }
}