package com.kbs.repo;

import com.kbs.model.SacThai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SacThaiRepo extends JpaRepository<SacThai, Integer> {
}
