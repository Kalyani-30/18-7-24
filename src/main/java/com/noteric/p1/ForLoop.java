package com.noteric.p1;

public class ForLoop {
    //custom initialization array
    //int arr[]={9,3,7,4,1};
    public void sortingElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]+" ");
        }


    }

    public static void main(String[] args) {
        int arr[]={9,3,7,4,1,78,34,1786,397};
        ForLoop forLoop=new ForLoop();
        forLoop.sortingElements(arr);
    }

}
