package src.java.p5_多态性的使用;

import org.omg.CORBA.Object;

public class AnimalTest {

    public static void main(String[] args) {
//        AnimalTest animalTest = new AnimalTest();
//        animalTest.func(new Dog());
//        animalTest.func(new Cat());

        Animal dog = new Dog();
        Animal cat = new Cat();

        cat.eat();
        dog.eat();

        Dog dog1 = (Dog) dog;
        System.out.println(dog1.id);

        if (dog instanceof Animal){
            System.out.println("是的");
        }
        if (cat instanceof Cat){
            System.out.println("!!!!!是的");
        }



    }


    public void func(Animal animal) {
        animal.eat();
        animal.shout();
    }


}

class Animal {

    public void eat() {
        System.out.println("动物： 进食");
    }

    public void shout() {
        System.out.println("动物： 叫");
    }
}

class Dog extends Animal {

    int id=3;

    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void shout() {
        System.out.println("旺！旺！旺！ ");
    }
}

class Cat extends Animal {

    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void shout() {
        System.out.println("瞄！瞄！瞄！ ");
    }
}