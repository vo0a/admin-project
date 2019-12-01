package com.example.admin_project.repository;

import com.example.admin_project.AdminProjectApplicationTests;
import com.example.admin_project.model.entity.OrderDetail;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderDetailRepositoryTest extends AdminProjectApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setStatus("WATTING");
        orderDetail.setArrivalDate(LocalDate.now().plusDays(2));
        orderDetail.setQuantity(1);
        orderDetail.setTotalPrice(BigDecimal.valueOf(900000));

//        orderDetail.setOrderGroupId(1L); // 어떠한 장바구니에 Long -> OrderGroup
//        orderDetail.setItemId(1L); // 어떠한 상품

        orderDetail.setCreatedAt(LocalDateTime.now());
        orderDetail.setCreatedBy("AdminServer");

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        Assert.assertNotNull(newOrderDetail);
    }
}
