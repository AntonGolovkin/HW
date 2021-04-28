package gb.l2;

public class Main {

    public static void main(String[] args) {
        System.out.println(task1(10, 4));
        task2(6);
        System.out.print(task3(23));
        System.out.println("");
        task4("line", 4);
        System.out.println(task5(2021));

    }

    public static boolean task1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }else {
            return false;
        }

    }

    public static void task2(int i) {
        if(i >= 0){
            System.out.println(i + "- Число положительное");
        } else {
            System.out.println(i + "- Число отрицательное");

        }

    }

    public static boolean task3(int j) {
        if (j <= 0){
            return true;
        } else {
            return false;
        }

    }

    public static void task4(String word, int iteration)  {
        for (int i = 0; i < iteration ; i++) {
            System.out.println(word);
            
        }

    }
    private static boolean task5(int y){
        return (y%4==0 && y%100!=0) || y%400==0;

    }

}
