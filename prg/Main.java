class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

interface Meowable {
    void meow();
}

interface Barkable {
    void bark();
}

interface Jumpable {
    void jump();
}

class Dog extends Animal implements Barkable, Jumpable {
    private int height;

    public Dog(String name, int height) {
        super(name);
        this.height = height;
    }

    public void bark() {
        System.out.println(getName() + " says: Woof");
    }

    public void jump() {
        System.out.println(getName() + " jumps");
    }
}

class Doberman extends Dog {
    public Doberman(String name) {
        super(name, 70);
    }

    public void jump() {
        System.out.println(getName() + " jumps high");
    }
}

class Terrier extends Dog {
    public Terrier(String name) {
        super(name, 30);
    }

    public void jump() {
        System.out.println(getName() + " jumps low");
    }
}

class Cat extends Animal implements Meowable, Jumpable {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println(getName() + " says: Meow");
    }

    public void jump() {
        System.out.println(getName() + " jumps gracefully");
    }
}


public class Main {
    public static void main(String[] args) {
        Doberman doberman = new Doberman("Doberman");
        Terrier terrier = new Terrier("Terrier");
        Cat siamese = new Cat("Sima");
        Cat persian = new Cat("Luna");


        doberman.bark();
        doberman.jump();

        terrier.bark();
        terrier.jump();

        siamese.meow();
        siamese.jump();

        persian.meow();
        persian.jump();
    }
}


