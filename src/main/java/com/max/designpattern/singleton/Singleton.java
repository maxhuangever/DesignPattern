package com.max.designpattern.singleton;

public class Singleton {
    private Singleton() {  
    }  
  
    private static class SingletonFactory {  
        private static Singleton instance = new Singleton();  
    }  
  
    public static Singleton getInstance() {  
        return SingletonFactory.instance;  
    }
    
    public void sayHello(){
    	System.out.println(this);
    }
}
