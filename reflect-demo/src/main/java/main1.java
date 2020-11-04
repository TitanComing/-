/**
 * Create by peng on 2020/11/4.
 */
public class main1 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();

        Class c1 = Foo.class;
        Class c2 = foo1.getClass();

        System.out.println(c1 == c2);

        //Class c3 = null;
        //c3 = Class.forName("com.test.reflect.Foo");
        //System.out.println(c2 == c3);
        //true

        try {
            Foo foo = (Foo) c1.newInstance();
            foo.print("aaa");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(c1.getName() + " methods: ====================");
        for (int i = 0; i < c1.getMethods().length; i++) {
            System.out.println(c1.getMethods()[i].getName());
        }

        System.out.println(c1.getName() + " declaredMethods: ====================");
        for (int i = 0; i < c1.getDeclaredMethods().length; i++) {
            System.out.println(c1.getMethods()[i].getName() + " " + c1.getMethods()[i].getModifiers() + " " + c1.getMethods()[i].getReturnType());
        }

        System.out.println(c1.getName() + " fields: ====================");
        for (int j = 0; j < c1.getFields().length; j++) {
            System.out.println(c1.getFields()[j].getName());
        }

        System.out.println(c1.getName() + " declaredFields: ====================");
        for (int j = 0; j < c1.getDeclaredFields().length; j++) {
            System.out.println(c1.getDeclaredFields()[j].getName());
        }

        System.out.println(c1.getName() + " constructors: ====================");
        for (int k = 0; k < c1.getDeclaredConstructors().length; k++) {
            System.out.println(c1.getDeclaredConstructors()[k].getName() + " " + c1.getDeclaredConstructors()[k].getTypeParameters().toString());
        }

        try {
            c1.getMethod("print", String.class).invoke(c1.newInstance(), "lalala");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Foo {

    public Foo() {
    }

    public Foo(int field1, Boolean field4) {
        this.field1 = field1;
        this.field4 = field4;
    }

    private int field1;
    private double field2;
    private String field3;
    private Boolean field4;

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public double getField2() {
        return field2;
    }

    public void setField2(double field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public Boolean getField4() {
        return field4;
    }

    public void setField4(Boolean field4) {
        this.field4 = field4;
    }

    public void print(String arg) {
        System.out.println("I'm Foo" + arg);
    }
}
