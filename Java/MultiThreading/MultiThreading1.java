/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Prashanth 
 * TITLE: A Java program that executes three threads
 * Class: class MyThread1 extends Thread, class MyThread2 extends Thread
 *        class MyThread3 extends Thread
 * Methods: public void run()
 * Variables: MyThread1 mt1, MyThread2 mt2, MyThread3 mt3
 *
 */
class MyThread1 extends Thread {

    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                System.out.println("Good Morning");

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}

class MyThread2 extends Thread {

    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                System.out.println("hello");

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}

class MyThread3 extends Thread {

    public void run() {
        try {
            while (true) {
                Thread.sleep(3000);
                System.out.println("welcome");

            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}

public class MultiThreading1 {

    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        MyThread3 mt3 = new MyThread3();
        mt1.start();
        mt2.start();
        mt3.start();
    }

}
