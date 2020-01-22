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
    CarBuilder builder = new CarBuilder().numberOfDoors(3);
    final Car car = builder.build();
    Assert.assertEquals(car.getNumberOfDoors(), 3);
  }

  @Test
  public void testColor() {
    CarBuilder builder = new CarBuilder().color("Red");
    final Car car = builder.build();
    Assert.assertEquals(car.getColor(), "Red");
  }

  @Test
  public void testBuild() {
    CarBuilder builder = new CarBuilder();
    final Car veloster = builder.make("Hyundai").model("Veloster").maxSpeed(160).build();
    Assert.assertNotNull(veloster);
  }
}