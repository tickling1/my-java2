package class1;

public class ClassStart0 {

    public static void main(String[] args) {
        String[] name = {"학생1", "학생2"};
        int[] age = {15, 16};
        int[] score = {80, 90};
        print(name, age, score);
    }

    public static void print(String[] studentName, int[] studentAge, int[] studentScore){

        for (int i = 0; i < studentName.length; i++){
            System.out.print("이름:" + studentName[i] + " 나이:" + studentAge[i] + " 성적:" + studentScore[i]);
            System.out.println();
        }
    }
}
