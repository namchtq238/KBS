package com.kbs.repo;

import com.kbs.model.Cam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamRepo extends JpaRepository<Cam, Integer> {
}
