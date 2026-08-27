package CLASS.DSA_MODULE_2.DSA_Classes_Objects_Linked_List_Introduction;

public class Book {
    static class student{
        String Name;
        int Age;
        student(){
            Name = "Bikram";
            Age = 24;
        }
    }
    public static void main(String[] args){
        student s1 = new student();
        System.out.println(s1.Name);
        System.out.println(s1.Age);
        student s2 = new student();
        System.out.println(s2.Name);
    }

}

