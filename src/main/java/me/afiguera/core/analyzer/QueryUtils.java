package me.afiguera.core.analyzer;

public class QueryUtils {

    public static boolean validateBracePairing(final String query) {
        var braceUnParing = 0;
        for (char c : query.toCharArray()) {
            if (c == '{') {
                braceUnParing++;
            } else if (c == '}') {
                braceUnParing--;
            }
        }
        return braceUnParing == 0;
    }

}
