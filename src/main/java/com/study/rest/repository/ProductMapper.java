package com.study.rest.repository;

import com.study.rest.entity.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    // insert, update, delete는 리턴타입이 무조건 int(성공개수), select만 리턴타입을 설정
    int save(Product product);
}
