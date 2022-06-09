package src.com.victorfe.examen.junio;



/**
 * Interfaz Vehiculo, super clase
 * @author vicfe
 *
 */
interface Vehicle {

  /**
   * Superclase donde heredara el metodo newGear
   * @param newGear
   */
  void changeGear(int newGear);

  /**Superclase donde heredara el metodo increment
   * @param increment
   */

  void speedUp(int increment);

  /**Superclase donde heredara el metodo decrement
   * @param decrement
   */
  void applyBrakes(int decrement);

  /**
   * Superclase donde heredara el metodo printStates
   */
  void printStates();

}
