package org.learn.design.single;

/**
 * Copyright © 2019 美利金融. All rights reserved.
 *
 * @author :  barry
 * Date: 2019-12-04
 * Time: 10:59 上午
 * @Description :
 */
public class Single02 {

    private static volatile Single02 single02 = null;

    private Single02(){

    }

    public static Single02  getInstance(){

        if (single02 == null){
            synchronized (Single02.class){

                if (single02 != null) {
                    single02 = new Single02();
                }
            }

        }
        return single02;
    }

}
