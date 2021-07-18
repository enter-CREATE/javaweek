package com.example.delicious.services.impl;


import com.example.delicious.dataobject.DelicacyDetail;
import com.example.delicious.repository.DelicacyDetailRepository;
import com.example.delicious.services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    DelicacyDetailRepository repository;

    @Override
    public DelicacyDetail findOne(String detailId){
        return repository.findById(detailId).orElse(null);
    }

    @Override
    public List<DelicacyDetail> findUpAll() {
        return repository.findAll();
    }

    @Override
    public Page<DelicacyDetail> findAll(Pageable pageable) {
        Page<DelicacyDetail> DelicacyDetailPage =repository.findAll(pageable);
        return DelicacyDetailPage;
    }

    @Override
    public List<DelicacyDetail> findByName(@Param("delicacy_name") String delicacy_name){
        return repository.findByName(delicacy_name);
    }

    @Override
    public DelicacyDetail save(DelicacyDetail delicacyDetail){
        return repository.save(delicacyDetail);
    }
}
