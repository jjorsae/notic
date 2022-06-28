package com.example.notic.mapper;

import com.example.notic.domain.Notic;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeMapper {
    int noticCount();
    List<Notic> getList();
}
