package com.demon.demonthread;

import java.util.Vector;

/**
 * @program:
 * @Author: Zhang Qiang
 * @Date: 2018/9/30 20:54
 * @Description:
 */
public class Producer implements Runnable {


    private final Vector sharedQueue;

    private final int SIZE;

    public Producer(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        SIZE = size;
    }


    @Override
    public void run() {

    }
}
