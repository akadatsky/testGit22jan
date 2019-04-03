package com.akadatsky;

import java.util.Arrays;

public class YanevichStas99 {
    private int[] arr={7,45,89,12,64,68,25,0,1,36,99};
    public int[] sortArray(int[] array){
        Arrays.sort(array);
        return array;
    }
    public int maxInArray(int[] array){
        int max=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
