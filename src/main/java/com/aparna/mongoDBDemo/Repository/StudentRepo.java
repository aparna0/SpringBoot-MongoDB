package com.aparna.mongoDBDemo.Repository;

import com.aparna.mongoDBDemo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepo extends MongoRepository<Student, String> {
}
