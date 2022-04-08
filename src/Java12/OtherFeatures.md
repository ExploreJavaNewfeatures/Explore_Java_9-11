# Other new features in java 12 update
## 1. Shenandoah: A Low-Pause-Time Garbage Collector
Shenandoah is an experimental garbage collection (GC) algorithm, for now not included in the default Java 12 builds.

It reduces the GC pause times by doing evacuation work simultaneously with the running Java threads. This means that with Shenandoah, pause times are not dependent on the heap’s size and should be consistent. Garbage collecting a 200 GB heap or a 2 GB heap should have a similar low pause behavior.

Shenandoah will become part of mainline JDK builds since version 15.

## 2. Microbenchmark Suite
Java 12 introduces a suite of around 100 microbenchmark tests to the JDK source code.
It based on Java Microbenchmark Harness(JMH) and support JMH update.

These tests will allow for continuous performance testing on a JVM and will become useful for every developer wishing to work on the JVM itself or create a new microbenchmark.

## 3.Default CDS Archives (CDS will be covered in next few vesion)
The Class Data Sharing (CDS) feature helps reduce the startup time and memory footprint between multiple Java Virtual Machines. It uses a built-time generated default class list that contains the selected core library classes.

The change that came with Java 12 is that the CDS archive is enabled by default. To run programs with CDS turned off we need to set the Xshare flag to off:
> java -Xshare:off HelloWorld.java

Note, that this could delay the startup time of the program.
