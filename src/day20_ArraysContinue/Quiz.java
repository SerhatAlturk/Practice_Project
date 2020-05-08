package day20_ArraysContinue;

import java.util.Arrays;

public class Quiz {

    public static void main(String[] args) {
        String[] names = {"Mehmet", "Aizhan"};

        names[0] = names[1];   // ["Aizhan", "Aizhan"]
        // names[0]  = "Aizhan"

        names[1] = names[0]; // ["Aizhan", "Aizhan"]

        System.out.println(Arrays.toString(names) );


    }
}
