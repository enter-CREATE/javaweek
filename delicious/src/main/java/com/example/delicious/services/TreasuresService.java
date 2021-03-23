package com.example.delicious.services;

import com.example.delicious.dataobject.CulinaryTreasures;
import com.example.delicious.dataobject.DelicacyDetail;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TreasuresService {

    public CulinaryTreasures findOne(String culinaryId);

    public List<CulinaryTreasures> findAll();
    //通过菜名查询
    List<CulinaryTreasures> findByName(@Param("delicacy_name") String delicacy_name);

}
