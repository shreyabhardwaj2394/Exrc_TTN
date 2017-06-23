import java.util.Iterator;

/**
 * Created by Shreya on 6/22/2017.
 */

import java.util.LinkedList;

public class Q7 {
    public static void main(String[] args) {
        SpecialStack sp=new SpecialStack(12);
        sp.push(25);
        sp.push(28);
        sp.push(15);
        sp.push(55);
        sp.push(95);
        sp.push(13);
        sp.push(15);
        sp.push(65);
        sp.push(25);
        sp.push(84);
        sp.push(86);
        sp.push(16);
        sp.push(25);
        sp.getMin();

        sp.listStatus();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();
        sp.pop();

    }
}
class SpecialStack {

    int top;
    private LinkedList<Integer> linkedList;
    int min;
    int capacity;
    public SpecialStack(int x) {
        top=-1;
        linkedList=new LinkedList<>();
        capacity=x;
    }
    void push(Integer x){
        if(capacity==(top+1)){
            System.out.println("overflow");
        }
        else {
            if(isEmpty()){
                linkedList.addFirst(x);
                min=x;
                top++;
            }
            else{
                if(x<min)
                {
                    min=x;
                }
                linkedList.addFirst(x);
                top++;
            }
        }
    }
    void getMin()
    {
        System.out.println("currently minimum element is "+min);
    }
    void pop(){
        if(isEmpty())
        {
            System.out.println("element cant be poped stack undeflow");
        }
        else{
            System.out.println("poped element is"+linkedList.getFirst());
            if(linkedList.getFirst()==min)
            {
                int minimum,check;
                minimum=linkedList.getFirst();
                Iterator li=linkedList.iterator();
                while (li.hasNext()){
                    check=(int)li.next();
                    if(check<minimum)
                        minimum=check;
                }
            }
            linkedList.removeFirst();
            top--;
        }

    }
    private boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    private boolean isFull()
    {
        if(top==capacity-1)
            return true;
        return false;
    }
    void listStatus(){
        System.out.println(linkedList);
    }
}