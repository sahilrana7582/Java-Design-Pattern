# 🏗️ Java Design Patterns

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java Version](https://img.shields.io/badge/Java-11%2B-blue.svg)](https://www.oracle.com/java/)
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)]()
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)]()

## 📚 Overview

This repository contains implementations of various design patterns in Java, demonstrating software design principles and best practices. Design patterns are typical solutions to common problems in software design that help create more maintainable, flexible, and robust code.

## 🧩 Design Pattern Categories

### 1. Creational Patterns

Creational patterns provide object creation mechanisms that increase flexibility and reuse of existing code.

| Pattern | Description | Implementation |
|---------|-------------|----------------|
| **Singleton** | Ensures a class has only one instance and provides a global point of access to it | [View Code](src/creational/singleton) |
| **Factory Method** | Creates an instance of several derived classes | [View Code](src/creational/factorymethod) |
| **Abstract Factory** | Creates an instance of several families of classes | [View Code](src/creational/abstractfactory) |
| **Builder** | Separates object construction from its representation | [View Code](src/creational/builder) |
| **Prototype** | A fully initialized instance to be copied or cloned | [View Code](src/creational/prototype) |

### 2. Structural Patterns

Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

| Pattern | Description | Implementation |
|---------|-------------|----------------|
| **Adapter** | Match interfaces of different classes | [View Code](src/structural/adapter) |
| **Bridge** | Separates an object's interface from its implementation | [View Code](src/structural/bridge) |
| **Composite** | A tree structure of simple and composite objects | [View Code](src/structural/composite) |
| **Decorator** | Add responsibilities to objects dynamically | [View Code](src/structural/decorator) |
| **Facade** | A single class that represents an entire subsystem | [View Code](src/structural/facade) |
| **Flyweight** | A fine-grained instance used for efficient sharing | [View Code](src/structural/flyweight) |
| **Proxy** | An object representing another object | [View Code](src/structural/proxy) |

### 3. Behavioral Patterns

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects.

| Pattern | Description | Implementation |
|---------|-------------|----------------|
| **Chain of Responsibility** | A way of passing a request between a chain of objects | [View Code](src/behavioral/chainofresponsibility) |
| **Command** | Encapsulate a command request as an object | [View Code](src/behavioral/command) |
| **Interpreter** | A way to include language elements in a program | [View Code](src/behavioral/interpreter) |
| **Iterator** | Sequentially access the elements of a collection | [View Code](src/behavioral/iterator) |
| **Mediator** | Defines simplified communication between classes | [View Code](src/behavioral/mediator) |
| **Memento** | Capture and restore an object's internal state | [View Code](src/behavioral/memento) |
| **Observer** | A way of notifying change to a number of classes | [View Code](src/behavioral/observer) |
| **State** | Alter an object's behavior when its state changes | [View Code](src/behavioral/state) |
| **Strategy** | Encapsulates an algorithm inside a class | [View Code](src/behavioral/strategy) |
| **Template Method** | Defer the exact steps of an algorithm to a subclass | [View Code](src/behavioral/templatemethod) |
| **Visitor** | Defines a new operation to a class without change | [View Code](src/behavioral/visitor) |

## 🚀 Getting Started

### Prerequisites

- Java 11 or higher
- Maven or Gradle (for dependency management)

### Installation

```bash
# Clone this repository
git clone https://github.com/yourusername/java-design-pattern.git

# Navigate into the project directory
cd java-design-pattern

# Compile the project
javac -d bin src/**/*.java

# Run a specific example (e.g., Singleton pattern)
java -cp bin creational.singleton.SingletonExample
```

## 📋 Usage Examples

### Singleton Pattern

```java
public class SingletonExample {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        
        System.out.println("Are both instances the same? " + (instance1 == instance2));
        // Output: Are both instances the same? true
    }
}
```

### Factory Method Pattern

```java
public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct();
        product.operation();
        // Output: ConcreteProduct operation
    }
}
```

## 📝 Design Pattern Principles

This repository follows key design principles:

- **SOLID Principles**:
    - Single Responsibility Principle
    - Open/Closed Principle
    - Liskov Substitution Principle
    - Interface Segregation Principle
    - Dependency Inversion Principle

- **Design for Change**: Identify the aspects of your application that vary and separate them from what stays the same.

- **Program to an Interface, not an Implementation**: Depend on abstractions, not on concrete classes.

- **Favor Composition over Inheritance**: Achieve flexible designs by composing objects rather than inheritance hierarchies.

## 📊 When to Use Design Patterns

| Problem | Recommended Pattern |
|---------|---------------------|
| Need exactly one instance of a class | Singleton |
| Instantiate one of several possible classes based on data | Factory Method |
| Hide complex initialization code | Builder |
| Need to add responsibilities to objects dynamically | Decorator |
| Complex system needs simple interface | Facade |
| Algorithm's behavior should be selectable at runtime | Strategy |
| Need to maintain object versions/states | Memento |
| One-to-many dependency between objects | Observer |

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🔄 Related Resources

- [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612) by Gamma, Helm, Johnson, Vlissides
- [Head First Design Patterns](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124) by Freeman, Robson, Bates, Sierra
- [Refactoring to Patterns](https://www.amazon.com/Refactoring-Patterns-Joshua-Kerievsky/dp/0321213351) by Kerievsky

## 🧪 Testing

The code includes unit tests to verify the correct implementation of each design pattern.

To run the tests:
```bash
# Using Maven
mvn test

# Using Gradle
gradle test
```

## ✅ Checklist for Pattern Implementation

- [ ] UML class diagram
- [ ] Example code implementation
- [ ] Unit tests
- [ ] Real-world usage examples
- [ ] Strengths and weaknesses
- [ ] Related patterns