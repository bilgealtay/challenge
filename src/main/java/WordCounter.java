public class WordCounter {

    private String dynamicString = "This is a sample string with several words."; // Example dynamic string

    public int countWords() {
        if (dynamicString == null || dynamicString.isEmpty()) {
            return 0; // Return 0 if the string is null or empty
        }

        String trimmedString = dynamicString.trim(); // Remove leading/trailing spaces
        if (trimmedString.isEmpty()) {
            return 0; // Return 0 if the string is empty after trimming
        }

        // Split the string by one or more spaces and count the resulting array's length
        String[] words = trimmedString.split("\\s+");
        return words.length;
    }

    // Method to set the dynamic string (if needed)
    public void setDynamicString(String str) {
        this.dynamicString = str;
    }

    // Example usage in a main method
    public static void main(String[] args) {
        WordCounter counter = new WordCounter();
        int wordCount = counter.countWords();
        System.out.println("Total words in the string: " + wordCount);

        // Example of changing the string and recounting
        counter.setDynamicString("Another string example.");
        wordCount = counter.countWords();
        System.out.println("Total words in the new string: " + wordCount);
    }
}