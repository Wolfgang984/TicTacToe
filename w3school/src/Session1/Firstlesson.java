package Session1;

public class Firstlesson {
    public static void main(String[] args) {


//lession2();
        // forSchleife();
        //w3Scool1();
        w3Scool2();


    }

    public static void lession1() {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int counter = 1;
        while (counter <= 29) {
            System.out.println(counter);

            counter++;

        }
    }

    public static void lession2() {
        int counter = 1;
        int ebenNumber = 0;
        while (counter <= 10) {
            System.out.println("der counter soll 10 mal durchlaufen und sich erhöhen " + counter + ":" + ebenNumber);
            counter++;
            ebenNumber = ebenNumber + 2;
        }

    }

    public static void forSchleife() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }

    public static void w3Scool1() {

        int counter = 0;
        String helloWorld = "Hello world";
        int numofWorld = 1;

        while (counter <= 20) {

            System.out.println(helloWorld + " " + numofWorld);

            counter++;
            numofWorld++;

        }

    }

    public static void w3Scool2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}




