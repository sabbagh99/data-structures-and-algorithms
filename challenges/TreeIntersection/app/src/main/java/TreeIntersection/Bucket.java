package TreeIntersection;
public class Bucket<T> {
  T key;
  T value;
  Bucket next;

  Bucket(T key, T value){
    this.key = key;
    this.value = value;
    next=null;

  }

  public Bucket() {
  }

  @Override
  public String toString() {
    return "Bucket{" +
      "key=" + key +
      ", value=" + value +
      ", next=" + next +
      '}';
  }
}
