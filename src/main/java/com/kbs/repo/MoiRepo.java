package com.kbs.repo;

import com.kbs.model.Moi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoiRepo extends JpaRepository<Moi, Integer> {
}
