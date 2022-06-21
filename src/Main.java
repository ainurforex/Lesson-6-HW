public class Main {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
        homeWork3();
        homeWork4();
    }

    private static void homeWork1() {
        int[] arr = generateRandomArray();
        int summ=0;
        for (int element : arr) {
            summ+=element;
        }
        System.out.println("Сумма трат за месяц составила "+summ+ " рублей");
    }

    private static void homeWork2() {
        int[] arr = generateRandomArray();
        int min=arr[0];
        int max=arr[0];
        for (int element : arr) {
            if (element<min){
                min=element;
            }else if (element>max){
                max=element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. "+
                "Максимальная сумма трат за день составила "+max+" рублей.");

    }
    private static void homeWork3() {
        int[] arr = generateRandomArray();
        double avarage;
        int dayInMonth=30;
        int summ=0;
        for (int element : arr) {
            summ+=element;
        }
        avarage=(double)summ/dayInMonth;
        avarage = Math.round(avarage * 100) / 100.0;
        System.out.println("Средняя сумма трат за месяц составила "+avarage+" рублей.");
    }

    private static void homeWork4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i=reverseFullName.length-1; i>=0;i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}