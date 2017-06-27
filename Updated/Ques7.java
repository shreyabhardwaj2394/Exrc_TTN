/**
 * Created by Shreya on 6/27/2017.
 */

class specialstack {
    int stack[];
    int size;
    int minstack[];
    int top = -1;
    int top1 = -1;

    specialstack() {
        stack = new int[10];
        minstack = new int[10];

    }

    void push(int element) {
        if (top == 9) {
            System.out.println("stack full");
        } else {
            stack[++top] = element;
            if (top1 != -1) {
                if (element < minstack[top1])
                    minstack[++top1] = element;

            } else
                minstack[++top1] = element;


        }

    }



    int pop() {
        int element=stack[top];
        if(element==minstack[top1])
        {
            minstack[top1--]=0;
            stack[top--]=0;
            return element;
        }
        else
        {
            stack[top--]=0;
            return element;
        }

    }
    int getmin()
    {
        return minstack[top1];
    }
}
public class Ques7 {
    public static void main(String[] args) {
        specialstack s=new specialstack();
        s.push(500);
        s.push(10);
        s.push(78);
        s.push(2);
        //s.pop();
        //s.pop();
        System.out.println("Minimum element of the stack is::"+s.getmin());

    }
}
