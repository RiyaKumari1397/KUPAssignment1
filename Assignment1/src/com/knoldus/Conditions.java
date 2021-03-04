package com.knoldus;

import java.util.stream.Collectors;
import java.util.*;

public class Conditions {
    public static void main(String args[])
    {

        //CONDITION-1
            System.out.println(StudentData.StudentList()
                    .stream()
                    .filter(obj -> obj.getSubject().isEmpty())
                    .map(Student::getName)
                    .collect(Collectors.toList()));

    //CONDITION-2
        List<List<Student>> t=StudentData.classRoomList().stream().filter(obj->obj.getRoomID().equals("xyz")).map(k->k.getStudentList().get()).collect(Collectors.toList());

        List<List<String>> l=t.get(0).stream().map(a->a.getSubject().get()).collect(Collectors.toList());

        Set<String> set = l.stream().flatMap(j -> j.stream()).collect(Collectors.toSet());

        System.out.println("List of unique subjects of the students that has  roomID  \"XYZ\". "+set);

        //CONDITION-3
        List<ClassRoom> ls=StudentData.classRoomList()
                .stream()
                .filter(obj -> obj.getStudentList().isPresent())
                .collect(Collectors.toList());
        ls.forEach(obj ->System.out.println("Room " + obj.getRoomID() +   "  :  Hello Student"));
    }
}
