package io.instacode.jgitver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarBuilderTest {

  @Test
  public void testMake() {
    CarBuilder builder = new CarBuilder().make("Hyundai");
    final Car car = builder.build();
    Assert.assertEquals(car.getMake(), "Hyundai");
  }

  @Test
  public void testModel() {
    CarBuilder builder = new CarBuilder().model("Veloster");
    final Car car = builder.build();
    Assert.assertEquals(car.getModel(), "Veloster");
  }

  @Test
  public void testMaxSpeed() {
    CarBuilder builder = new CarBuilder().maxSpeed(160);
    final Car car = builder.build();
    Assert.assertEquals(car.getMaxSpeed(), 160);
  }

  @Test
  public void testNumberOfDoors() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }

  @Test
  public void testColor() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }

  @Test
  public void testBuild() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }

  @Test
  public void testGetMake() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }

  @Test
  public void testGetModel() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }

  @Test
  public void testGetMaxSpeed() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }

  @Test
  public void testGetNumberOfDoors() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }

  @Test
  public void testGetColor() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }
}