package com.kbs.repo.tuongdongrepo;

import com.kbs.model.modelsimi.TuongDongMat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TuongDongMatRepo extends JpaRepository<TuongDongMat, Integer> {
    @Query(value = "select gia_tri from tuong_dong_mat where thuoc_tinh_co_san = ?1 and thuoc_tinh_vao = ?2", nativeQuery = true)
    Float getGiaTri(int idDb, int idInput);
}
