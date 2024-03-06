package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder product1 = createOrder("두부", 6000, 2);
        ProductOrder product2 = createOrder("김치", 5000, 1);
        ProductOrder product3 = createOrder("콜라", 1500, 2);
        ProductOrder[] orders = {product1, product2, product3};
        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount + "원.");

    }
    public static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    public static void printOrder(ProductOrder[] orders){
        for (ProductOrder p : orders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }
    }
    public static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (int i = 0; i < 3; i++){
            totalAmount += orders[i].price * orders[i].quantity;
        }
        /*for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }*/
        return totalAmount;
    }
}
