/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagequeue;

import java.util.Scanner;

/**
 *
 * @author DoThai
 */
public class Manage {
    private Queue Queue;
        public Manage(){
            Queue=new Queue(200);
        }
        public void sendMessage(String mes){
            Queue.enqueue(mes);
        }
        public String retrieveMessage(){
            return Queue.dequeue();
        }
        public void showAllMessage(){
            Queue.showAllMessage();
        }
        public int Menu(){
            try{
                Scanner sc=new Scanner(System.in);
                System.out.println("1.Send a message\n2.Retrieve a message\n3.Show AllMessage\n4.Exit");
                System.out.println("Enter your option: ");
                int select=sc.nextInt();
                return select;
            }catch(Exception e){
                System.out.println("Option invalid....Please re-enter the correct option");
            }
            return 0;
             
        }
}
