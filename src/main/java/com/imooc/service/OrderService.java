package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    /**
     * 创建订单,这是用来测试的一句话
      */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个订单
     */
    OrderDTO findOne(String orderId);
    /**
     * 查询订单列表
     */
    Page<OrderDTO> findList(String buyerId, Pageable pageable);

    /**
     * 取消订单
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     */

    OrderDTO finish(OrderDTO orderDTO);

    /**
     *支付订单
     */

    OrderDTO paid(OrderDTO orderDTO);

    /**
     * 查询所有订单
     * @param pageable
     * @return
     */
    Page<OrderDTO> findList(Pageable pageable);
}
