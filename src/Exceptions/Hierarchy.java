package Exceptions;

public class Hierarchy {
    public static void main(String[] args) {
        //Difference between Error and Exception
        //Let us discuss the most important part which is the differences between Error and Exception that is as follows:
        //
        //Error: An Error indicates a serious problem that a reasonable application should not try to catch.
        //Exception: Exception indicates conditions that a reasonable application might try to catch.

        //Exception Hierarchy
        //All exception and error types are subclasses of the class Throwable, which is the base class of the hierarchy.
        // One branch is headed by Exception. This class is used for exceptional conditions that user programs should catch.
        // NullPointerException is an example of such an exception. Another branch, Error is used by the Java run-time system(JVM) to indicate
        // errors having to do with the run-time environment itself(JRE). StackOverflowError is an example of such an error.
    }
}
