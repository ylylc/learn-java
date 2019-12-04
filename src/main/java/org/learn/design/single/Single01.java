package org.learn.design.single;

/**
 * Copyright © 2019 美利金融. All rights reserved.
 *
 * @author :  barry
 * Date: 2019-12-04
 * Time: 10:50 上午
 * @Description :
 */
public class Single01 {

    private static  Single01 single01 = new Single01();
    private Single01(){

    }

    public static Single01 getInstance(){
        if (single01 ==null){
            single01 = new Single01();
        }
        return single01;
    }


}
