/* TestGuitar.java
Andrew Kim
17 September 2017
This class instantiates 3 guitars one of which passes no arguments to constructor
*/

import java.awt.Color;
import java.util.Random;

public class TestGuitar {
  public static void main(String args[]){
    Color magenta = Color.magenta;
    Color blue = Color.blue;
    Guitar guitar1 = new Guitar(15, 25, "Fender", magenta);
    Guitar guitar2 = new Guitar(7, 4, "Gibson", blue);
    Guitar guitar3 = new Guitar();
    testGuitar(guitar1);
    testGuitar(guitar2);
    testGuitar(guitar3);
  }

  // method that prints results of various methods and prompts
  public static void testGuitar(Guitar guitar){
    System.out.println("*******************************************");
    System.out.println("toString(): ");
    System.out.println(guitar.toString());
    System.out.println("getNumStrings(): ");
    System.out.println(guitar.getNumStrings());
    System.out.println("getGuitarLength(): ");
    System.out.println(guitar.getGuitarLength());
    System.out.println("getGuitarManufacturer(): ");
    System.out.println(guitar.getGuitarManufacturer());
    System.out.println("getGuitarColor(): ");
    System.out.println(guitar.getGuitarColor());
    System.out.println("playGuitar(): ");
    System.out.println(guitar.playGuitar());
    System.out.println("*******************************************");
  }
}
