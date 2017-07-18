package com.werner.di.dao.impl;

import com.werner.di.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * ┌─┐       ┌─┐ + +
 * ┌──┘ ┴───────┘ ┴──┐++
 * │                 │
 * │       ───       │++ + + +
 * ███████───███████ │+
 * │                 │+
 * │       ─┴─       │
 * │                 │
 * └───┐         ┌───┘
 * │         │
 * │         │   + +
 * │         │
 * │         └──────────────┐
 * │                        │
 * │                        ├─┐
 * │                        ┌─┘
 * │                        │
 * └─┐  ┐  ┌───────┬──┐  ┌──┘  + + + +
 * │ ─┤ ─┤       │ ─┤ ─┤
 * └──┴──┘       └──┴──┘  + + + +
 * 神兽保佑
 * 代码无BUG!
 */
@Repository   //dao层
//@Component("baseDao")
public class BaseDaoImpl<T> implements BaseDao<T> {
    @Resource
    private SessionFactory sf;


    @Override
    public int save(T t) {
        return 0;
    }

    @Override
    public int saveList(List<T> datas) {

//        Session session = sf.openSession();//线程共享
        Session session = sf.getCurrentSession();
        //单独的线程  需要在xml配置
        //提交后自动关闭session
        Transaction transaction = session.beginTransaction();
        for (int i = 0; i < datas.size(); i++) {
            session.save(datas.get(i));
        }

        transaction.commit();
//        EntityManager em = JpaUtitls.getEntityManager();
//        EntityTransaction transaction = em.getTransaction();
//        try {
//            transaction.begin();
//            for (int i = 0; i < datas.size(); i++) {
//                em.persist(datas.get(i));
//            }
//            transaction.commit();
//        } catch (Exception e) {
//            transaction.rollback();
//            e.printStackTrace();
//        } finally {
//            JpaUtitls.close();
//        }
        boolean open = session.isOpen();
        System.out.println(open);
        return 0;
    }

}
