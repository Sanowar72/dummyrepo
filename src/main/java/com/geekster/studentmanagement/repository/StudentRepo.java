package com.geekster.studentmanagement.repository;

import com.geekster.studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.*;

@Repository
public class StudentRepo {

    public List<Student> studentList=new ArrayList<>();
    public StudentRepo(){
        Student tempData=new Student(0,"sanowar alam","banglore india","7903288853");
        studentList.add(tempData);
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public void saveall(List<Student> students) {
        studentList.addAll(students);
    }

    public List<Student> getById(int id) throws NoSuchElementException {
        List<Student> student = new ArrayList<>();
        for (Student ele : studentList) {
            if (ele.getStudentId() == id) {
                student.add(ele);
                return student;
            }
        }
        throw new NoSuchElementException("Student with ID " + id + " not found");
    }

    public List<Student> deleteById(int id) throws NoSuchElementException{
        for (Student ele : studentList) {
            if(ele.getStudentId()==id){
               studentList.remove(ele);
               return studentList;
            }
        }
        throw new NoSuchElementException("Student with ID " + id + " not found");
    }

    public void updateById(int id, String name) {
        for (Student ele : studentList) {
            if(ele.getStudentId()==id){
               ele.setStudentName(name);
            }
        }
    }
}
