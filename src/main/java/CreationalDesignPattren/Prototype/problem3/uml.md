            +-------------------+
            |   IPrototype      |  <<interface>>
            +-------------------+
            | +clone(): IPrototype |
            +-------------------+
                     ▲
                     |
    +----------------+------------------+
    |                                   |
+-------------------+        +----------------------+
|   GameCharacter   |        |    MageCharacter     |
+-------------------+        +----------------------+
| - name            |        | - specialSkill       |
| - health          |        | - mana               |
| - strength        |        |                      |
| - equipment      |        |                      |
+-------------------+        +----------------------+
| +clone(): IPrototype |      | +clone(): IPrototype  |
+-------------------+        +----------------------+

+------------------------+
|   CharacterRegistry    |
+------------------------+
| - prototypes: Map      |
+------------------------+
| +getPrototype(type): GameCharacter |
| +register(type, prototype)         |
+------------------------+

