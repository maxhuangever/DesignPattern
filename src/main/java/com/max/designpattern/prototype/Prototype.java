package com.max.designpattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * DESIGN PATTERN 5: Prototype pattern
 * A creation pattern, use clone to create new object.
 * 
 * @author 23885_000
 *
 */
public class Prototype {
	 private static final long serialVersionUID = 1L;  
	    private String string;  
	  
	    private SerializableObject obj;  
	  
	    // clone 
	    public Object clone() throws CloneNotSupportedException {  
	        Prototype proto = (Prototype) super.clone();  
	        return proto;  
	    }  
	  
	    // deep clone  
	    public Object deepClone() throws IOException, ClassNotFoundException {  
	  
	        /* 写入当前对象的二进制流 */  
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
	        ObjectOutputStream oos = new ObjectOutputStream(bos);  
	        oos.writeObject(this);  
	  
	        /* 读出二进制流产生的新对象 */  
	        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
	        ObjectInputStream ois = new ObjectInputStream(bis);  
	        return ois.readObject();  
	    }  
	  
	    public String getString() {  
	        return string;  
	    }  
	  
	    public void setString(String string) {  
	        this.string = string;  
	    }  
	  
	    public SerializableObject getObj() {  
	        return obj;  
	    }  
	  
	    public void setObj(SerializableObject obj) {  
	        this.obj = obj;  
	    }  
	  
	}  
	  
	class SerializableObject implements Serializable {  
	    private static final long serialVersionUID = 1L;  
	}  
	
	
