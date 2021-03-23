package com.example.delicious.services.impl;

import com.example.delicious.dataobject.CulinaryTreasures;
import com.example.delicious.dataobject.DelicacyDetail;
import com.example.delicious.repository.CulinaryTreasuresRepository;
import com.example.delicious.services.TreasuresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreasuresServiceImpl implements TreasuresService {
    @Autowired
    private CulinaryTreasuresRepository repository;

    @Override
    public CulinaryTreasures findOne(String culinaryId){
        return repository.findById(culinaryId).orElse(null);
    }

    @Override
    public List<CulinaryTreasures> findAll(){
        return repository.findAll();
    }

    @Override
    public List<CulinaryTreasures> findByName(@Param("delicacy_name") String delicacy_name){
        return repository.findByName(delicacy_name);
    }
}
