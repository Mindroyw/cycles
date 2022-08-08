public class Main {
    public static void main(String[] args) {

        //Задание 1
        int i = 1;
        while (i <= 10){
            System.out.print(i++ + " ");
        }
        System.out.println(" ");
        for (int a = 10; a > 0; a--){
            System.out.print(a + " ");
        }
        System.out.println("");

        //Задание 2
        int f = 5; // 5 августа = пятница
        for (; f < 31; f = f + 7){
            System.out.println("Сегодня пятница, " + f + "-е число. Необходимо подготовить отчёт.");
        }

        //Задание 3
        int pastComet = 1817;
        for (; pastComet < 2022; pastComet = pastComet + 79){
            System.out.println(pastComet);
        }
        while (pastComet < 2100){
            System.out.println(pastComet);
            break;
        }

    }
}