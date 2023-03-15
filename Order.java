/*
Created by Bhupendra Bhojak
Date: 14 Mar.2023
*/

import java.util.Date;
import java.util.Objects;


public class Order {
    final private int orderId;
    final private double price;
    final private String orderType; // B "Bid" or O "Offer "  or "buy" / "sell"
    final private int qty; // size

    private Order prevOrder;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "{orderId=" + orderId +
        ", Price=" + getPrice() + "}";
    }

    private Order nextOrder;

    public int getOrderId() {
        return orderId;
    }

    public boolean isBuy() {
        return orderType.toLowerCase().equals("b");
    }

    public String getOrderType() {
        return orderType;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    final private Date creationTime;

    public Order(int orderId, double price, String orderType, int qty ) {
        this.orderId = orderId;
        this.orderType = orderType;
        this.qty = qty;
        this.price = price;
        this.creationTime = new Date();
    }

    public void setNextOrder(Order nextOrder) {
        this.nextOrder = nextOrder;
    }

    public void setPrevOrder(Order prevOrder){
        this.prevOrder = prevOrder;
    }

    public Order getNextOrder(){
        return nextOrder;
    }
    public Order getPrevOrder(){
        return prevOrder;
    }
}
