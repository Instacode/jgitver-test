package io.instacode.jgitver;

public class Car {

  private String make;
  private String model;
  private int maxSpeed;
  private int numberOfDoors;
  private String color;

  /**
   * Constructor for instances of type {@link Car} using the CarBuilder implementation
   */
  public Car(CarBuilder builder) {
    this.make = builder.getMake();
    this.model = builder.getModel();
    this.maxSpeed = builder.getMaxSpeed();
    this.numberOfDoors = builder.getNumberOfDoors();
    this.color = builder.getColor();
  }

  /**
   * Getter for property 'make'.
   *
   * @return Value for property 'make'.
   */
  public String getMake() {
    return make;
  }

  /**
   * Getter for property 'model'.
   *
   * @return Value for property 'model'.
   */
  public String getModel() {
    return model;
  }

  /**
   * Getter for property 'maxSpeed'.
   *
   * @return Value for property 'maxSpeed'.
   */
  public int getMaxSpeed() {
    return maxSpeed;
  }

  @Override
  public String toString() {
    return "Car{" + "make='" + make + '\'' + ", model='" + model + '\'' + ", maxSpeed=" + maxSpeed
        + " mph" + '}';
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public String getColor() {
    return color;
  }

}
