package com.order;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Optional;

public class OrderServiceImpl {
	
	public static void main(String args[]) {
		   LocalTime time= LocalTime.now(ZoneId.of("Asia/Tokyo"));
		OrderImpl orderService = new OrderImpl();
		OrderPojo orderPojo = new OrderPojo();
		orderPojo.setAmount(40000);
		orderPojo.setOrderName("coco");
		Optional<OrderPojo> orderOptionPojo = orderService.orderNow(orderPojo);
		orderOptionPojo = Optional.ofNullable(orderOptionPojo).orElse(Optional.of(new OrderPojo()));

		if (orderOptionPojo.isPresent()) {
			orderPojo.setStatus("success");
			orderPojo.setTimeZone(time);
			System.out.println("ordered data is " + orderPojo);
			System.out.println("Order Successful");
		} else {
			orderPojo.setStatus("fail");
			System.out.println("Order Failed");
		}

		}

	

}
