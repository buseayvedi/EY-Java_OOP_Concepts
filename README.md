# JAVA-OOP Concepts

## Encapsulation (Data Hiding)

- What is Encapsulation?
    
    *Hiding the data by giving **private** access modifier*.
    
- How we perform encapsulation? (PIQ)
    
    *“private variables, public getter, public setter”*
    
    - Make all class fields ***private***
    - Create ***public setter*** method to write data
    - Create ***public getter*** method to read data
    - Example
        
        public class Car { // encapsulation
        
        ```
        private String color, model, make;
        private int year;
        
        public String getColor() {
        	return color;
        }
        public void setColor(String color) {
        	this.color = color;
        }
        ```
        
    - if we generate the constructor, do we need the setter method? Answer: if you want to make your class immutable then you can just have getter.
    
    ***Why we have both getter / setter?*** 
    
    - If we just want to get (read-only) or just want to change (write-only) data
        - We can provide ***only getter*** in a class to make the class attribute  ***(Read only)***
        - Read only example
            
            public class Car { // read-only example
            
            ```
            private String color, model, make;
            private int year;
            
            public Car(String color, String model, String make, int year) {
            	this.color = color;
            	this.model = model;
            	this.make = make;
            	this.year = year;
            }
            
            public String getColor() {
            	return color;
            }
            
            public String getModel() {
            	return model;
            }
            
            public String getMake() {
            	return make;
            }
            
            public int getYear() {
            	return year;
            }
            ```
            
        - We can provide ***only setter*** in a class to make the class attribute ***write-only.***

## Inheritance

- OOP inheritance builds ***Is A*** relationships between classes (super / sub relation)
    - *Efficiency*
    - *Less code, less duplication, less memory*
    - *Easy to manage*
- How we perform inheritance? (PIQ)
    - *One class inherits **the features (fields and methods)** of another class.*
    - ***Parent (**also called **Super or Base) Class:*** The class whose features are inherited is known as super class (or a base class or a parent class)
    - ***Child (**also called **Sub or Derived) Class:*** The class that inherits the other class is known as sub class (or derived class, or child class). *The subclass can add its own fields and methods in addition to the superclass fields and methods.*
    
    The keyword used for inheritance is
    
    ***extends***
    
- What can be inherited?
    - All ***public variables and methods***.
    - All ***protected*** variables and methods.
    - All ***default variables and methods*** can be inherited only if super class and sub class are ***in the same package***.
- What cannot be inherited?
    - ***Final*** class cannot be inherited, and it is immutable.
    - ***Private variables and methods cannot be inherited***. But it is ***accessible using public getter/setters***.
    - ***Constructors** cannot be inherited.*
- What are types of Inheritance?
    - ***Single Inheritance***: Subclasses inherit the features of one superclass.
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fdafe057-fd17-4873-8e90-007bfcf7413e/Untitled.png)
        
    - ***Multi-Level Inheritance:*** Subclass will be inheriting a SuperClass and as well as the subclass also act as the SuperClass to the other class.
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9669bad6-41fe-42cc-9530-905903096880/Untitled.png)
        
    - ***Hierarchical Inheritance:*** Once class serves as superclass for more than one sub class.
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/047aa866-cd79-4d07-9599-9e1ab6937196/Untitled.png)
        
    - ***Multiple Inheritance: Does JAVA support within classes? (PIQ)***
        - Java DOES NOT support multiple inheritance ***with classes***. One class cannot have more than one superclass. But it can implement more than one interface.
        
        ***java does not support multiple inheritance in case of class, but by using** interface **it can achieve multiple inheritance.***
        
- Superclass's Constructor
    - the ***superclass constructor always executes before the subclass constructor***.
    - The ***super()*** keyword refers to an object’s superclass.
    - If a subclass constructor does not explicitly call a superclass constructor, Java will automatically call the ***superclass’s default constructor, or no-arg constructor***, just before the code in the subclass’s constructor executes.
    - It needs to be the ***first statement*** in the child class constructor
    - ***this()*** also needs to be the first statement in the constructor, so ***super() and this() cannot be in the same constructor***
    - If parent class only has constructor with parameters, then child constructor MUST make a matching super(params) call.
