public class Main {
	public static void main(String[] args) {

		System.out.println(scramble("aabbcamaomsccdd","commas"));
	}
   
	public static boolean scramble(String str1, String str2) {    
      byte i = 0;
      for (char letter : str2.toCharArray()) {
        String letterAsString = String.valueOf(letter);
        if (str1.contains(letterAsString)) {
          str1 = str1.replaceFirst(letterAsString, "_");
          i++;
        }
      }

      if (i == str2.length()) {
        return true;
      }
      return false;
    }    
}
