package com.example.delicious.repository;

import com.example.delicious.dataobject.CulinaryTreasures;
import com.example.delicious.dataobject.DelicacyDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CulinaryTreasuresRepository extends JpaRepository<CulinaryTreasures,String> {
    @Query(value = "select * from culinary_treasures where delicacy_name like CONCAT('%',:delicacy_name,'%')",nativeQuery = true)
    List<CulinaryTreasures> findByName(@Param("delicacy_name") String delicacy_name);
}
