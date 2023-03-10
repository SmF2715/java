public class CountThread implements java.lang.Runnable {

    CommonResource res;
    CountThread(CommonResource res){
        this.res=res;
    }

    public void run() {
        res.increment();
    }
}