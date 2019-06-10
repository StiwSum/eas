/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class QueueException extends RuntimeException{
     public QueueException(){
        super();
    }
    
    public QueueException(String Message){
        super(Message);
    }
    
    public QueueException(String message, Exception exception){
        super(message, exception);
    }
}
