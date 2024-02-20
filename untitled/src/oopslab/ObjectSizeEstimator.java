package oopslab;

public class ObjectSizeEstimator {
    public static void main(String[] args) {
        // Create an instance of the object whose size we want to estimate
        ObjectToMeasure obj = new ObjectToMeasure();

        // Estimate the size of the object
        long size = estimateObjectSize(obj);

        System.out.println("Estimated size of the object: " + size + " bytes");
    }

    public static long estimateObjectSize(Object obj) {
        // Estimate the size of the object by considering the sizes of its fields
        // This is a basic example and may not be accurate in all cases
        // You may need to consider object header size, alignment, etc.
        long size = 0;

        // For demonstration, let's assume the object has two integer fields
        size += Integer.BYTES; // Size of the first integer field
        size += Integer.BYTES; // Size of the second integer field

        return size;
    }

    // Define a sample class to measure its size
    static class ObjectToMeasure {

    }
}
