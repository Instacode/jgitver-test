package io.instacode.jgitver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {

  @Test
  public void testGetMake() {
    Car.Builder builder = new Car.Builder();
    final Car veloster = builder.make("Hyundai").model("Veloster").maxSpeed(160).build();
    Assert.assertEquals(veloster.getMake(), "Hyundai");
  }

  @Test
  public void testGetModel() {
    Car.Builder builder = new Car.Builder();
    final Car veloster = builder.make("Hyundai").model("Veloster").maxSpeed(160).build();
    Assert.assertEquals(veloster.getModel(), "Veloster");
  }

  @Test
  public void testGetMaxSpeed() {
    Car.Builder builder = new Car.Builder();
    final Car veloster = builder.make("Hyundai").model("Veloster").maxSpeed(160).build();
    Assert.assertEquals(veloster.getMaxSpeed(), 160);
  }
}