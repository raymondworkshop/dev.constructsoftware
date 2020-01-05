package exercise;

/*
 * interface specifics expectations 
 * class implement the expectations
 */

interface Animal {
    void vocalize();
}

class Dog implements Animal {
    public void vocalize() {
        System.out.println("Woof!");
    }
}

class Cow implements Animal {
    public void vocalize() {
        moo();
    }

    public void moo() {
        System.out.println("Moo!");
    }
}

/*
 * public class AnimalTest { public static void main(String args[]) { Dog d =
 * new Dog(); d.vocalize();
 * 
 * Animal b = new Cow(); b.vocalize();
 * 
 * // b.moo();
 * 
 * } }
 */