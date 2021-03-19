package com.example.delicious.services;

import com.example.delicious.dataobject.CulinaryTreasures;

import java.util.List;

public interface TreasuresService {

    public CulinaryTreasures findOne(String culinaryId);

    public List<CulinaryTreasures> findAll();
}
