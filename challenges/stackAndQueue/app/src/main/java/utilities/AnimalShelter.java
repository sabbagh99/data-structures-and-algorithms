package utilities;

import stackAndQueue.Queue;

public class AnimalShelter<T> {
  Queue addDog = new Queue();
  Queue addCat = new Queue();

  public void enqueue(T value) {
    if (value instanceof Cat) {
      addCat.enqueue(value);
    } else if (value instanceof Dog) {
      addDog.enqueue(value);
    }
  }

  public T dequeue(T pref) {
    if (pref == null)
      return (T) null;

    if (pref == "dog")
      return (T) addDog.dequeue();
    else if (pref == "cat") {
      return (T) addCat.dequeue();
    }
    return null;
  }


  @Override
  public String toString() {
    return "" + addDog + addCat;
  }
}
