/* Guitar.java
Andrew Kim
17 September 2017
This class defines the guitar class
*/

import java.awt.Color;
import java.util.Random;

public class Guitar {
  // variable declarations
  private int numStrings;
  private double guitarLength;
  private String guitarManufacturer;
  private Color guitarColor;

  // constructor
  public Guitar(int numStrings, double guitarLength, String guitarManufacturer, Color guitarColor) {
    this.numStrings = numStrings;
    this.guitarLength = guitarLength;
    this.guitarManufacturer = guitarManufacturer;
    this.guitarColor = guitarColor;
  }

  // default constructor
  public Guitar(){
    this(6, 28.2, "Gibson", Color.RED);
  }

  // getters
  public int getNumStrings(){
    return numStrings;
  }

  public double getGuitarLength(){
    return guitarLength;
  }

  public String getGuitarManufacturer(){
    return guitarManufacturer;
  }

  public Color getGuitarColor(){
    return guitarColor;
  }

  public String playGuitar(){
    String melody = "";
    for(int i = 0; i < 15; i++){
      melody += getRandomNote();
      melody += "(";
      melody += getRandomDuration();
      melody += "), ";
    }
    melody += getRandomNote();
    melody += "(";
    melody += getRandomDuration();
    melody += ")";
    return melody;
  }

  // human readable version of guitar information
  public String toString(){
    String description = "";
    description += "Number of Strings: " + numStrings + "\n";
    description += "Guitar Length: " + guitarLength + "\n";
    description += "Guitar Manufacturer: " + guitarManufacturer + "\n";
    description += "Guitar Color: " + guitarColor.toString() + "\n";

    return description;
  }

  // grabs random note
  private String getRandomNote(){
    String[] notes = new String[]{"A", "B", "C", "D", "E", "F", "G"};
    int rndNotesIndex = new Random().nextInt(notes.length);
    return notes[rndNotesIndex];
  }

  // grabs random duration
  private double getRandomDuration(){
    double[] durations = new double[]{0.25, 0.5, 1, 2, 4};
    int rndDurationsIndex = new Random().nextInt(durations.length);
    return durations[rndDurationsIndex];
  }
}
