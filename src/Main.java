import java.util.Date;

import entites.Order;
import entites.Enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(), OrderStatus.PEDING_PAYMENT);
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
		
	}
	

}
