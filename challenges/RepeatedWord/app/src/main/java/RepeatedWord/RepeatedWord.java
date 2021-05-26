package RepeatedWord;

public class RepeatedWord {
  Hashtable hashTable = new Hashtable();


  public String repeatedWord(String text) {

    if (text == "")
      return null;
    Bucket repeated = null;
    String[] words = text.split("[, ?.@]+");
    int idx = 0;
    for (int i = 0; i < words.length - 1; i++) {
      idx = hashTable.hash(words[i].toLowerCase());
      if (hashTable.arr[idx] == null) {

        hashTable.add(words[i].toLowerCase(), words[i].toLowerCase());
      } else {

        repeated = new Bucket(hashTable.arr[idx].key, hashTable.arr[idx].value);
        return (String) repeated.value;

      }
    }

    return "there is no repeated words";
  }
}
