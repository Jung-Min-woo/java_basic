class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();
    }    
}
class ThreadEx3_1 extends Thread{
    public void run() {
            throwException();
    }
    public void throwException() {
            try {
                throw new Exception();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
    }
}

// java.lang.Exception
//         at ThreadEx3_1.throwException(ThreadEx3.java:13)
//         at ThreadEx3_1.run(ThreadEx3.java:9)
//         at ThreadEx3.main(ThreadEx3.java:4)