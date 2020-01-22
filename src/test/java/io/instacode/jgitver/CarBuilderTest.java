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
    throw new UnsupportedOperationException("Test method not implemented yet.");
  }

  @Test
  public void testMaxSpeed() {
    throw new UnsupportedOperationException("Test method not implemented yet.");
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