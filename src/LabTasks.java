import java.util.Scanner;

public class LabTasks {
    public static void main(String[] args) {
//     Task1

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
//            }else if(i<ikinciEded&&i!=max){
//                ikinciEded=i;
//            }
//
//        }
//        System.out.println(ikinciEded);

//
//        int[] arr = {1, 2, 3, 7, 5, 1};
//
//
//        int count = 0;
//
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//
//                }
//
//            }
//            if(count==1){
//                System.out.println(arr[i]);
//            }
//
//
//            count = 0;
//        }

        int[] array = {15, 250, 23, 457, 321, 875, 246, 190, 234, 800, 9837, 12531};
        Scanner sc = new Scanner(System.in);
        System.out.println("input daxil edin");
        int input = sc.nextInt();
        int input2 = sc.nextInt();
        int result = 0;
        int lastNumber = 0;

        int temp = 0;

        for (int i = 0; i < array.length; i++) {

            result = array[i];

            if (result > input && result < input2) {
                while (result > 0) {
                    lastNumber = result % 10;
                    result = result / 10;
                    temp += lastNumber;
                }
            }
            if (temp > 7) {
                System.out.println(array[i]);
            }
            temp = 0;
        }
    }
}


