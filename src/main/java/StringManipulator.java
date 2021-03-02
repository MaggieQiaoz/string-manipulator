
/**
 * Library of various string manipulation functions
 */
public class StringManipulator {
    private String string;

    public StringManipulator(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    // Shuffle characters in the string
    public void permute() {
        //TODO: Implement
    }

    // Calculate the sum of all character values
    public long calculateChecksum() {
        return string.chars().count();
    }

    public void removeAs() {
        string = string.replace("a", "");
    }

    public void encrypt() {
        string = string.chars().map((c) -> c + 1).collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

    public void decrypt() {
        string = string.chars().map((c) -> c - 1).collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }

}