- static member’s inheritance
    - Static members from a super class are inherited as long as ***access modifier allows***
    - Static variables are shared class variables, it will have ***single central value*** for all objects and sub classes.
    - Static methods, can be called either using ParentClass.methodName or SubClass.methodName
    - Example
    
    public static void main(String[] args) {
    Car.getYear();
    BMW.getYear();   }
    
- What is method overriding?
    - Sometimes a subclass inherits a method from its superclass, but the method is ***inadequate*** for the subclass’s purpose.
    - Because the *subclass is more specialized than the superclass*, it is sometimes necessary for the subclass to replace inadequate superclass methods with more suitable ones.
    
    This is known ***overriding***.
    
- Method Overriding Rules / Overriding Superclass Methods
    
    ***Overriding:** Declaring a method in subclass which is already present in the parent class.* Giving different implementations to the method.
    
    1. There must be ***is-a relationship*** (inheritance)
    2. The child method must have the ***same name*** as in the parent class
    3. The child method must have the ***same parameter*** as in the parent class
    4. ***Child Access modifier***: Needs to be ***same or more visible***
        1. public - > public
        2. protected - > protected, public
        3. default - > default, protected, public
    5. ***Return type***:
        - (primitive) must be same or
        - (object) covariant type (same class type or sub class type)
    - Only the instance method can be overridden
        
        (Static method cannot be overridden but can be hidden)
        
    - Private and final method cannot be overridden
    - Protected method can be overridden
- Overloading vs. Overriding
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cbbed677-9b45-4769-82c9-1e6c8e40eb3d/Untitled.png)
    
- super keyword in Java
    
    The super keyword in java is a reference variable that is used to refer parent class objects. The keyword ***“super”*** is used with the concept of inheritance.
    
    - Super with variables (super.variableName)
    - Super with methods (super.methodName)
    - Super with constructors (super() )
- Inheriting Static Variables & Methods
    
    We cannot override static methods or instance variables; we can hide them.
    
    - Hiding Variables
        - Variable hiding happens when we define a variable with the same name as a variable in a parent class.
        - This creates 2 copies of the variable within an instance of the child class: one instance defined for the parent reference, and another defined for the child reference.
        - If you are referencing the variable from within the parent class, the variable defined in the parent class is used.
        - If you are referencing the variable from within the child class, the variable defined in the child class is used.
    - Hiding Static Methods
        - We cannot *override static methods; we can hide them*.
        - A *hidden method occurs when a child class defines a static method with the same name and signature as a static method defined in a parent class*.
        - ***Method hiding is similar but not exactly the same as method overriding.***
        - The four rules for overriding a method must be followed when a method is hidden. In addition, a new rule is added for hiding a method, namely that the usage of the ***static keyword must be the same between parent and child classes*.**

## Final Keyword

- What is “final” keyword?
    
    “final” is a *non-access modifier* (specifier) which is applicable to a *variable, method, and class*.
    
    ***Final variable***     : creates constant variable
    
    ***Final method***     : prevent method overriding
    
    ***Final class***           : prevent inheritance and make the class immutable
    
- final variables
    
    Once it's initialized, its value is constant / unchangeable
    
    - How to initialize ***'local final variables'***?
        - if we don’t use it, initialization is not mandatory.
        - If we use it, it can be initialized either on the same line or on a different line just before using it
    - How to initialize ***'instance final variables'***?
        - initialization is mandatory
        - We can initialize instance final variables:
            - On the ***same line*** (same statement)
            - Inside a ***constructor***
            - Inside an ***instance (init) block*** *[init block : similar to static block. But init block only executes, when we create object and before constructor. If you don’t create an object, init block doesn’t run]*
        - ***Can we initialize a final instance variable on another line?***
            
            No, we cannot. It'll give a compile error.
            
        - ***Can we initialize a final instance variable inside a static block?***
            
            No, we cannot. Because static block cannot access to instance members
            
    - ***How to initialize 'static final variables'?***
        - initialization is mandatory
        - We can initialize static final variables:
            - On the ***same line***
            - Inside the ***static block***
        - ***Can we initialize a final static variable on another line?***
            
            No, we cannot. It'll give a compile error.
            
        - ***Can we initialize a final static variable inside a constructor or instance block?***
            - No, we cannot. Because:
                - A static final variable must be initialized, it cannot be blank
                - But constructors and instance blocks are never called if we don't create an object.
                - That means, if we don't create an object, this static final variable may not be initialized.
