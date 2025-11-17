# Java Slot Machine

A simple command-line slot machine game written in Java. Test your luck and try to beat the odds by placing bets and spinning the reels to win prizes!

## Features

- Play with an initial balance of $100.
- Place bets and spin the slot machine.
- Win multipliers based on matching symbols.
- Continue playing until you run out of funds or decide to stop.

## Symbols

The game uses the following symbols:

- 🍋 (Lemon)
- 🍉 (Watermelon)
- 🍒 (Cherry)
- 🔔 (Bell)
- ⭐ (Star)

## How to Run

1. Clone this repository or download the source code.
2. Compile the Java program:
    ```bash
    javac -d bin src/org/example/Main.java
    ```
3. Run the program:
    ```bash
    java -cp bin org.example.Main
    ```

## Usage

- Enter your bet amount when prompted.
- The slot machine will spin and display three symbols.
- If you win, your balance increases accordingly.
- Decide whether to play again or exit.

## License

This project is for educational purposes. Feel free to modify and expand it!

---

## Example Output

```
*************************
Welcome to Java Slots
Symbols: 🍋 🍉 🍒 🔔 ⭐
*************************
Current Balance: $100
Place your bet amount: 10
Spinning...
**********
 🍒|🍒|🍒
**********
You won $40
Do you want to play again? (Y/N): N
GAME OVER! Your final balance is $130
```
Enjoy playing the Java Slot Machine! 🎰

---
