package com.geekster.studentmanagement.service;

import com.geekster.studentmanagement.model.Student;
import com.geekster.studentmanagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public List<Student> getallStudent() {
        return studentRepo.getStudentList();
    }

    public void saveall(List<Student> students) {
        studentRepo.saveall(students);
    }

    public List<Student> getById(int id) {
        return studentRepo.getById(id);
    }

    public List<Student> deleteById(int id) {
        return studentRepo.deleteById(id);
    }

    public void updateById(int id, String name) {
        studentRepo.updateById(id,name);
    }
}
