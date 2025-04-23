# Problem Set: Game Character Customization System

## Problem Scenario:
You are building a role-playing game (RPG) where users can create and customize game characters. There are several character classes like Warrior, Mage, Archer, and Rogue. Each of these classes has:

- A default set of weapons and armor
- Base stats (health, stamina, mana, strength, etc.)
- A unique set of skills and animations

Now, when a player wants to create a new character, they often want to start with a template (e.g., a base Mage) and then slightly tweak it — maybe change the name, adjust one or two stats, or change one starting skill.

Creating every new character from scratch would involve repeating a lot of initialization logic, making the system inefficient and error-prone.

## 💡 Why Use Prototype Here?
This is a great use case for the Prototype Pattern because:

- You can define prototype instances of each character class (e.g., magePrototype, warriorPrototype).
- When a user wants a new character, you clone the prototype and let them tweak it as needed.
- It makes the character creation process fast and memory-efficient, and allows for easy customization.
