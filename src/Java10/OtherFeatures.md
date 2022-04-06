# Other features that are introduced in Java 10
## 1. Container Awareness
Before Java 10, Java applications can be run in Docker containers
using JVM. However, since JVM is not aware of the application is
running in a container, the Java applications will face performance
bottleneck after memory usage and CPU usage are set.
Now, JVMs are now aware of being run in a Docker container and will 
extract container-specific configuration instead of querying the
operating system itself – it applies to data like the number of 
CPUs and total memory that have been allocated to the container.

However, this support is only available for Linux-based platforms.

## 2. Root Certificates
In Java 10, a set of root CA(Certificated Authority) certificates 
incorporated into the OpenJDK source. Providing root CA certificates
makes Java more attractive to developers and to reduce the differences
between those builds and Oracle JDk builds.

## 3. Deprecations and Removals
Command javah has been removed from Java 10 which transferred Java 
implementations to C/C++ headers and source files which are required 
to implement native methods. In Java 10, javac -h can be used instead.

Policytool was the UI based tool for policy file creation and management. 
This has now been removed. The user can use simple text editor for 
performing this operation.

Removed java -Xprofoption. The option was used to profile the running 
program and send profiling data to standard output. The user should now 
use jmap tool instead.

Deprecated java.security.acl package has been marked forRemoval=true and
is subject to removal in a future version of Java SE. It's been replaced 
by java.security.Policy and related classes.
Similarly, java.security.{Certificate,Identity,IdentityScope,Signer} APIs 
are marked forRemoval=true.

## 4. Performance Improvements
The G1 garbage collector is the default one since JDK 9. However, the full GC
for G1 used a single threaded mark-sweep-compact algorithm. This has been 
changed to the parallel mark-sweep-compact algorithm in Java 10 effectively 
reducing the stop-the-world time during full GC.

## 5. Class Data Sharing
Class-Data Sharing, introduced in JDK 5, allows a set of classes to be
pre-processed into a shared archive file that can then be memory-mapped at 
runtime to reduce startup time which can also reduce dynamic memory footprint 
when multiple JVMs share the same archive file.

CDS only allowed the bootstrap class loader, limiting the feature to system 
classes only. Application CDS (AppCDS) extends CDS to allow the built-in system 
class loader (a.k.a., the “app class loader”), the built-in platform class 
loader, and custom class loaders to load archived classes. This makes it 
possible to use the feature for application classes. Java 10 introduces AppCDS,
now it is open sourced and made publicly available.
