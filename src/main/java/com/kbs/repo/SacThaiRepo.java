package com.kbs.repo;

import com.kbs.model.SacThai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SacThaiRepo extends JpaRepository<SacThai, Integer> {
    @Query(value = "CALL check_sac_thai();", nativeQuery = true)
    List<Float> sacThaiSimilar();
}