- final arrays and final arrayList
    - We ***can change the elements*** of a final array or final ArrayList without any problem
    - Arrays are objects and object variables are always references in Java. When we declare an object variable as final, it means that the variable cannot be changed to refer to anything else. THIS VARIABLE CAN NOT ***POINT/RE-ASSIGN ANY OTHER OBJECT***.
- final methods
    - When a method is declared with final keyword, it is called final method.
    - A final method ***can be overloaded*** but ***cannot be overridden***.
- final class
    - When a class is declared with final keyword, it is called a final class. A final class ***cannot be extended (inherited).***
    - ***You cannot make a class immutable without making it final. (String class)***

## Access Modifiers

- Summary Table for access modifiers
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b36c7a37-2cb1-40e9-bee9-c25e72744131/Untitled.png)
    

## Abstraction

- What is Abstraction?
    - Abstraction means we ***focus on the essentials rather than small details of the method** (hiding the implementations/details of the method).*
    - *Only focus on what it is (name of the action/behavior), instead of how it’s done.*
    - It concentrates on name of the action/behavior, without thinking about implementation
        - ***Focus on the essential***
        - Ignore the irrelevant
        - Ignore the unimportant
    - Abstraction helps with ***"organizing the code", "reusing the code", "less duplicate code",***
    - In Java, abstraction is achieved by ***abstract classes*** and ***interfaces***. We can achieve 100% abstraction using interfaces.
- Creating Abstract Classes
    - ***abstract*** keyword is used to create abstract classes
    - Goal is ***to provide reusable variables and methods to sub classes***
    - An ***abstract class cannot be instantiated***
        
        ***we cannot declare object using these classes, it is not concrete***
        
        public abstract class Browser{}
        Browser browser = new Browser(); //Error
        
    - ***Abstract class can have both abstract and instance method***
        
        Abstract class doesn’t have to contain only abstract methods.
        
    - ***If there is an abstract method in a class, that class must be also abstract***
    - ***an abstract class can be extended to another abstract class***
        
        *public abstract class A{}*
        
        *public abstract class B extends A{}*
        
    - *an abstract class can be extended to another non-abstract class.*
        
        *public class A{}*
        
        *public abstract class B extends A{}*
        
    - *Can a class extends multiple abstract classes?*
        - *No, it can not*
        
        *public abstract class A{}*
        
        *public abstract class B{}*
        
        *public class C extends A,B{} //Error*
        
        Can I do this with Interface? YES
        
    - *Can we add constructor in abstract class?*
        
        *Yes, we can.*
        
        - *If we cannot instantiate abstract class, how we can call the constructor?*
            
            *The constructor of abstract class can be called from a subclass using **super***
            
    - *Can we add static method into abstract class?*
        - *Yes, we can*
        
        *public abstract class A {*
        
        *public static void methodX (){*
        
        *}  }*
        
- Creating Abstract Methods
    - ***abstract*** keyword is used to create abstract method
    - Abstract method ***does not have body/implementation, only have signature***
    - ***An abstract method is meant to be overridden (can not be final, private, static)***
    - Can be ***only placed in abstract class or interface***
    - *Is it mandatory for abstract class to have abstract method?*
        
        No, it is not. Abstract class can have 0 abstract method.
        
    - Can abstract method be protected, private, and default?
        - private: no
        - default: yes
        - protected: yes
    - *Can a method be abstract and final in abstract class?*
        - *No, it can not*
        
        *public abstract class Browser {*
        
        *public abstract final void navigate(String url); //Error*
        
        *public abstract void displayWebpage(); }*
        
    - *Can a method be abstract and static in abstract class?*
        
        *No, it can not , Only instance method can be overridden*
        
- Creating Concrete Class
    - ***A sub class of abstract class is called concrete class (opposite of abstract class)***
    - ***A first concrete class must implement ( = override) all inherited abstract methods***
    - *Where do you add implementation?*
        - *Is added in first concrete class*
        - ***While adding implementation, all overriding rules should be followed**.*
    - *When an abstract class extends another abstract class, does it require to override/implement abstract methods from parent?*
        - *No, it does not require*
        - *First concrete sub class is required to implement all abstract methods*
