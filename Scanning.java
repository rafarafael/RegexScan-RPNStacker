import java.util.ArrayList;
import java.util.List;

public class Scanning {
    private static TokenType op (String operador) {
        if (Regex.isPlus(operador)) return TokenType.PLUS;
        else if (Regex.isMinus(operador)) return TokenType.MINUS;
        else if (Regex.isStar(operador)) return TokenType.STAR;
        else return TokenType.SLASH;
    }

    public static List<Token> scan(String exp) throws Exception {
        String[] simbolos = exp.split(",");
        List<Token> l = new ArrayList<Token>();
        for (String s : simbolos) {
            if (Regex.isNum(s)) {
                Token t = new Token(TokenType.NUM, s);
                l.add(t);
            } else if (Regex.isOP(s)) {
                Token t = new Token(op(s), s);
                l.add(t);
            } else {
                throw new Exception("Error: Unexpected Token: " + s);
            }
        }  
        return l;  
    } 
}
