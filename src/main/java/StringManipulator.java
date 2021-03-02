
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
        List<char> s = new ArrayList<char>(); 
        int length = string.length();
        for ( int i= 0; i< length; i++){
            s.add(string.charAt(i));
        }
        Collections.shuffle(s);
        String newString = "";
        for(int j= 0; j< length; j++){
            newString+=s[j];
        }
        string=newString;

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
    public void removelowercaseA() {
        int length = string.length();
        for ( int i= 0; i< length; i++){
            if(string.charAt(i) == 'a'){
                string = string.substring(0, i-1) + string.substring(i+1, length-1);
                length--;
            }
        }
    }

}
