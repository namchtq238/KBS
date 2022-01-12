package com.kbs.repo;

import com.kbs.model.Mat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatRepo extends JpaRepository<Mat, Integer> {
}
