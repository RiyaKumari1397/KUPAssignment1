package com.knoldus;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class ClassRoom {
    private String roomID;
    Optional<List<Student>> studentList;

    public ClassRoom(String roomID, Optional<List<Student>> studentList) {
        this.roomID = roomID;
        this.studentList = studentList;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "roomID=" + roomID +
                ", studentList=" + studentList +
                '}';
    }

    public Optional<List<Student>> getStudentList() {
        return studentList;
    }

    public void setStudentList(Optional<List<Student>> studentList) {
        this.studentList = studentList;
    }
}



