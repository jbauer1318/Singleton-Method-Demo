public class MotherShip {
    private static MotherShip instance = null;
    
    private String ship_name;
    private int crew_size;
    
    public static MotherShip getInstance()
    {
        if(instance == null)
        {
            instance = new MotherShip("Bertha", 150);
        }
        return instance;
    }
    
    private MotherShip(String name, int crew_size)
    {
        ship_name = name;
        this.crew_size = crew_size;
    }
     
    public String getName()
    {  return ship_name;  }
    
    public void setName(String name)
    {  ship_name = name;  }
    
    public int getCrewSize()
    {  return crew_size;  }
    
    public void setCrewSize(int size)
    {  crew_size = size;  }
   
}