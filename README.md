# Palindrome Checker

## Description
This is a simple Java program that checks whether a given word or phrase is a palindrome. The program ignores case and non-alphanumeric characters to determine if the input reads the same forward and backward.

## Features
- Accepts words or phrases as input.
- Ignores case and special characters while checking for palindromes.
- Runs in a loop until the user types `exit`.
- Provides clear output indicating whether the input is a palindrome.

## How to Run
### Prerequisites
- Java Development Kit (JDK) installed
- A command-line terminal (Command Prompt, Terminal, etc.)

### Steps
1. Copy the `PalindromeChecker.java` file into a directory on your computer.
2. Open a terminal and navigate to the directory where the file is saved.
3. Compile the Java program using:
   ```sh
   javac PalindromeChecker.java
   ```
4. Run the compiled program using:
   ```sh
   java PalindromeChecker
   ```
5. Enter a word or phrase when prompted.
6. To exit the program, type `exit`.

## Example Usage
```
Enter a word or phrase (or type 'exit' to quit): Racecar
The given input is a palindrome.

Enter a word or phrase (or type 'exit' to quit): Hello
The given input is not a palindrome.

Enter a word or phrase (or type 'exit' to quit): A man, a plan, a canal, Panama
The given input is a palindrome.

Enter a word or phrase (or type 'exit' to quit): exit
Exiting the program.
```

## Code Explanation
- The program uses a `Scanner` to read user input.
- It removes non-alphanumeric characters and converts everything to lowercase.
- The processed string is checked for palindrome properties using `StringBuilder.reverse()`.
- Provides continuous execution until the user decides to exit.

## Future Enhancements
- Add support for checking palindromes in multiple languages.
- Implement a GUI version for better user experience.
- Optimize performance for very large inputs.

## License
This project is open-source and available for personal and educational use.

