package io.instacode.jgitver;

/**
 * CarBuilder for instances of type {@link Car}
 */
public final class CarBuilder {
  private String make;
  private String model;
  private int maxSpeed;
  private int numberOfDoors;
  private String color;

  public CarBuilder() {
  }

  /**
   * Set the value of the field make of the target instance of type {@link Car}
   */
  public CarBuilder make(final String make) {
    this.make = make;
    return this;
  }

  /**
   * Set the value of the field model of the target instance of type {@link Car}
   */
  public CarBuilder model(final String model) {
    this.model = model;
    return this;
  }

  /**
   * Set the value of the field maxSpeed of the target instance of type {@link Car}
   */
  public CarBuilder maxSpeed(final int maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

  /**
   * Set the value of the field numberOfDoors of the target instance of type {@link Car}
   */
  public CarBuilder numberOfDoors(final int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
    return this;
  }

  /**
   * Set the value of the field color of the target instance of type {@link Car}
   */
  public CarBuilder color(final String color) {
    this.color = color;
    return this;
  }

  /**
   * Create a new instance of type {@link Car}
   */
  public Car build() {
    return new Car(this);
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

  /**
   * Getter for property 'numberOfDoors'.
   *
   * @return Value for property 'numberOfDoors'.
   */
  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  /**
   * Getter for property 'color'.
   *
   * @return Value for property 'color'.
   */
  public String getColor() {
    return color;
  }
}
