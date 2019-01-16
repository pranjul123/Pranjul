package faltoo;
import java.util.Arrays;
public class Main {
    int[] list = new int[10];

    public static void main(String[] args) {
        Main l1 = new Main();
        System.out.println(Arrays.toString(l1.list));
        l1.insert(42);
        System.out.println(Arrays.toString(l1.list));

    }

    void insert(int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                list[i] = value;
                break;
            }
        }


    }
    void remove(int index)
    {
        for(int i=index ; i <list.length-1 ; i++)
        {
            list[i] = list[i+1];
        }
        list[list.length-1]=0;
    }

}
