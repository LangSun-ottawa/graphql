package com.example.graphql.repository;

import com.example.graphql.po.GroupProduct;
import com.example.graphql.po.Wechat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author ccx 2020年2月21日
 *
 */
public interface ProductRepository extends JpaRepository<GroupProduct, Long> {

    List<GroupProduct> findByWechatId(Integer id);
}
