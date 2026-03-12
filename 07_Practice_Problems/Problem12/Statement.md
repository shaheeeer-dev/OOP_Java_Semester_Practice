## OOP Practice Problem 12: Typing Speed Test (Swing GUI)

### Scenario
A developer wants to build a desktop application to measure typing speed. The program displays a random sentence, and the user types it in a text area. The system calculates the typing speed in words per minute (WPM) and checks whether the input matches the given sentence.

### Requirements
- Display a random sentence from a predefined set using a **JTextArea**.
- Provide a **JTextArea** for user input.
- Start the timer when the sentence is displayed.
- When the user clicks the "Check Speed" button:
    - Calculate the total time taken in seconds.
    - Count the number of words typed.
    - Compute typing speed in **words per minute (WPM)**.
    - Check if the typed text matches the displayed sentence exactly.
    - If correct, display a message dialog with the typing speed.
    - If incorrect, display a message dialog indicating mistakes.
- Allow the user to reset the test with a new random sentence.

### Focus
- Swing GUI Components (JFrame, JTextArea, JButton, JScrollPane, BorderLayout)
- Event Handling (ActionListener)
- String Manipulation (splitting, trimming, comparison)
- Timer logic using `System.currentTimeMillis()`
- Basic Object-Oriented Design