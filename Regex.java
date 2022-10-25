public class Regex {

    public static boolean isNum(String token) {
      return token.matches("-?\\d+");
    }

    public static boolean isOP(String token) {
      return token.matches("\\+|-|/|\\*");
    }
    
    public static boolean isPlus(String token) {
      return token.matches("\\+");
    }

    public static boolean isMinus(String token) {
      return token.matches("\\-");
    }

    public static boolean isStar(String token) {
      return token.matches("\\*");
    }

    public static boolean isSlash(String token) {
      return token.matches("\\/");
    }
}
