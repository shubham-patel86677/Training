//Task 3: Packages/Classpath

//Create a package com.math.operations and include classes for various arithmetic operations. Demonstrate how to compile and run these using the classpath.

package com.math.operations;

public class Addition {
    public static int add(int a, int b) {
        return a + b;
    }
}
package com.math.operations;

public class Subtraction {
    public static int subtract(int a, int b) {
        return a - b;
    }
}
package com.math.operations;

public class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
}
package com.math.operations;

public class Division {
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}

