package oop.ex;
public class Lotto {
    int[] num;

    void creatNum () {
        num = new int[7];

        for (int i = 0; i < num.length; i++) {
            while (true){
                num[i] = (int)(Math.random() * 100);

                if (num[i] == 0) {
                    continue;

                }
                if (num[i] < 46) {
                    break;
                }
            }
        }
        for(int i = 0; i < num.length; i++) {
            System.out.println((i+1) + " 번째 번호: " + num[i]);
        }
    }

}
