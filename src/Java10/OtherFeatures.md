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
