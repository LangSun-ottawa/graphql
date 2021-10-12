package com.example.graphql.resover;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.po.GroupProduct;
import com.example.graphql.po.Wechat;
import com.example.graphql.repository.ProductRepository;
import com.example.graphql.repository.WechatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Lang
 */
@Repository
public class ProductResolver implements GraphQLResolver<GroupProduct> {
    @Autowired
    private WechatRepository wechatRepository;

    public Wechat getWechat(GroupProduct groupProduct) {
        System.out.println(groupProduct);
        Wechat byId = wechatRepository.findById(groupProduct.getWechatId()).get();
        System.out.println(byId);
        return byId;
    };
}
