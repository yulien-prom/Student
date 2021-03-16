package com.student.system.Service;

import com.student.system.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudent();

    Optional<Student> getStudentById(String idStudent);

    String saveStudent(Student student);


}
