package utilities;

public class MultiBracketValidation {

  public static boolean multiBracketValidation(String input){
    int parenCount  = 0, bracketCount =0, carlyCount = 0;

    for (int i = 0; i < input.length(); i++) {

      int checkChar = input.charAt(i);

      parenCount += (checkChar == '(' ? 1 : 0);
      parenCount -= (checkChar == ')' ? 1 : 0);
      bracketCount += (checkChar == '[' ? 1 : 0);
      bracketCount -= (checkChar == ']' ? 1 : 0);
      carlyCount += (checkChar == '{' ? 1 : 0);
      carlyCount -= (checkChar == '}' ? 1 : 0);

      if (parenCount == 0 && bracketCount == 0 && carlyCount == 0)
        return true;
    }

    return false;
  }
}
