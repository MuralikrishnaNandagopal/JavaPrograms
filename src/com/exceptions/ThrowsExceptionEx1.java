package com.exceptions;

import java.io.FileNotFoundException;

public class ThrowsExceptionEx1 
{
    public static void main(String[] args) 
    {
        try
        {
            method();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
     
    public static void method( ) throws FileNotFoundException 
    {
        throw new FileNotFoundException("checking the msg");
    }
}