package Models;

import java.util.Arrays;

public class Stack 
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 0;
    private Object elements[];

 
    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
    }
 
    public void push(String t) {
        if (size == elements.length) {
        	increaseSize();
        }
        elements[size++] = t;
    }
 
    public String pop() {
        String t =  (String) elements[--size];
        elements[size] = null;
        decreaseSize();
        return t;
    }
 
    private void increaseSize() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }
    private void decreaseSize() {
        int newSize = elements.length - 1;
        elements = Arrays.copyOf(elements, newSize);
    }
     
    public int length() {
    	return elements.length;
    }
    @Override
    public String toString()
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i < size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
}