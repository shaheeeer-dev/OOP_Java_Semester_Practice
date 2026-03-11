## OOP Practice Problem 11: Tic Tac Toe Game (Swing GUI)

**Scenario:**
A developer wants to build a simple Tic Tac Toe desktop game where two players can play against each other on the same computer. The game should provide a graphical interface where players click on a grid to place their symbols (X or O) and the system determines the winner automatically.

**Requirements:**
-	Create a **3×3** game board using Java Swing components.
-	Use buttons (JButton) to represent each cell of the Tic Tac Toe board.
-	Two players should play alternately:
-	Player `1 → X`
-	Player `2 → O`
-	When a player clicks a button:
-	The symbol should appear on the button.
-	The button should not be clickable again.
-	Implement logic to check for a winner after every move:
-	Horizontal win
-	Vertical win
-	Diagonal win
-	If a player wins, display a message dialog announcing the winner.
-	After the game ends, provide a way to reset the board and start a new game.

**Focus:**
-	Swing GUI Components (JFrame, JButton, GridLayout)
-	Event Handling (ActionListener)
-	Game Logic using 2D structures
-	Basic Object-Oriented Design