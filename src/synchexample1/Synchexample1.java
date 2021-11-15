/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchexample1;

/**
 *
 * @author User
 */
public class Synchexample1 {

   private static int counter = 0;
    public static void main(String[] args) {
        Runnable r = new Runnable (){
            @Override
             public void run(){//synchronized
                synchronized(this){
                counter = 0;
                    for (int i = 0; i<5; i++){
                    counter++;
                    System.out.println(Thread.currentThread().getName() + " : counter = " + counter);
                    }
                }
            }
        };
        
        Thread t1 = new Thread (r, "Potok 1");
        Thread t2 = new Thread (r, "Potok 2");
        
        t1.start();
        t2.start();
        
    }
    
}
