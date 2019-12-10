package org.learn.solve;

/**
 * Copyright © 2019 美利金融. All rights reserved.
 *
 * @author :  barry
 * Date: 2019-12-10
 * Time: 2:49 下午
 * @Description :
 */
public class Sort2 {

    /**
     * 从上到下
     * @param elem
     * @param start
     * @param end
     */
    public void mergeSortUp2Down(int[] elem, int start, int end) {
        if(elem == null || start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSortUp2Down(elem, start, mid);
        mergeSortUp2Down(elem, mid + 1, end);

        merge(elem, start, mid, end);
    }

    public void merge(int[] elem, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end) {
            if(elem[i] < elem[j]) {
                temp[k++] = elem[i++];
            }
            else {
                temp[k++] = elem[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = elem[i++];
        }

        while(j <= end) {
            temp[k++] = elem[j++];
        }

        for (i = 0; i < k; i++) {
            elem[start + i] = temp[i];
        }
        temp = null;
    }


    public final static void   main(String [] strs) {
        int sorts [] = {4,5,1,2,8,0,9};
        Sort2 sort2 = new Sort2();
        sort2.mergeSortUp2Down(sorts,0,sorts.length-1);
        System.out.println(sort2);
    }

    }
