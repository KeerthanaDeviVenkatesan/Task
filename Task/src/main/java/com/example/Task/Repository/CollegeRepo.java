package com.example.Task.Repository;

import com.example.Task.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepo extends JpaRepository<College,Long> {
}
