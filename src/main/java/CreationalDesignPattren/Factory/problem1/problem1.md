# 🏭 Factory Method Design Pattern

## 🔍 Intent:
The Factory Method Pattern provides an interface for creating objects, but lets subclasses decide which class to instantiate. It helps you delegate the object creation process to child classes.

## 🧩 Problem Summary (Theory-Only)
You're building a Notification System that can send messages via:

- Email
- SMS
- Push notifications

Each type requires different configurations and logic. If you instantiate these types directly using `new`, your code becomes:

- Tightly coupled
- Hard to extend
- Difficult to test and maintain

## 🧠 Factory Method Solution:
1. Define a common interface or abstract class like `Notification`.
2. Let each type (Email, SMS, Push) implement that interface.
3. Define a creator class with a `createNotification()` method — this is the factory method.
4. Subclasses override `createNotification()` to return their own specific type.

## 📦 Benefits:
| Benefit          | Description                                  |
|------------------|----------------------------------------------|
| ✅ Loose Coupling | Client code doesn't depend on concrete classes. |
| ✅ Extensibility  | Add new types without changing existing code. |
| ✅ Encapsulation  | Object creation logic stays hidden in one place. |
