package com.example.graphql.repository;

import com.example.graphql.po.Wechat;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author ccx 2020年2月21日
 *
 */
public interface WechatRepository extends JpaRepository<Wechat, Integer> {

}
