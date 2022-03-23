package Model;

public class Bid {
    Long id;
    Long accountId;
    String stockName; //4 high English letters
    int quantity;
    double price;

    public Bid(Long id, Long accountId, String stockName, int quantity, double price) {
        this.id = id;
        this.accountId = accountId;
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


//    public Bid() {
//    }

}
