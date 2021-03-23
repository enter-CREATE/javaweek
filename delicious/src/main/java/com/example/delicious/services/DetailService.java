package com.example.delicious.services;

import com.example.delicious.dataobject.DelicacyDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DetailService {
    //查询一个美食
    DelicacyDetail findOne(String detailId);
    //查询所有
    List<DelicacyDetail> findUpAll();
    //分页查询
    Page<DelicacyDetail> findAll(Pageable pageable);
    //通过菜名查询
    List<DelicacyDetail> findByName(@Param("delicacy_name") String delicacy_name);
}
