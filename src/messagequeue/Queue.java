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
public class Queue {
    int front, rear,size;
        int capacity;
        String[] messages;
        
        public Queue(int capacity){
            this.capacity=capacity;
            front=this.size=0;
            rear=capacity -1;
            messages=new String[this.capacity];
        }
        //Hàng đợi đầy khi kích thước bằng với dung lượng
        public boolean isFull(Queue qe){
            return(qe.size==qe.capacity);
            
        }
        public boolean isEmpty(Queue qe){
            return(qe.size==0);
        }
        //thay đổi về phía sau và kích thước
        public void enqueue(String mes){
            if(isFull(this))
                return;
            rear=(this.rear + 1)%this.capacity;
            this.messages[this.rear]=mes;
            size=this.size + 1;
            System.out.println( mes + "enqueued");
        }
        public String dequeue(){
            if(isEmpty(this))
                return "Empty";
            String message=this.messages[this.front];
            front = (this.front + 1)%this.capacity;
            size=this.size - 1;
            return message;
        }
        //thực hiện lấy tin nhắn ở đầu hàng đợi
        public String front(){
            if(isEmpty(this))
                return"Empty";
            return this.messages[this.front];
        }
        //Phương pháp lấy tin nhắn phía sau hàng đợi
        public String rear(){
            if(isEmpty(this))
                return "Empty";
            return this.messages[this.rear];
        }
        public void showAllMessage(){
            for(int i=front; i<=rear; i++){
                System.out.println(" " + messages[i]);
                System.out.println("---------------");
            }
        }
}
