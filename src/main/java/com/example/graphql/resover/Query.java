package com.example.graphql.resover;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.po.GroupProduct;
import com.example.graphql.po.Wechat;
import com.example.graphql.repository.ProductRepository;
import com.example.graphql.repository.WechatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Lang
 */
@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private WechatRepository wechatRepository;

    @Autowired
    private ProductRepository productRepository;

    @PersistenceContext
    private EntityManager em;

    public List<Wechat> wechats() {
        return wechatRepository.findAll();
    }

    public List<GroupProduct> products() {
        List<GroupProduct> list = productRepository.findAll().subList(0, 10);
        return list;
    }

    public GroupProduct productByWechatId(int id) {
        Wechat wechat = wechatRepository.findById(id).get();
        List<GroupProduct> list = productRepository.findByWechatId(wechat.getId());
        return list.get(0);
    }

    public List<GroupProduct> productsByWechatId(int id, int limit) {
        Wechat wechat = wechatRepository.findById(id).get();
        String hsql =" FROM GroupProduct WHERE wechatId = " + wechat.getId();
        return em.createQuery(hsql).setMaxResults(limit).getResultList();
    }
}