- Extending Another Abstract Class
    - An abstract class can extend another abstract class. If so it is ***optional to implement abstract methods from abstract super class***.
    - A first concrete class must implement all inherited abstract methods.
- Abstract Class Rules Review
    - Abstract classes cannot be instantiated directly
    - Abstract classes may be defined with any number, including zero, of abstract and non-abstract methods
    - Abstract classes may not be marked as private or final
    - An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods
    - The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods
- Abstract Method Rules Review
    - Abstract methods may only be defined in abstract classes or interface
    - Abstract methods can not be declared private or final
    - Abstract methods must not provide a method body/implementation in the abstract class for which it is declared
    - Implementing an abstract method in a subclass follows the same rules for overriding a method
    - ***Variables cannot be abstract***
- Example 1
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7ff79901-ea7b-427c-8a4b-9fdb3ff36c8b/Untitled.png)
    
- Example 2
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2d5e558e-2361-4247-ad94-d4804570e283/Untitled.png)
    

## Interfaces

- What is interface?
    
    In many ways an interface is similar to an abstract class, but its intent is to specify common
    behavior for objects of **related classes or unrelated classes**.
    
    ***Not a class but a blueprint of a class, specifies the additional behaviors/features that the class needs to implement.***
    
    Inheritance forms “IS A” relationship between classes
    
    Implementing Interfaces forms “IS A KIND OF” relationship, less strong relationship
    
    - ***Contract between a class and outside world***
        
        Implementing an interface allows a class to become more formal about the behavior it promises to provide. Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. If your class implements an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.
        
    - ***Meant to be implemented.***
    - Provide *set of abstract methods (before java 8)*
    - Most interfaces have a group of related empty methods
    - The class provides the behaviors included in the interface
    - Interface Example
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a1139464-0d7a-4432-99a3-59af1f93000c/Untitled.png)
        
- ***Can have: (what?)***
    - ***Access modifiers: public***
    - ***Constant Variables: final, static***
    - ***Type of Methods: abstract, static, default***
    - S***tatic and default methods: sub-classes don’t have to implement default and static methods.***
- ***Can not have: (what?)***
    - ***Access modifiers: private, default, protected***
    - ***Instance variables & methods***
    - ***Final methods***
    - ***Constructor***
    - ***Blocks (static or instance)***
- ***Implicitly have:***
    - ***Fields (variables) : public, static, final***
    - ***All methods : public***
    - ***Except static and default methods : abstract***
    - Since all data fields are public static final and all methods are public abstract
    in an interface, Java allows these modifiers to be omitted. Therefore the following interface definitions are equivalent:
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/699f90d5-424e-4c07-8a39-0626108e5732/Untitled.png)
        
    
- Creating an Interface
    - An interface looks similar to a class, except the keyword ***interface*** is used instead of the keyword class
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/457b02b1-f50f-4d59-a91d-f68e1b76a116/Untitled.png)
        
- Implementing Multiple Interfaces
    - Class can ***extend*** only one superclass, but java allows a class to implement multiple interfaces.
    - When a class implements multiple interfaces, it must ***provide the methods specified by all of them (all methods have to be overridden.***
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/435a48b1-bdd4-4e93-9218-6c520fb64c44/Untitled.png)
    
- Fields in Interface
    - An interface can contain field declarations, but all fields in an interface are ***treated as public, static and final***.
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/88f7b881-3096-4564-845e-8dcf84ff9483/Untitled.png)
        
- Implementing Interface
    - When you want a class to implement an interface, you use the ***implements***
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/851782ac-f745-411e-8dfb-ee29bca1e1de/Untitled.png)
        
    - A class can ***extends another class and implements interface(s) same time***.
    - If a class both extend a class and implement an interface, extends should come first then implements keyword.
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/76132d5a-5236-4b95-97ca-a167830625af/Untitled.png)
        
- Default and Static Methods
    - *Beginning in Java 8*, interfaces can have *default* (different than access modifiers) and ***static***
    - Default and static methods have ***a body*** like a regular method.
    - How can I reach a static method inside an Interface? (className(interfaceName).staticMethod)
    - How can I reach default method inside Interface? (with the object referance)
