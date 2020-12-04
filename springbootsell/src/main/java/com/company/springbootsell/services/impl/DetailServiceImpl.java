package com.company.springbootsell.services.impl;

import com.company.springbootsell.dataobject.OrderDetail;
import com.company.springbootsell.repository.OrderDetailRepository;
import com.company.springbootsell.services.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetailServiceImpl implements DetailService {
    @Autowired
    OrderDetailRepository repository;
    @Override
    public OrderDetail findByOrderId(String orderId){
        return repository.findByOrderId(orderId);
    }

    @Override
    public List<OrderDetail> findAll() {
        return null;
    }

    @Override
    public List<OrderDetail> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<OrderDetail> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<OrderDetail> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(OrderDetail orderDetail) {

    }

    @Override
    public void deleteAll(Iterable<? extends OrderDetail> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends OrderDetail> S save(S s) {
        return null;
    }

    @Override
    public <S extends OrderDetail> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<OrderDetail> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends OrderDetail> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<OrderDetail> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public OrderDetail getOne(String s) {
        return null;
    }

    @Override
    public <S extends OrderDetail> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends OrderDetail> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends OrderDetail> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends OrderDetail> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends OrderDetail> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends OrderDetail> boolean exists(Example<S> example) {
        return false;
    }
}
