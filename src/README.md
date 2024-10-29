# Event Management System

A Java-based application for managing events, including workshops and concerts, built using Object-Oriented Programming principles.

## Features

- Create and manage different types of events (e.g., Workshops, Concerts)
- Add, list, search, and cancel events
- Flexible and extensible design using OOP concepts

## Getting Started

### Prerequisites

- Java Development Kit (JDK) version 8 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/event-management-system.git
   ```
2. Navigate to the project directory:
   ```bash
   cd event-management-system
   ```

### Running the Application

1. Compile the project:
   ```bash
   javac *.java
   ```
2. Run the main class:
   ```bash
   java Main
   ```

## Usage

- The application provides a console-based interface for creating and managing events.
- Customize the `Main` class for additional functionalities as needed.

## Class Structure

- **EventBase**: Abstract class for common event attributes.
- **Workshop**: Subclass for workshop events.
- **Concert**: Subclass for concert events.
- **EventManager**: Manages event collection and operations.
- **Main**: Entry point for running the application.

## Contributing

Contributions are welcome! Please create a new branch for features or fixes and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
