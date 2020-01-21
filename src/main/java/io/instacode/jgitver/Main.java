package io.instacode.jgitver;

public class Main {

  public static void main(String[] args) {
    Car.Builder builder = new Car.Builder();
    final Car veloster = builder.make("Hyundai").model("Veloster").maxSpeed(160).build();
    System.out.println(veloster);
  }
}
