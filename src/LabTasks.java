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
//            }
//
//        }
//        System.out.println(ikinciEded);


        int[] arr = {1, 2, 3, 7, 5, 1};

        int[] arr1 = arr;
        int count = 0;
        int collections = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr1[j]) {
                    count++;
                    if (count > 1) {
                        continue;
                    }
                }
                System.out.println(arr[j]);
            }
            count = 0;
        }
    }
}
