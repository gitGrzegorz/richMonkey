package pl.technologyintouch.model;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class Income {
    private BigDecimal amount;
    private DateTime date;
    private String description;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
