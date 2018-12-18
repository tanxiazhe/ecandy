package com.ecandy.order.model;

import java.math.BigDecimal;

public class SalesOrder {
    private String id;
    private BigDecimal totalAmount;





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}
