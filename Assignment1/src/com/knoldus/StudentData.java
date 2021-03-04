package com.knoldus;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class StudentData {

    static Student s1 = new Student("Riya",1, Optional.ofNullable(Arrays.asList("English","Maths")));
    static Student s2 = new Student("Elena",2,Optional.ofNullable(null));
    static Student s3 = new Student("John",3,Optional.ofNullable(Arrays.asList("Hindi","SocialScience")));
    static Student s4 = new Student("Honey",4,Optional.ofNullable(Arrays.asList("Computer","Economics")));
    static Student s5 = new Student("Tiger",5,Optional.ofNullable(Arrays.asList("Science","Maths","EVS")));


    public static List<Student> StudentList()
    {
        List<Student> s = new ArrayList<Student>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);

        return s;

    }

    public static List<ClassRoom> classRoomList()
    {
        ClassRoom obj1=new ClassRoom("xyz",Optional.ofNullable(Arrays.asList(s1,s3)));
        ClassRoom obj2=new ClassRoom("abc",Optional.ofNullable(Arrays.asList(s2,s5)));
        ClassRoom obj3=new ClassRoom("dfg",Optional.ofNullable(Arrays.asList(s4)));
        ClassRoom obj4=new ClassRoom("pqr",Optional.ofNullable(null));

        List<ClassRoom> cr =new ArrayList<>();
        cr.add(obj1);
        cr.add(obj2);
        cr.add(obj3);
       cr.add(obj4);

       return cr;
    }

}


