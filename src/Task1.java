public class Task1 {
    public static void main(String[] args) {
        int mod = 0;
        int n = 0;
        int tekEdedler = 0;
        int count = 0;
        int sum = 0;

        int[] numbers = {23, 12, 31, 151};

        for (int i = 0; i < numbers.length; i++) {


            n = numbers[i];

            while (n > 0) {
                mod = n % 10;
                n = n / 10;
                sum += mod;


            }
            if (!(sum % 2 == 0)) {
                tekEdedler += sum;
                count++;
            }
            sum = 0;
        }

        System.out.println(tekEdedler / count);
    }
}
