# 🧩 Problem Statement: Global Logger in a Distributed Application

You are developing a distributed enterprise-level application that runs on multiple threads and modules. Each module needs to log activities, errors, and system events for debugging and monitoring purposes.

The logging system should:

- Write all logs to a single log file or output stream.
- Be globally accessible from anywhere in the application.
- Avoid creating multiple instances of the logger to prevent race conditions, file corruption, or inconsistent log formatting.
- Ensure thread safety and high performance under concurrent access.

## 💡 Why Singleton?
Creating multiple logger instances across different modules would:

- Lead to file access conflicts
- Break consistency in log formats or timestamps
- Waste resources

So, you need to ensure that:

- Only one instance of the logger exists across the entire app.
- All parts of the app use the same logger instance.
- The logger is thread-safe and lazy-initialized only when needed.



# 🧱 Steps to Implement Singleton Pattern

✅ 1. **Make the Constructor Private**
- This ensures that the class cannot be instantiated from outside.
- Prevents multiple instances from being created.
- 🛠️ **Why?** So no external class can call `new Logger()`.

✅ 2. **Create a Private Static Instance Field**
- This holds the single object of the class.
- Typically `static Logger instance;`
- 🛠️ **Why?** So the instance is shared across all access points.

✅ 3. **Provide a public Static Accessor Method**
- A method like `getInstance()` to return the singleton object.
- Inside, check if the instance already exists; if not, create it.
   ```java
   public static Logger getInstance() {
       if (instance == null) {
           instance = new Logger();
       }
       return instance;
   }
