package com.example;

import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemManagementSystemApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SystemManagementSystemApplication.class,args);


    }
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        /*Student student1= new Student("Gleb","Tolkachev","something@power.org","math");

        studentRepository.save(student1);
        Student student2= new Student("Linyx","prydnikova","something@power.org","math");

        studentRepository.save(student2);
        Student student3= new Student("Kate","Tarasevich","something@power.org","math");

        studentRepository.save(student3);
    */}

}
