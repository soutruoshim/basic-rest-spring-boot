package com.srhdp.basicrestspringboot.error;

public class EmployeeNotFoundException extends RuntimeException{
     public EmployeeNotFoundException(String message){
         super(message);
     }
}