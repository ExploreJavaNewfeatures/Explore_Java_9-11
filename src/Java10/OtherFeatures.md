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
