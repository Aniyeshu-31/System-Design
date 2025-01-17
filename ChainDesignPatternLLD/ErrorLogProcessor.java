public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }
    public void log(int loglevel,String message) {
        if(loglevel == ERROR) {
            System.out.println("ERROR: "+message);
        }
        else{
           super.log(loglevel, message);
        }
    }
}
