public class Student
{
public void identity(String x, int y)
{
String name = x;
int roll_no = y;
System.out.println("Name = "+ name);
System.out.println("Roll no. = " + roll_no);
}
public void main()
{ 
Student st = new Student();
st.identity("John", 2);
}
}
