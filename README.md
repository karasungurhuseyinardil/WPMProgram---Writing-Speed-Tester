
```markdown
# 🧠 WPMProgram - Java Typing Speed and Accuracy Test

**WPMProgram** is a console-based Java application that allows users to test their typing speed and accuracy by typing a randomly generated set of words. It calculates Words Per Minute (WPM), accuracy percentage and the number of correctly typed words. This project is ideal for practicing Java programming, building CLI applications and improving typing skills.

---

## 📌 Features

- ⏳ **Countdown Timer** before the typing test begins (3 seconds).
- 📝 **Randomized Test Line**: A 20-word sentence is generated from a pool of common words.
- 🧠 **Typing Evaluation**:
  - Measures how long the user takes to type the sentence.
  - Calculates WPM (Words Per Minute) based on standard typing formulas.
  - Determines **accuracy** by comparing the original and typed strings character-by-character.
  - Counts the number of **correctly typed words**.
- 🎉 **Feedback System**:
  - Encouraging messages based on WPM score.

---

## 🚀 Getting Started

### Installation

1. Save the code in a file named `WPMProgram.java`.
2. Open a terminal in the file directory.
3. Compile the program:

```bash
javac WPMProgram.java
```

4. Run the program:

```bash
java WPMProgram
```

---

## 🧪 How It Works

When the program runs:

1. A short countdown (3...2...1) is shown.
2. A 20-word test line appears.
3. You type the line and press Enter.
4. The program evaluates:
   - ⏱️ **Time taken**
   - 📈 **WPM (Words Per Minute)**

     \[
     WPM = \left(\frac{\text{Characters typed}}{5}\right) \div \left(\frac{\text{Seconds}}{60}\right)
     \]

   - ✅ **Accuracy**
   - 🟢 **Correct words**

---

## 🧾 Example Output

```bash
Typing test is starting...
3
2
1

Type the following line:
jump light smile cloud window book travel planet mouse screen ...

User input:
jump light smile cloud window book travel planet mouse screen

Time: 11.32 seconds
Your WPM (Words Per Minute): 53.00
Accuracy: 100.00%
Correctly typed words: 10/10
Great job! You're typing like a pro! 🚀
```

---

## ⚙️ Code Structure

- `main`: Handles test flow and output.
- `countdown`: Delays using 1-second intervals.
- `generateTestLine`: Picks 20 random words.
- `calculateAccuracy`: Compares typed and expected strings.
- `countCorrectWords`: Word-by-word comparison.

---


## 🤝 Contributions

Pull requests are welcome. Feel free to fork, enhance and share your improvements!
```
