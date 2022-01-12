package com.kbs.repo;

import com.kbs.model.Mui;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuiRepo extends JpaRepository<Mui, Integer> {
}
