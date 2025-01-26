class MySystem {  // Renamed to avoid conflict with java.lang.System
    static PrintStream out = new PrintStream();
}

class PrintStream {
    public void println(String s) {
        java.lang.System.out.println(s); // Use the built-in System.out
    }
}

class Main {
    public static void main(String[] args) {
        MySystem.out.println("xyz");  // Access the PrintStream object in MySystem
    }
}
