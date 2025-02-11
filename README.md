# 🎲 Object-Oriented-Dice-Game-A-Java-Implementation

This project is a **Java-based dice game** that follows **object-oriented programming (OOP)** principles, including **abstraction, encapsulation, and clean code design**. Players take turns rolling two dice, making strategic decisions, and competing to be the last player standing.

## 📌 Features
- **Turn-Based Gameplay**: Players roll dice and either gain, lose, or retain their score based on the game rules.
- **Game Rules**:
  - If neither die is `1`, the sum of the dice is **added** to the player's score.
  - If one die is `1`, the player's score **remains the same**.
  - If both dice are `1`, the player **loses all points and is eliminated**.
  - Players can **choose to skip their turn** (rolling `0-0`).
  - The game continues until **only one player remains**.
- **Object-Oriented Design**: Implements **abstraction and encapsulation** using Java classes and objects.
- **File Input & Output**: Reads game setup and dice rolls from an input file, and writes game progress to an output file.
- **Strategic Decision Making**: Players must decide whether to roll or skip based on their current score and risk.

## 🚀 Running the Program
Compile and run the game using:
```bash
javac8 DiceGame.java
java8 DiceGame input.txt output.txt
 

