public class Main {
    public static void main(String[] args) {
        //Task1
//        int[] ages = {11,58,63};
//        for(int i=0;i<ages.length;i++){
//            if(ages[i]%2==0){
//                System.out.println(ages[i]+ " "+"cut ededdir");
//            }else{
//                System.out.println(ages[i]+" "+"sade ededdir");
//            }
//        }
//Task2
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


//Task3

//        int max=0;
//
//        int[] arrays = {15,58,152,368,95};
//        for (int i=0;i<arrays.length;i++){
//
//            if (arrays[i]>max){
//                max=arrays[i];
//            }
//        }
//        System.out.println(max);
//    }
//Task4
//        int n = 0;
//
//        int mod = 0;
//
//        int count = 0;
//        int sum = 0;
//
//        int[] arr = {152, 25, 1, 600, 110, 11111};
//        for (int i = 0; i < arr.length; i++) {
//            n = arr[i];
//
//            while (n > 0) {
//
//                mod = n % 10;
//                sum += mod;
//
//                n = n / 10;
//
//                count++;
//
//            }
//            if (count > 2) {
//                System.out.println(sum);
//
//            }
//
//            count = 0;
//
//            sum = 0;
//        String[] names ={"Cingiz","Amal","Valide","Eli","Nicat","Mehemmed"};
//        for(var name:names){
//            if(name.length()>5){
//                System.out.println(name);
//            }
//        }

//        Task 2 verilen arrayi tersine cevirin

//        int[] arr = {1, 2, 3, 4};
//
//        int[] reverse = new int[arr.length];
//
//        for (int i = arr.length-1; i >= 0; i--) {
//
//            System.out.println(arr[i]);
//        }


//        Task3 Verilen arrayin elementlerinin sorted (kicikden boyuye dogru)olub olmadigini cap edin


//        int[] arr={3,2,3,4};
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


//        AzizTask1

//        int[] arr = {15,23,38,46,77,98};
//
//        int max=0;
//        int ikinciEded=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                ikinciEded=max;
//                max=arr[i];
//
//            }
//
//        }
//        System.out.println(ikinciEded);

//        int temp=0;
//        int[] arr = {1, 2, 3, 1};
//
//        int[] unique = arr;
//        boolean bool=true; ;
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length; j++) {
//
//                if(bool==false){
//                    continue;
//                }
//                bool=true;
//                if (arr[i] == unique[j]) {
//                   bool=false;
//
//
//                }
//                System.out.println(unique[j]);
//            }
//
//    }


    }
}


