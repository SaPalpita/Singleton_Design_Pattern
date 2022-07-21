public class Application extends ClassicSingletonSolution{
    public static void main(String[] args) {
        ClassicSingletonSolution c=new ClassicSingletonSolution();
        c.setSyncObject(c);
        ClassicSingletonSolution classicSingletonSolution=ClassicSingletonSolution.getInstance();

        classicSingletonSolution.getData();
    }
}
