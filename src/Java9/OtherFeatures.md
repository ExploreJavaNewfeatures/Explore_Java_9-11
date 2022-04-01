# Other features that are introduced in Java 9
## 1. JShell
JShell is an interactive command line tool in JDK9. One reason why JShell was proposed for Java 9 
is the lack of a standard interactive environment for the language.JShell is a Read-Evaluate-Print 
Loop (REPL), which evaluates declarations, statements, and expressions as they are entered and 
immediately shows the results. It allows:
- Simple calculations by Java syntax
- Write and compile a complete Java program
- reuse Java functions that are defined previously

In all, it is a fun tool to learn and interact with Java.

## 2. Module
In one project, we can have several modules, each module has separate source directory. 
Accessibility before Java9: public, protected, package, private, four categories. Since Java9, we
have five accessibilities: public to everyone, public but only to friend modules, public only within
a module, protected, package, private. To run a modudle, we can use

`java -p mods -m hello.world`

Where mods is the directory of the module, hello.world is the module itself.

## 3. Multi Resolution Image
In Java9, we can use `getResolutionVariant(double destImageWidth, double destImageHeight)` to generate 
an image with specific resolution.

## 4. CompletableFuture Class
In Java5, future class represents a future result of an asynchronous computation, which is a result
that will eventually appear in the future after the processing is complete. However, it cannot be 
completed manually, and the Future cannot be chained or combined, and there is no Exception handling.
In Java8, the CompletableFuture class solves the above problems. The CompletableFuture class suggests 
that the result will be returned in the future, meanwhile, the user can manually get the result, 
trigger blocking to the current thread. Besides, CompleteFuture can use callback function to get result.

## 5. Multi-version JAR
Because Java is constantly evolving and adding new features to JDK, 

`javac --release 8 -d classes-8 src/Java9/OptionalOr.java`
