import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    private Pattern p;
    private Matcher m;

    public final String PHONE_NUMBER_FORM = "\\([0-9]{2}\\)-\\([0][0-9]{9}\\)";

    public boolean validateNumber(String regex) {
        p = Pattern.compile(PHONE_NUMBER_FORM);
        m = p.matcher(regex);
        return m.matches();
    }
}
