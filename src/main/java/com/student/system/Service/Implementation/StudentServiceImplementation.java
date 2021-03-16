package com.student.system.Service.Implementation;

import com.student.system.Model.Student;
import com.student.system.Repository.StudentRepository;
import com.student.system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(String idStudent) {
        return studentRepository.findById(idStudent);
    }

    @Override
    public String saveStudent(Student Student) {
        studentRepository.save(Student);
        return "Student was saved";
    }
}
