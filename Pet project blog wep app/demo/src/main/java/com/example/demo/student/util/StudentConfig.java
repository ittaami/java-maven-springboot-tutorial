package com.example.demo.student.util;

import com.example.demo.student.Student;
import com.example.demo.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args ->
        {
            Student Jacob = new Student(
                    "Jacob",
                    "jacob@gmail.com",
                    LocalDate.of(1999, JANUARY, 1)
            );

            Student Alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2003, JANUARY, 1)
            );

            repository.saveAll(List.of(Jacob, Alex));
        };
    }
}
