
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

}
