package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        ProductOrder[] orders = order();
        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount + "원.");

    }
    public static ProductOrder[] order(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[count];

        for (int i = 0; i < orders.length; i++){
            ProductOrder order = new ProductOrder();
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            order.productName = scanner.nextLine();
            System.out.print("가격: ");
            order.price = scanner.nextInt();
            System.out.print("수량: ");
            order.quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = order;
        }
        return orders;
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
