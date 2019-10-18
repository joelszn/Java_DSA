package academy.learnprogramming.arrays;

public class bubbleSort {

    public static void main(String[] args) {
        String[] strArray = { "joel","ray","roman","miguel"};
                


        for(int lastUnsortedIndex = strArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i =0; i < lastUnsortedIndex; i++) {
                if (strArray[i].length() > strArray[i+1].length()){
                    swap(strArray, i, i+1);
                }
            }
        }

        for (String i: strArray){ System.out.println(i); }
    }

    public static void swap(String[] array, int i, int j){
        if (i == j){
            return;
        }

        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