- Abstract Class VS Interface
    
    Abstract classes and interfaces can both be used to specify common behavior of objects.
    
    - How do you decide whether to use an interface or a class?
        - In general, a strong is-a relationship that clearly describes a parent-child relationship should be modeled using abstract classes.
        - A weak is-a relationship, also known as an is-kind-of relationship, indicates that an object possesses a certain property. A weak is-a relationship can be modeled using interfaces.
    - Differences of both in a single table
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4bec36a0-6e08-4d45-b96e-80f908be48ad/Untitled.png)
        
    - Differences of both in a Verbal Manner
        - ***Abstract classes and Interfaces are used to achieve abstraction in Java***
        - ***We cannot instantiate abstract classes and interfaces***
        - We use abstract classes for setting foundation for sub classes. It is normally a general idea
        - Interfaces are used to add a feature to classes by providing abstract methods
        - Class can ***extends*** ONE abstract class
        - Class can ***implement*** MULTIPLE interfaces

## Polymorphism

- What is polymorphism?
    
    Polymorphism is the ***ability of the object to take on many forms. (behaviors of the objects in different/many forms)***
    
    I like this meaning more: “**Polymorphism means that a variable of a supertype can refer to a subtype object.”**
    
    DataType variableName = Value;
    
    superType variableName/objectName = new childClass(); -subTypeObject
    
- How to achieve polymorphism?
    - ***IS A relationship (or is a kind of relationship) is required***
    - *reference type is a parent class/interface and object type is child.*
    - Reference type ***decides what can be accessible***. Object type decides to use most specific one.
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e2e0866b-d3d5-4402-99e8-83b1d8b471f4/Untitled.png)
        
- How do we use polymorphism in Automation?
    
    *WebDriverManager.chromedriver().setup();* 
    
    *WebDriver  driver = new ChromeDriver();*
    
    - Pros:
        - Less method, less memory.
    
    Defining driver object as WebDriver and test cross-browser easily
    
- The problem?
    
    Reference type decides just which methods the instance can use. But instance side uses own class method versions. So if Derived class had another method which parent class **doesn't have**, Derived would not be able to use or reach it.
    
- Casting
    - Primitive-type castings
        - Implicit casting: casting the smaller primitive type to larger primitive type (automatically done)
            - double d = (double) 10; // automatically done
        - Explicit casting: casting the larger primitive type to smaller primitive type (manually done)
            - double d = 2.5;
            - short s = (short) d;
    - Reference-type castings
        - Up-casting: casting the smaller reference-type to larger reference type (automatically done)
            - WebDriver driver = new ChromeDriver();
            - WebDriver driver = (WebDriver) new ChromeDriver(); // up-casting
            - Shape cube = new Cube(5);
        - Down-casting: : casting the larger reference-type to smaller reference-type (manually done).
            - We need the down-casting only if we need to call a method or variable that’s in the object type but not in the reference type.
            - ***To reach methods of child***, p*arent decides the methods. We* don’t lose data.
        - Animal example
            - Animal animal = new Dog(); // up-casting
            - // animal.bark; // error referenceType Animal does not have bark()
            - ((Dog) animal).bark //down-casting *() prioritizes the casting*
        - WebDriver Example from automation
            - Verbally
                - WebDriver driver = new ChromeDriver();
                - ((ChromeDriver) driver).takeScreenShot();
                - ((ChromeDriver) driver).executeScript();
                - ((TakesScreenshot) driver).takeScreenShot();
                - ((JavaScriptExecutor) driver).executeScript();
            - In a picture, class relations of WebDriver objects
                
                ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aba0c00d-1096-4140-9303-53ace0318a11/Untitled.png)
                
- Dynamic Binding
    
    A method can be implemented in several classes along the inheritance chain. The JVM
    decides which method is invoked at runtime.
    
    - the JVM searches for the implementation of the method in C1, C2, . . . , Cn-1, and Cn, in this order, until it is found. Once an implementation is found, the search stops and the first-found implementation is invoked.
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/71401fa7-6af7-43dc-adc9-10e3c452c6a4/Untitled.png)
        
    - Types of Polymorphism picture 1
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1222b808-4ba4-469f-94c6-3e7e4c50cd66/Untitled.png)
        
    - Types of Polymorphism picture 2
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b718520c-60ae-4f06-b596-973fe92ef9fe/Untitled.png)
