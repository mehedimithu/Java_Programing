interface Animal {
    public void animalSound();

    public void sleep();

}

class Cat implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Meow");

    }

    @Override
    public void sleep() {
        System.out.println("Zzzz");
    }

}