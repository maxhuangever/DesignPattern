package com.max.designpattern.observer;

public interface Subject {
    public void add(Observer observer);  
      
    public void del(Observer observer);  
      
    public void notifyObservers();  
      
    public void operation();  
}
