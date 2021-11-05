public class ClassLoaderChecker {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader m = new MyClassLoader("D:\\project\\Java\\study-pattern\\src\\main\\java\\", "MyClassLoader");
        Class c = m.findClass("A.class");
        c.newInstance();
    }
}
