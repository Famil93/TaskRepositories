import java.util.Scanner;

public class GeneralTasks {
    public static void main(String[] args) {
//        Task  1
//        int mod = 0;
//        int n = 0;
//        int tekEdedler = 0;
//        int count = 0;
//        int sum = 0;
//
//        int[] numbers = {23, 12, 31, 151};
//
//        for (int i = 0; i < numbers.length; i++) {
//
//
//            n = numbers[i];
//
//            while (n > 0) {
//                mod = n % 10;
//                n = n / 10;
//                sum += mod;
//
//
//            }
//            if (!(sum % 2 == 0)) {
//                tekEdedler += sum;
//                count++;
//            }
//            sum = 0;
//        }
//
//        System.out.println(tekEdedler / count);



//        Task 2 verilen arrayi tersine cevirin
//
//        int[] arr = {1, 2, 3, 4};
//
//        int[] reverse = new int[arr.length];
//
//        for (int i = arr.length-1; i >= 0; i--) {
//
//            System.out.println(arr[i]);
//        }




//        Task3 Verilen arrayin elementlerinin sorted (kicikden boyuye dogru)olub olmadigini cap edin



//        int[] arr={1,1,2,4};
//boolean bool= true;
//        int[] correction=arr;
//        int correction1=0;
//        for(int i=arr.length-1;i>0;i--){
//
//                if(correction[i-1]>=correction[i]){
//                    bool=false;
//
//
//                }
//
//
//            }
//        if(bool==false){
//            System.out.println("unsorted");
//        }else{
//            System.out.println("sorted");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Istifadecinin  adini daxil edin");
        String ad = sc.nextLine();
        System.out.println("bali daxil edin");
        int bal = sc.nextInt();

        if(bal>=0&&bal<=50){
            System.out.println(ad + ":"+"aldigi qiymet : F");
        }else if(bal>=51&&bal<=60){
            System.out.println(ad + ":"+"aldigi qiymet :  E");
        }else if(bal>=61 &&bal<=70){
            System.out.println(ad + ":"+"aldigi qiymet :  D");
        }else if(bal>=71&&bal<=80){
            System.out.println(ad + ":"+"aldigi qiymet :  C");
        }else if(bal>=81&&bal<=90){
            System.out.println(ad + ":"+"aldigi qiymet :  B");
        } else if (bal>=91&& bal <=100) {
            System.out.println(ad +" "+"aldigi qiymet :  A");
        }else{
            System.out.println("Systemde  nasazliq var");
        }
    }
}
