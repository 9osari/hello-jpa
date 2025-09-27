package com;

import com.domain.Order;
import com.domain.OrderItem;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        //하나만 생성해 애플리케이션 전체 공유
        //스레드간 공유 절대 X 쓰고 버린다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {
            Order order = new Order();
            order.addOrderItem(new OrderItem());


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }  finally {
            em.close();
        }
        emf.close();
    }
}
