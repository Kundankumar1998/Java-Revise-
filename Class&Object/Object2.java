class Student{
    int roll;
    String name;
    int age;
    String Course;
    //creating constructore
    Student(int roll,String name,int age,String Course){
        this.roll=roll;
        this.name=name;
        this.age=age;
        this.Course=Course;
    }
    void DisplayDetails(){
        System.out.println("Roll="+roll);
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Course="+Course);
    }
}
public class Object2{
    public static void main(String ar[])
    {
        Student st=new Student(21307,"Kundan",26,"Mca");
        st.DisplayDetails();
    }
}