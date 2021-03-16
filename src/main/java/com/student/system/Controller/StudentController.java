package com.student.system.Controller;

import com.student.system.Model.Student;
import com.student.system.Service.Implementation.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentServiceImplementation studentServiceImplementation;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentServiceImplementation.getAllStudent();
    }

    @GetMapping("/{idStudent}")
    public Optional<Student> getStudentById(@PathVariable String idStudent){
        return studentServiceImplementation.getStudentById(idStudent);
    }

    @PostMapping
    public String saveStudent(@RequestBody Student student){
        return studentServiceImplementation.saveStudent(student);
    }


}
