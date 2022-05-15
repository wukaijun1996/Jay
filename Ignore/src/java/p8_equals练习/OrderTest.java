package src.java.p8_equals练习;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;

import java.util.Objects;

public class OrderTest {
    @Test
    public static void main(String[] args) {

        Order order1 = new Order(1000,"asq");
        Order order2 = new Order(1000,"bbb");

        System.out.println(order1.equals(order2));

        Order order3 = new Order(1000,"bbb");
        System.out.println(order2.equals(order3));

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }

}

class Order {
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }


    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (obj instanceof Order){
            Order order = (Order) obj;
            return this.orderId == order.orderId &&  this.orderName.equals(order.orderName);
        }

        return false;

    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }

}