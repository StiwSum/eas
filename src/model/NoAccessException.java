/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class NoAccessException extends RuntimeException{
    public NoAccessException(){
        super();
    }
    
    public NoAccessException(String Message){
        super(Message);
    }
    
    public NoAccessException(String message, Exception exception){
        super(message, exception);
    }
}
