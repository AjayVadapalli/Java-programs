class animal{
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends animal{
    public void makeSound(){
        System.out.println("Woof");
    }
}
class puppy extends dog{
    public void makeSound(){
        System.out.println("Yap");
    }
}

public class multiLevelInheritance{
    public static void main(String[] args) {
        animal a = new  animal();
        dog d = new dog();
        puppy p = new puppy();
        a.makeSound();
        d.makeSound();
        p.makeSound();
        
    }
}