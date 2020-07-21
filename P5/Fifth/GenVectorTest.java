package Fifth;

import java.util.Vector;

public class GenVectorTest {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<Object>();

        v.addElement(new Character('A'));
        v.addElement(new Integer('A'));
        v.addElement(new Float('A'));
        v.addElement(new Double(3.141592));
        v.addElement(new java.lang.String("Hello"));
        v.setElementAt("Hi", 3);


        System.out.println("size of the vector : "+v.size());
        System.out.println("Vector 1번째: " + (Character)v.elementAt(0));
        System.out.println("Vector 2번째: " + (Integer)v.elementAt(1));
        System.out.println("Vector 3번째: " + (Float)v.elementAt(2));
        System.out.println("Vector 4번째: " + (String)v.elementAt(3));
        System.out.println("Vector 5번째: " + (String)v.elementAt(4));

    }
}
