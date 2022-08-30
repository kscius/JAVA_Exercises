import java.io.Console;

class SqueakyClean {
    static String clean(String identifier) {
        // replace -letter with uppercase letter
        return java.util.regex.Pattern.compile("-(.)")
                .matcher(identifier)
                .replaceAll(mr -> mr.group(1).toUpperCase())
                .replaceAll("[\\p{Cntrl}]", "CTRL")
                .replaceAll("\\s", "_")
                .replaceAll("[^\\p{L}_]", "")
                .replaceAll("[\\p{IsGreek}&&[^\\p{Lu}]]", "");
    }
}
