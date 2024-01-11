public class ArrayOps {
    public static void main(String [] args) {
        System.out.println(isSorted(new int[] {7, 5, 4, 3, -12})); // true
        System.out.println(isSorted(new int[] {1, 2, 3})); // true
        System.out.println(isSorted(new int[] {1, -2, 3})); // false
        System.out.println(isSorted(new int[] {1, 1, 500})); // true
        System.out.println(isSorted(new int[] {1, 3, 2})); // fals
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length; 
        int missing = n + 1;
        for (int i = 0 ; i <= n ; i++){ 
            boolean isthere = false; //checks if a number i is in the array 
          for(int j = 0; j < n ; j++ ){
            if (array[j] == i){
                isthere = true; 
            }
          } 
          if (isthere == false){
            missing = i;
            i = n+1;
          } 
        }    
       return missing; 
    }

    public static int secondMaxValue(int [] array) {
        int n = array.length;
        int[] newArr = new int[n-1];
        int max = array[0]; 
        int maxIndex = 0;
        int min = array[0];
        for (int i = 0 ; i < n ; i++){
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        int secondMax = min;
        for (int j = 1 ; j < n ; j++ ){
            if ((array[j] > secondMax) && (j != maxIndex)){
                secondMax = array[j];
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean arr1 = false; //checks if array1 is in array2
        boolean arr2 = false; //checks if array2 is in array1
        boolean sameNumbers = false; //checks tow sides equality
        for (int i = 0 ; i < array1.length ; i++){
            arr1 = false;
            for (int j = 0 ; j < array2.length ; j++){
                if (array1[i] == array2[j]){
                    arr1 = true;
                }
            }
            if (arr1 == false){
                i = array1.length + 1;
            }
        }

        for (int k = 0 ; k < array2.length ; k++){
            arr2 = false;
            for (int n = 0 ; n < array1.length ; n++){
                if (array1[n] == array2[k]){
                    arr2 = true;
                }
            }
            if (arr2 == false){
                k = array2.length + 1;
            }
        }

        if (arr1 == true && arr2 == true){
            sameNumbers = true;
        }
        return sameNumbers;
    }

    public static boolean isSorted(int [] array) {
        boolean increase = true;
        boolean dicrease = true;
        boolean sorted = false;
        
        for (int i = 1 ; i < array.length ; i++){
            if (array[i] < array[i-1]){
                increase = false;
            }
                else{
                    dicrease = false;
            }
        }
        if (increase == true || dicrease == true){
            sorted = true;
        }
        return sorted;
    }

}
