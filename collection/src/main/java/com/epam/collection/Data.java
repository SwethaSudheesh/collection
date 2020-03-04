package com.epam.collection;
import java.util.Arrays;
public class Data<D> {
    
    private int size=0;     
    //Default capacity of list is 10
    private static final int max=10;

    private Object elements[];
   
    public Data() {
        elements=new Object[max];
    }
  
    public void add(D e) {
        if (size==elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }
   
    @SuppressWarnings("unchecked")
    public D get(int i) {
        if (i>=size||i<0) {
            throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
        }
        return (D) elements[i];
    }
    
    @SuppressWarnings("unchecked")
    public D remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
        }
        Object item=elements[i];
        int numElements=elements.length-(i+1);
        System.arraycopy(elements,i+1,elements,i,numElements);
        size--;
        return (D) item;
    }
    
    public int size() {
        return size;
    }
    //Print method
    //@Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         for(int i = 0; i < size ;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         return sb.toString();
    }
    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}