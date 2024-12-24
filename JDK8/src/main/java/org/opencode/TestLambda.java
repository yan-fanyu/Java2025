package org.opencode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(90);
        Collections.sort(list, (a, b) -> {return b - a;});
        for(Integer x: list){
            System.out.println(x);
        }
    }
}
