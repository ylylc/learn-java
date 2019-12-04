package org.learn.design.single;


public class Single03 {


    private Single03 (){

    }

    public static Single03 getInstance(){

        return Inner.single03;
    }

    private static class Inner{
       final static Single03 single03  = new Single03();

    }

}
