package view;
package view; 
  
 import java.util.concurrent.Semaphore; 
  
 import controller.ServiceThread; 
  
 public class Principal { 
     public static void main(String[] args) { 
         Semaphore semaphore = new Semaphore(1); 
         for (int i = 0; i < 21; i++) { 
             Thread t = new ServiceThread(i, semaphore); 
             t.start(); 
         } 
     } 
 }