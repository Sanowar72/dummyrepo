package com.geekster.studentmanagement.controller;

import com.geekster.studentmanagement.model.Student;
import com.geekster.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;


    @GetMapping("home")
    public String home(){
        return "this is home for testing.......";
    }
    @GetMapping("all-user")
    public List<Student> getallStudent(){
        return studentService.getallStudent();
    }

    @PostMapping("user")
    public String saveUser(@RequestBody List<Student> students){
        studentService.saveall(students);
        return "user Added Successfully....";
    }
    @GetMapping("user/{id}")
    public List<Student> getById(@PathVariable int id){
        return studentService.getById(id);
    }

    @PutMapping("{id}/{name}")
    public String updateNameById(@PathVariable int id,@PathVariable String name){
        studentService.updateById(id,name);
        return "updated....";
    }
    @DeleteMapping("userId/{id}")
    public List<Student> deleteById(@PathVariable int id){
        return studentService.deleteById(id);
//        return "user deleted Successfully.......";
    }
}
