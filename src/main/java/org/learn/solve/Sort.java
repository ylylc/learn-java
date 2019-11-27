package org.learn.solve;

/**
 *
 * @author :  barry
 * Date: 2019-11-27
 * Time: 5:55 下午
 * @Description : 排序算法
 */
public class Sort {


    /**
     *
     * @param s
     * @param l
     */
    public int [] bubbleSort(int [] s,int l){

        if (l<=1){
            return s;
        }
        for (int i = 0;i<=l;i++){
            for (int r = 0;r<l-i-1;r++){
                if ( s[r]>s[r+1]){
                    int temp = s[r];
                    s[r] = s[r+1];
                    s[r+1] = temp;
                }
            }
        }
        return s;
    }

    public final static void   main(String [] strs){
        Sort s = new Sort();
        int sorts [] = {4,5,1,2,8,0,9};
        sorts = s.bubbleSort(sorts,sorts.length);
        System.out.println(sorts);
    }

}
