public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }
    public void log(int loglevel,String message) {
        if(loglevel == DEBUG) {
            System.out.println("ERROR: "+message);
        }
        else{
           super.log(loglevel, message);
        }
    }
}
