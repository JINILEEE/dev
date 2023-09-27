package mob;

public class Turtle extends Pokemon {

   public Turtle() {
      
   }
   
   public void skill() {
      System.out.println("물대포 !");
   }

   public String toString() {
      return "Turtle [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
   }

}