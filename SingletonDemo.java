public class SingletonDemo {

    
    public static void main(String[] args) {
        
        MotherShip ship_1 = MotherShip.getInstance();
        MotherShip ship_2 = MotherShip.getInstance();
        
        System.out.println("Ship 1 Name: " + ship_1.getName());
        System.out.println("Ship 2 Name: " + ship_2.getName());
        
        ship_1.setName("Maggie");
        
        System.out.println("Ship 1 Name: " + ship_1.getName());
        System.out.println("Ship 2 Name: " + ship_2.getName());
        
        
    }
    
}