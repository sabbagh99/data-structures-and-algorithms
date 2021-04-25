package utilities;

public class Dog {
  private String dog;

  public Dog() {
  }

  public Dog(String dog) {
    this.dog = dog;
  }

  public String getDog() {
    return dog;
  }

  public void setDog(String dog) {
    this.dog = dog;
  }

  @Override
  public String toString() {
    return "{" + dog  + "}";
  }
}
