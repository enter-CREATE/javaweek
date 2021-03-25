package com.example.delicious.repository;

import com.example.delicious.dataobject.DelicacyCulture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DelicacyCultureRepository extends JpaRepository<DelicacyCulture,String> {
    
    List<DelicacyCulture> findAll();

}
