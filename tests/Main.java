// the client to use interface
//import java.util.*;
import org.junit.Test;

public class Main{
    public static void main(String[] args){
        // Animal is a abstract class
        //Animal a = new Animal();
        //a.vocalize();

        //
        Dog d = new Dog();
        d.vocalize();

        //Note: use interface types for variables and parameters
        Animal b = new Cow();
        b.vocalize();

        //
        //b.moo();

    }
}