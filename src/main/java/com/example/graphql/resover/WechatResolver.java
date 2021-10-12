package com.example.graphql.resover;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.po.GroupProduct;
import com.example.graphql.po.Wechat;
import com.example.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Lang
 */
@Repository
public class WechatResolver implements GraphQLResolver<Wechat> {
    @Autowired
    private ProductRepository productRepository;

    @PersistenceContext
    private EntityManager em;

    public List<GroupProduct> products(Wechat wechat) {
        String hsql =" FROM GroupProduct WHERE wechatId = " + wechat.getId();
        return em.createQuery(hsql).setMaxResults(5).getResultList();
    };
}
