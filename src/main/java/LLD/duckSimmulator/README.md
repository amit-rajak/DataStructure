here mandatory things 

1 | Pattern         | When                                     |
| --------------- | ---------------------------------------- |
| Strategy        | Multiple interchangeable behaviors       |
| State           | Behavior changes based on internal state |
| Template Method | Algorithm fixed, steps vary              |
| Factory         | Object creation                          |
| Command         | Encapsulate request                      |




Final Takeaway

✅ Strategy = interchangeable behavior
✅ Composition = flexibility
✅ Inheritance = use carefully
✅ Used heavily in real backend systems


How to Explain in Interview (Perfect Answer)

“Whenever I see multiple interchangeable behaviors that may evolve independently,
I avoid inheritance and use Strategy Pattern with composition. 
This gives runtime flexibility, better maintainability, and follows Open/Closed Principle. I’ve used this in payment processing, notification services, and pricing engines.”


| Inheritance           | Composition        |
| --------------------- | ------------------ |
| IS-A relationship     | HAS-A relationship |
| Compile-time binding  | Runtime binding    |
| Rigid                 | Flexible           |
| Hard to change        | Easy to swap       |
| Code duplication risk | Reusable behaviors |
