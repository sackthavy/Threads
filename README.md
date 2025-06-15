# 🏎️ Threads: F1 Simulation with Java Multithreading

Welcome to the **Threads** repository! This project simulates a Formula 1 race using Java's multithreading capabilities. Each thread represents a driver, running independently to showcase how concurrency works in Java. 

![F1 Race](https://example.com/f1-race-image.png)

## Table of Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
- [How It Works](#how-it-works)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Topics](#topics)
- [Contributing](#contributing)
- [License](#license)
- [Releases](#releases)

## Overview

In this project, the main class initiates multiple threads, each representing a different F1 driver. Each thread executes the `run()` method, printing the driver's name every second for a total of 30 times. This setup demonstrates how Java handles multiple tasks at the same time, allowing for a dynamic and engaging simulation.

## Getting Started

To get started with the **Threads** project, you need to clone the repository and set up your environment. 

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)

### Clone the Repository

You can clone the repository using the following command:

```bash
git clone https://github.com/sackthavy/Threads.git
```

## How It Works

The core of the simulation lies in the `MinhaThread` class, which extends `Thread`. Each instance of this class represents a driver. 

### Key Components

- **Main Class**: Initializes the threads.
- **MinhaThread Class**: Contains the logic for each driver's actions.
- **run() Method**: Prints the driver's name every second.

### Example Code

Here is a simplified version of how the threads are created:

```java
public class Principal {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            MinhaThread driver = new MinhaThread("Driver " + i);
            driver.start();
        }
    }
}

class MinhaThread extends Thread {
    private String driverName;

    public MinhaThread(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(driverName);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

## Features

- Simulates a Formula 1 race using multithreading.
- Each driver runs in its own thread.
- Demonstrates concurrency in Java.
- Easy to modify and extend.

## Installation

To install the project, follow these steps:

1. **Clone the Repository**: Use the command provided in the "Getting Started" section.
2. **Open in IDE**: Open the cloned project in your preferred IDE.
3. **Build the Project**: Ensure that all dependencies are resolved and build the project.

## Usage

After setting up the project, you can run the simulation by executing the `Principal` class. Each driver's name will print to the console every second for 30 seconds.

### Running the Simulation

To run the simulation, follow these steps:

1. Open the `Principal` class in your IDE.
2. Click on the run button or use the terminal to execute the class.
3. Observe the output in the console.

## Topics

This project covers various topics related to Java programming:

- **Concurrency**: Understanding how multiple threads operate simultaneously.
- **Multithreading**: Managing multiple threads for efficient execution.
- **Object-Oriented Programming (OOP)**: Using classes and objects to structure the program.
- **Simulation**: Creating a realistic representation of a racing scenario.

## Contributing

Contributions are welcome! If you want to contribute to the **Threads** project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes.
4. Push to your branch.
5. Create a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Releases

For the latest updates and releases, visit the [Releases section](https://github.com/sackthavy/Threads/releases). You can download the latest version of the project from there and execute it in your local environment.

![Download Latest Release](https://img.shields.io/badge/Download%20Latest%20Release-Click%20Here-blue)

## Conclusion

Thank you for checking out the **Threads** project! This simulation not only showcases the power of multithreading in Java but also serves as a fun way to learn about concurrency. Feel free to explore the code, modify it, and make it your own. Happy coding!