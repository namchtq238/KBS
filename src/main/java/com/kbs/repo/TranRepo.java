package com.kbs.repo;

import com.kbs.model.Tran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranRepo extends JpaRepository<Tran, Integer> {
}
