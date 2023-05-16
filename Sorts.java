import java.util.Arrays;

public class Sorts {


    public static void main(String[] args) {
        int[] a = new int[] {5, 2, 1, 4, 3};
        choiceSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int k = 1; k < n; k++){
                if(a[k-1] > a[k]){
                    int temp = a[k-1];
                    a[k-1] = a[k];
                    a[k] = temp;
                }
            }
            n--;
        }
    }

    public static void choiceSort(int[] a){
        for (int i = 0; i < a.length; i++){
            int min = a[i];
            int index = i;
            for (int k = i+1; k < a.length; k++){
                if(min > a[k]){
                    min = a[k];
                    index = k;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[index] = temp;
        }
    }

}
