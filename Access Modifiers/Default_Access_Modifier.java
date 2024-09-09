// This class is having default access modifier
class Student{
    int roll;
    String name;
    Student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;   
    }
    void DisplayDetails()
    {
        System.out.println("Roll="+roll);
        System.out.println("Name"+name); 
    }
}
public class Default_Access_Modifier {

    public static void main(String[] args) {
        Student st=new Student(21307,"kundan");
        st.DisplayDetails();;
    }
}