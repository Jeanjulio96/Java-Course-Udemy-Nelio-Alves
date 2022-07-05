package application;

import entities.OrderEnum;
import entities.enums.OrderStatus;

import java.util.Date;

public class enumProgram {

    public static void main(String[] args) {

        OrderEnum order = new OrderEnum(1080,new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        // Convertendo string para enum

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }


}
