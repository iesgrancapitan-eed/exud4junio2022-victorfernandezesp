package src.com.victorfe.examen.junio;


/**
 * 
 * @author vicfe
 *
 */

/**
 * Clase Bike que hereda de Vehiculo
 * @author vicfe
 *
 */
class Bike implements Vehicle {  
  
  private int speed;/*Atributo speed*/
  private int gear;/*Atributo gear*/
    
  /**
   * Getter que devuelve speed
   * @return
   */
  private int getSpeed() {
    return speed;
  }


  /**Setter que asigna speed
   * @param speed
   */
  private void setSpeed(int speed) {
    this.speed = speed;
  }


  /**
   * Getter que devuelve gear
   * @return
   */
  private int getGear() {
    return gear;
  }

  /**Setter que asigna gear
   * @param gear
   */
  private void setGear(int gear) {
    this.gear = gear;
  }


  /**
   *Metodo que cambia Gear
   */
  @Override
  public void changeGear(int newGear){     
      gear = newGear;
  }
    
  /**
   *Metodo que  sube la velocidad
   */
  @Override
  public void speedUp(int increment){
      speed = speed + increment;
  }
   
  /**
   *Metodo que aplica Brakes
   */
  @Override
  public void applyBrakes(int decrement){     
      speed = speed - decrement;
  }
  
  /**
   *Metodo que imprime speed y gear
   */
  @Override
  public void printStates() {
      System.out.println("speed: " + speed
          + " gear: " + gear);
  }


/**
 *Metodo que forma una cadena con speed y gear
 */
@Override
public String toString() {
	return "Bike [speed=" + speed + ", gear=" + gear + "]";
}
  
}

//class Bike implements Vehicle {
//    
//  int speed;
//  int gear;
//
//  @Override
//  public void changeGear(int newGear){
//        
//      gear = newGear;
//  }
//    
//  @Override
//  public void speedUp(int increment){
//        
//      speed = speed + increment;
//  }
//
// @Override
//  public void applyBrakes(int decrement){
//        
//      speed = speed - decrement;
//  }
//    
//  public void printStates() {
//      System.out.println("speed: " + speed
//          + " gear: " + gear);
//  } 
//}

//class GFG {
//    
//  public static void main (String[] args) {
//    
//      // creating an inatance of Bike
//      // doing some operations
//      Bike bicycle = new Bike();
//      bicycle.changeGear(2);
//      bicycle.speedUp(3);
//      bicycle.applyBrakes(1);
//        
//      System.out.println("Bike present state :");
//      bicycle.printStates();
//        
//      // creating instance of the bike.
//      Bike bike = new Bike();
//      bike.changeGear(1);
//      bike.speedUp(4);
//      bike.applyBrakes(3);
//        
//      System.out.println("Bike present state :");
//      bike.printStates();
//  }
//}