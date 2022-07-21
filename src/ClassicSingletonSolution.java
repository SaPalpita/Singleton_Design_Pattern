public class ClassicSingletonSolution {
       private static ClassicSingletonSolution instance=null;

        private static Object syncObject;

    protected ClassicSingletonSolution(){ };

        public static ClassicSingletonSolution getInstance(){
            synchronized(syncObject){
                if(instance==null) instance=new ClassicSingletonSolution();
    }
        return instance;
    }

        public void getData(){
        System.out.println("Hello");
    }

    public static void setSyncObject(Object syncObject) {
        ClassicSingletonSolution.syncObject = syncObject;
    }
}

