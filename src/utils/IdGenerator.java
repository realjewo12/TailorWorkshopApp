//package utils;
//
//import java.util.UUID;
//
//public class IdGenerator {
//    public static String generateId() {
//        return UUID.randomUUID().toString();// return a random crypted id like f786b5fa-812c-4ec5-9ff4-978efd4fc1b2

//    }
//}
package utils;

public class IdGenerator {
    private static int currentId = 25041;

    // Generates a unique positive integer ID
    public static int generateId() {
        return currentId++;
    }
}
