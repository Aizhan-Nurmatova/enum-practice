package com.company;

public class InvalidIssueYear extends RuntimeException{

    public InvalidIssueYear(){

    }

    public InvalidIssueYear(String e){
        super(e);
    }

}
