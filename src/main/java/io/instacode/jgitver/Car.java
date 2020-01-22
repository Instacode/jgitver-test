package io.instacode.jgitver;

public class Car {

  private String make;
  private String model;
  private int maxSpeed;

  /**
   * Constructor for instances of type {@link Car} using the Builder implementation
   */
  private Car(Builder builder) {
    this.make = builder.make;
    this.model = builder.model;
    this.maxSpeed = builder.maxSpeed;
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

  /**
   * Builder for instances of type {@link Car}
   */
  public static final class Builder {
    private String make;
    private String model;
    private int maxSpeed;

    /**
     * Set the value of the field make of the target instance of type {@link Car}
     */
    public Builder make(final String make) {
      this.make = make;
      return this;
    }

    /**
     * Set the value of the field model of the target instance of type {@link Car}
     */
    public Builder model(final String model) {
      this.model = model;
      return this;
    }

    /**
     * Set the value of the field maxSpeed of the target instance of type {@link Car}
     */
    public Builder maxSpeed(final int maxSpeed) {
      this.maxSpeed = maxSpeed;
      return this;
    }

    /**
     * Create a new instance of type {@link Car}
     */
    public Car build() {
      return new Car(this);
    }
  }
}
