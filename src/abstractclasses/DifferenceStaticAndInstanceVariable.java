package abstractclasses;

public class DifferenceStaticAndInstanceVariable {

    // static variable
    static int staticVar = 0;

    // instance variable
    int instanceVar;

    public DifferenceStaticAndInstanceVariable(int var) {
        this.instanceVar = var;
    }

    public static void main(String[] args) {
        DifferenceStaticAndInstanceVariable obj1 = new DifferenceStaticAndInstanceVariable(5);
        DifferenceStaticAndInstanceVariable obj2 = new DifferenceStaticAndInstanceVariable(10);

        // accessing static variable
        System.out.println("Static variable value: " + DifferenceStaticAndInstanceVariable.staticVar);

        // accessing instance variable
        System.out.println("Instance variable value for obj1: " + obj1.instanceVar);
        System.out.println("Instance variable value for obj2: " + obj2.instanceVar);

        // changing the value of static variable
        DifferenceStaticAndInstanceVariable.staticVar = 1;

        // changing the value of instance variable for obj1
        obj1.instanceVar = 6;

        // accessing the changed values
        System.out.println("Static variable value: " + DifferenceStaticAndInstanceVariable.staticVar);
        System.out.println("Instance variable value for obj1: " + obj1.instanceVar);
        System.out.println("Instance variable value for obj2: " + obj2.instanceVar);
    }
}
