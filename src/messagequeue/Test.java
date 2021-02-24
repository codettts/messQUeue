/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagequeue;

/**
 *
 * @author DoThai
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        String message;
        int select=0;
        Scanner sc=new Scanner(System.in);
        Manage man=new Manage();
        do{
            select=man.Menu();
            switch(select){
                case 1:
                    System.out.println("Enter the message you want to send");
                    message=sc.nextLine();
                    man.sendMessage(message);
                    break;
                case 2:
                    message=man.retrieveMessage();
                    System.out.println(message);
                    break;
                case 3:
                    man.showAllMessage();
                    break;
                case 4:
                    break;
            }
        }while(select<=4);
    }
}
