package com.Test;

import com.sun.source.tree.SynchronizedTree;

import java.util.concurrent.SynchronousQueue;

public class Singlton {

    private static Singlton singlton =null;

    private Singlton()
    {

    }


    public static synchronized Singlton  getIstance()
    {
        if(singlton==null)
        {
            new Singlton();
        }

        return singlton;
    }

}
