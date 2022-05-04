package models;

import java.io.Serializable;
import java.math.BigDecimal;

public class CalculationResult implements Serializable {
    private final BigDecimal result;

    public CalculationResult(BigDecimal result) {
        this.result = result;
    }

    public BigDecimal getResult() {
        return result;
    }
}
