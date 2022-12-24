public class StopWatch {
    long start;
    long stop;
    public StopWatch(){
        start=stop=0;
    }
    public long Elapse(){
        return stop-start;
    }
    public void Start(){
        start=System.nanoTime();
    }
    public void Stop(){
        stop=System.nanoTime();
    }
}
