package com.company.dao;

import com.company.domain.Admin;

public interface AdminDao {
    public Admin getAdminByNameAndPassword(String adminName,String password);

}
