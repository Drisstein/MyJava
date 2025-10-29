The StringTokenizer class in Java is a utility used to break a string into smaller parts, called tokens, based on specified delimiters. It is part of the java.util package and provides a simple way to parse strings.
Key Features

Splits a string into tokens based on delimiters (default is whitespace).
Does not distinguish between identifiers, numbers, or quoted strings.
Simpler but less flexible compared to String.split() or Scanner.

Basic Syntax
Javaimport java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String str = "Java is fun to learn!";
        
        // Create a StringTokenizer with default delimiter (whitespace)
        StringTokenizer tokenizer = new StringTokenizer(str);
        
        // Iterate through tokens
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

Constructors


StringTokenizer(String str)
Splits the string str using whitespace as the default delimiter.


StringTokenizer(String str, String delim)
Splits the string str using the specified delim (e.g., ",", "|").


StringTokenizer(String str, String delim, boolean returnDelims)
If returnDelims is true, the delimiters are also treated as tokens.


Common Methods

hasMoreTokens(): Checks if there are more tokens available.
nextToken(): Returns the next token.
countTokens(): Returns the number of remaining tokens.

Example with Custom Delimiters
Javaimport java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String str = "Java,Python;C++|JavaScript";
        String delimiters = ",;|";

        // Create a StringTokenizer with custom delimiters
        StringTokenizer tokenizer = new StringTokenizer(str, delimiters);

        // Print each token
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

Notes

Deprecated for Newer Applications: While StringTokenizer is still available, it is considered somewhat outdated. For modern applications, prefer using:

String.split() for splitting strings.
Scanner for parsing input.



Let me know if you'd like examples of these alternatives! 😊
