/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author Prashanth TITLE: To demonstrate InterThreadCommunication Class:
 * public class MultiThreading2, lass ThreadB extends Thread
 */
public class MultiThreading2 {

    public static void main(String[] args) {
         
     
        
        new Thread(){
     
     public void run(){
     ThreadB m = new ThreadB();
        m.method1();
     }
     }.start();

         new Thread(){
     
     public void run(){
     ThreadB m = new ThreadB();
        m.method2();
     }
     }.start();
         
         

    }

    
}

class ThreadB {

    int total;
   

  
     
     synchronized void method1() {

        System.out.println("Waiting...");
        try{
            wait();
        } catch (Exception e) {
        }
        System.out.println("Done Waiting!");
    }
    
    synchronized void method2() {
    
    notify();
    }
     
    
}
