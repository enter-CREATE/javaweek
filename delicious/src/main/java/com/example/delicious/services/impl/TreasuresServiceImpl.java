package com.example.delicious.services.impl;

import com.example.delicious.dataobject.CulinaryTreasures;
import com.example.delicious.repository.CulinaryTreasuresRepository;
import com.example.delicious.services.TreasuresService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
