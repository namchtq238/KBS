package com.kbs.repo;

import com.kbs.model.LongMay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LongMayRepo extends JpaRepository<LongMay, Integer> {
}
