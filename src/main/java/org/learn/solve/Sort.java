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
     * 冒泡排序
     * @param s
     * @param l
     */
    public int [] bubbleSort(int [] s,int l){

        if (l<=1){
            return s;
        }
        for (int i = 0;i<=l;i++){
            for (int r = 0;r<l-i-1;r++){
                if ( s[r]>s[r+1]){//比较
                    int temp = s[r];
                    s[r] = s[r+1];//冒泡
                    s[r+1] = temp;
                }
            }
        }
        return s;
    }

    /**
     * 插入排序
     * @param s
     * @param lenth
     * @return
     */
    public int [] insertSort(int [] s,int lenth){

        if (lenth<=1){
            return s;
        }

        for (int i = 1;i<lenth;i++){
            int v = s[i];
            int r = i - 1;
            for (;r>=0;--r){
                //移动
                if (s[r]>v){
                    s[r+1] = s[r];
                }else {
                    break;
                }
            }
            s[r+1] = v;
        }
        return s;
    }




    public final static void   main(String [] strs){
        Sort s = new Sort();
        int sorts [] = {4,5,1,2,8,0,9};
        sorts = s.insertSort(sorts,sorts.length);
    }

}
