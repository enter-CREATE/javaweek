package com.example.delicious.repository;

import com.example.delicious.dataobject.DelicacyDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DelicacyDetailRepository extends JpaRepository<DelicacyDetail,String> {
}
