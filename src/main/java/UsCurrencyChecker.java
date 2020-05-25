import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    private static final String CURRENCY_PATTERN = "\\$\\s?\\d+(\\.\\d{1,2})?";
    private static final Pattern currencyPattern = Pattern.compile(CURRENCY_PATTERN);

    public static Matcher getMatcher(String usCurrencyString) {
        return currencyPattern.matcher(usCurrencyString);
    }
}
