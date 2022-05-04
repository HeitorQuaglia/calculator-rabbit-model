package models;

import lombok.Data;
import models.enums.Operation;

import java.io.Serializable;
import java.math.BigDecimal;

public class Calculation implements Serializable {

    private BigDecimal a;
    private BigDecimal b;
    private Operation operation;

    public Calculation(BigDecimal a, BigDecimal b, Operation operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public BigDecimal getA() {
        return a;
    }

    public BigDecimal getB() {
        return b;
    }

    public Operation getOperation() {
        return operation;
    }
}
