package main;
//

//import java.io.*;

public class Cow implements Animal {
    public void vocalize(){
        moo();
    }

    void moo(){
        System.out.println("Moo!");
    }
}