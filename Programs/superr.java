class animal{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends animal{
    public void makeSound(){
        super.makeSound();
        System.out.println("Woof");
    }
}

public class superr{
   public static void main(String[] args) {
        Dog d =new Dog();
        d.makeSound();
    }
}