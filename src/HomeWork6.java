public class HomeWork6 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat", "White", "Cat1", 200);
        Cat cat2 = new Cat("Cat", "Grey", "Cat2", 200);
        Dog dog1 = new Dog("Dog", "Brown", "Dog1", 500, 10);
        Dog dog2 = new Dog("Dog", "Black", "Dog2", 500, 10);

        System.out.println("-------Cats run-------");
        cat1.run(150);
        cat2.run(250);
        System.out.println("-------Cats swim-------");
        cat1.swim(10);
        cat2.swim(0);
        System.out.println("-------Dogs run-------");
        dog1.run(501);
        dog2.run(200);
        System.out.println("-------Dogs swim-------");
        dog1.swim(400);
        dog2.swim(5);




    }

}
