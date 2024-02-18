package com.example.repository;

import com.example.model.TacoOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder,Long> {
//    List<TacoOrder> findByDeliveryZip(String deliveryZip);
//
//    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
//            String deliveryZip, Date startDate, Date endDate);
//
//    @Query("Order o where o.deliveryCity=’Seattle’")
//    List<TacoOrder> readOrdersDeliveredInSeattle();
}
