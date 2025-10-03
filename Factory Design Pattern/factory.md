# Factory Design Pattern

The Factory Design Pattern is a Creational Design Pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

#### 1. It provides a centralized place for object creation.

#### 2. Makes the system extensible (new classes can be added easily).

#### 3. Removes tight coupling between client code and concrete classes.

#### 4. Promotes Reusability & Maintainability.


In simpler terms:

👉 Instead of creating objects directly using the new keyword in your code, you delegate that responsibility to a Factory class.

👉 This makes your code loosely coupled, flexible, and easier to extend when adding new types of objects.In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
