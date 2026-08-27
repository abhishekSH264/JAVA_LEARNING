package CLASS.DSA_MODULE_2.DSA_Classes_Objects_Linked_List_Introduction;


public class Students {
    static class Student{
        String Name;
        int age;
        Student(String Name,int Age){
            this.Name = Name;
            this.age = age;
        }
    }
    public static void main(String[] args){
        Student s1 = new Student("Abhishek",24);
        System.out.println(s1.Name);
    }
}
