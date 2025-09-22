package application;

import java.util.Date;

import entities.Order;
import entitiesEnum.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1800, new Date(), OrderStatus.PEDING_PAYMANT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DEVILERED;
		OrderStatus os2 = OrderStatus.valueOf("DEVILERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
	}

}
