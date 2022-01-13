package com.kbs.repo;

import com.kbs.model.SacThai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface SacThaiRepo extends JpaRepository<SacThai, Integer> {
    @Query(value = "CALL check_sac_thai(:icam_id,:ilong_may_id,:ima_id,:imat_id,:imoi_id,:imui_id,:irang_id,:itran_id);", nativeQuery = true)
    List<Float> sacThaiSimilar(@RequestParam("icam_id") int icam_id, @RequestParam("ilong_may_id") int ilong_may_id,
                               @RequestParam("ima_id") int ima_id, @RequestParam("imat_id") int imat_id,
                               @RequestParam("imoi_id") int imoi_id, @RequestParam("imui_id") int imui_id,
                               @RequestParam("irang_id") int irang_id, @RequestParam("itran_id") int itran_id);
}
