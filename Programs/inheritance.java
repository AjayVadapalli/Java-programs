class vehicle{
    public void start(){
        System.out.println("Vehicle started");
    }    
}

class car extends vehicle{
    public void start(){
        System.out.println("Car started");
    }
}

public class inheritance{
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.start();
        car c =new car();
        c.start();
    }
}
