package com.kbs.repo;

import com.kbs.model.Ma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaRepo extends JpaRepository<Ma, Integer> {
}
