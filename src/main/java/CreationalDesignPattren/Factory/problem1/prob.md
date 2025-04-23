# Factory Design Pattern

## Real-World Analogy: Car Manufacturing Factory

Imagine you walk into a car factory and say:

"I want a Sedan."

- **You (the client) ask for a type of product**
- **The factory hides the construction logic**
- **You get an object (car) based on input (type)**

If someone else asks for an SUV, the same factory gives them that.

## Theory Recap (in Real-World Terms)

| **Pattern Role**       | **Real-World Equivalent** |
|------------------------|---------------------------|
| Product Interface      | Car (base model blueprint)|
| Concrete Product       | Sedan, SUV, Hatchback     |
| Creator/Factory        | Car Factory (decides what model to make) |
| Client                 | Customer (asks for a car, doesn’t care how) |

## Another Example: Notification System

Imagine an app that sends notifications to users. It can send via:

- Email
- SMS
- Push Notification

Rather than writing messy if-else blocks in multiple places to decide which notification type to use, you use a `NotificationFactory` to return the right object:

```java
Notification notification = NotificationFactory.create("EMAIL");
notification.send();
