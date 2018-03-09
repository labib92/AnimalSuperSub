public class Main {
    public static void main(String[] args) {
        Animal cat1= new Cat("J",1);
        Animal dog1 = new Dog("D",1,1);
        Dog dog2 = new Dog("d",1,1);

        cat1.doSound();
        dog1.doSound();
        dog2.doSound();
        dog2.doShit();
    }
}
