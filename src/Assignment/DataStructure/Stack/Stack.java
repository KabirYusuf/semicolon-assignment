package Assignment.DataStructure.Stack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Stack extends Vector{

    private int count = 0;
    private final String [] elements = new String[5];

    boolean isEmpty = true;

    public void push(String element){
        elements[count] = element;
        isEmpty = false;
        count++;
    }

    @Override
    public boolean isEmpty(){
        return isEmpty;
    }

    public void search(String element){
        for (int i = 0; i < elements.length; i++) {
            if(Objects.equals(elements[i], element)){
                System.out.printf("%s position is: %d%n",element, (i + 1));

            }
        }
    }

    public void pop() {

        String[] newElements = Arrays.copyOf(elements, elements.length - 1);
        System.out.println(Arrays.toString(newElements));
    }

    @Override
    public String get(int id){
        return elements[id];
    }

    @Override
    public int size(){
        return count;
    }

    public String peek(){
        return elements[elements.length-1];
    }
}
