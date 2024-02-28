package class1.ex;

import java.util.Scanner;

public class ProductOrderMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        ProductOrder productOrder3 = new ProductOrder();
        ProductOrder[] products= {productOrder1, productOrder2, productOrder3};
        int sum = 0;

        for (int i = 0; i < products.length; i++){
            System.out.print("상품명을 입력해주세요: ");
            products[i].productName = scanner.nextLine();
            System.out.print("가격을 입력해주세요: ");
            products[i].price = scanner.nextInt();
            System.out.print("수량을 입력해주세요: ");
            products[i].quantity = scanner.nextInt();
            scanner.nextLine();
            sum += (products[i].price * products[i].quantity);
        }

        for (ProductOrder p : products){
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
