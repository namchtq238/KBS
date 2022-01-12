package com.kbs.repo;

import com.kbs.model.Rang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangRepo extends JpaRepository<Rang, Integer> {
}
