package com.example.delicious.services.impl;

import com.example.delicious.dataobject.DelicacyCulture;
import com.example.delicious.repository.DelicacyCultureRepository;
import com.example.delicious.services.CultureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CultureServiceImpl implements CultureService {

    @Autowired
    DelicacyCultureRepository repository;


    @Override
    public List<DelicacyCulture> findAll() {
        return repository.findAll();
    }



}
