package pl.technologyintouch.model;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class Cost {
    private CostCategory category;
    private DateTime date;
    private BigDecimal amount;
    private String description;

    public CostCategory getCategory() {
        return category;
    }

    public void setCategory(CostCategory category) {
        this.category = category;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
