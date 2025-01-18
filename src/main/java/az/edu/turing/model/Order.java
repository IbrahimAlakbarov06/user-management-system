package az.edu.turing.model;

import java.util.Objects;

public class Order extends BaseEntity{

    private Long userId;
    private Long productId;

    public Order(Long id, Long userId, Long productId) {
        super(id);
        this.userId = userId;
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Order order = (Order) o;
        return Objects.equals(userId, order.userId) && Objects.equals(productId, order.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, productId);
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", productId=" + productId +
                '}';
    }
}
