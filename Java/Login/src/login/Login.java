
package login;
import java.util.regex.Pattern;
public class Login {

    public static void main(String[] args) {
      
    // Senha de 4-8 caracteres exigindo números e alfabetos de ambos os casos
    private static final String PASSWORD_REGEX =
            "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
    }

     // Senha de 4-32 caracteres exigindo pelo menos 3 de 4 (maiúsculas
    // e letras minúsculas, números e caracteres especiais) e no máximo
    // 2 caracteres consecutivos iguais.
    private static final String COMPLEX_PASSWORD_REGEX =
            "^(?:(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])|" +
            "(?=.*\\d)(?=.*[^A-Za-z0-9])(?=.*[a-z])|" +
            "(?=.*[^A-Za-z0-9])(?=.*[A-Z])(?=.*[a-z])|" +
            "(?=.*\\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9]))(?!.*(.)\\1{2,})" +
            "[A-Za-z0-9!~<>,;:_=?*+#.\"&§%°()\\|\\[\\]\\-\\$\\^\\@\\/]" +
            "{8,32}$";
}
