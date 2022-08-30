package OverridingExample;

public class Cat extends Animal {

    @Override
    public void talk() {
        System.out.println("Cat can talk");
    }
}
