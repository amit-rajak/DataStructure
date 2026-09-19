# 🦆 Duck Simulator – Design Evolution (OOP → Strategy Pattern)

This README explains the **Duck Simulator design journey**, starting from a **basic OOP + inheritance approach** and evolving step by step into the **correct, scalable solution using the Strategy Design Pattern**. This is a classic **Low-Level Design (LLD)** and **interview-friendly** example.

---

## 1. Problem Statement

We want to design a Duck Simulator where:
- All ducks can **swim**
- Some ducks can **fly**
- Ducks can **quack**, **squeak**, or be **silent**
- New duck types and behaviors may be added in the future

The goal is to build a **flexible, maintainable, and extensible** design.

---

## 2. First Approach: Only OOP + Inheritance

### Design Idea
- Create a base `Duck` class
- Put all behaviors (`fly()`, `quack()`, `swim()`) in the base class
- Extend it for different ducks

### Example
```java
class Duck {
    void fly() { System.out.println("I can fly"); }
    void quack() { System.out.println("Quack"); }
    void swim() { System.out.println("All ducks swim"); }
}
```

### Issues
- Not all ducks can fly (e.g., `RubberDuck`)
- Not all ducks quack the same way
- Incorrect behavior is inherited by subclasses

❌ **Inheritance forces behavior that does not apply to all subclasses**

---

## 3. Second Approach: Method Overriding

### Design Idea
- Override `fly()` and `quack()` in subclasses where behavior differs

### Example
```java
class RubberDuck extends Duck {
    void fly() { /* do nothing */ }
    void quack() { System.out.println("Squeak"); }
}
```

### Issues
- Code duplication across many subclasses
- Behavior tightly coupled to class
- Hard to maintain when new behaviors are added

❌ **Inheritance explosion and poor scalability**

---

## 4. Third Approach: Interfaces

### Design Idea
- Use interfaces like `Flyable` and `Quackable`

```java
interface Flyable { void fly(); }
interface Quackable { void quack(); }
```

### Issues
- Behavior logic still duplicated in every class
- No reuse of behavior implementations
- Behavior cannot change at runtime

❌ **Interfaces alone do not solve behavior variation**

---

## 5. Key Design Insight

### What Varies?
- Fly behavior
- Quack behavior

### What Stays the Same?
- Duck identity (Mallard, Rubber, Decoy)

### Core Design Principle
> **Encapsulate what varies and favor composition over inheritance**

---

## 6. Final Solution: Strategy Design Pattern ✅

### Design Idea
- Extract fly and quack behaviors into separate strategy interfaces
- Compose these behaviors inside the `Duck` class
- Allow behavior to change at runtime

---

## 7. Final Design Structure

### Core Classes
- `Duck` (abstract class)
- `FlyBehavior` (interface)
- `QuackBehavior` (interface)

### Concrete Behaviors
- `FlyWithWings`, `FlyNoWay`
- `Quack`, `Squeak`, `MuteQuack`

### Concrete Ducks
- `MallardDuck`
- `RubberDuck`
- `DecoyDuck`

---

## 8. Final Code Example

### Behavior Interfaces
```java
interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}
```

### Abstract Duck Class
```java
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void swim() {
        System.out.println("All ducks swim");
    }

    abstract void display();
}
```

### Concrete Duck
```java
class MallardDuck extends Duck {
    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
```

---

## 9. Runtime Behavior Change (Major Advantage)

[//]: # (```java)

[//]: # (Duck duck = new MallardDuck&#40;&#41;;)

[//]: # (duck.performFly&#40;&#41;;)

[//]: # ()
[//]: # (duck.flyBehavior = new FlyNoWay&#40;&#41;;)

[//]: # (duck.performFly&#40;&#41;;)

[//]: # (```)

✔ Achieved using composition
✔ Not possible with pure inheritance

---

## 10. Benefits of Final Design

- ✅ No code duplication
- ✅ Loose coupling
- ✅ Open/Closed Principle followed
- ✅ Easy to add new behaviors
- ✅ Runtime flexibility
- ✅ Clean and testable design

---

## 11. Interview Summary (One-Liner)

> “I started with inheritance, but behavior variation caused rigidity and duplication. Interfaces helped partially, but the real solution was identifying fly and quack as varying behaviors and applying the Strategy Pattern using composition, enabling runtime behavior changes and scalable design.”

---

## 12. Key Concepts Demonstrated

- Object-Oriented Programming
- Inheritance pitfalls
- Composition over inheritance
- Strategy Design Pattern
- SOLID principles (SRP, OCP)
- Real-world LLD thinking

---

✅ **This design is production-ready and interview-approved.**

