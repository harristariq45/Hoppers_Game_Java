
public class Frog{


    private double xPosition;			// The X coordinate of this frog
	private double yPosition;			// The Y coordinate of this frog
    private String colour;
    private String name;	            // colour either green or red
    private int number;

    public Frog(String newName, int frognumber, String frogcolour)
    {   
        name = newName;
        colour = frogcolour; // only red an dgreen are allowed colours
        number= frognumber;
        
    }


}