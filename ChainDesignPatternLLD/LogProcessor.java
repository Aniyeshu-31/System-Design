public class LogProcessor {
    protected static int INFO = 1;
    protected static int DEBUG = 2;
    protected static int ERROR = 3;
    
    LogProcessor nextLoggerProcessor;

    public LogProcessor(LogProcessor LoggerProcessor) {
         this.nextLoggerProcessor = LoggerProcessor;
    }

    public void log(int loglevel,String message) {
        if(nextLoggerProcessor != null){
             nextLoggerProcessor.log(loglevel, message);
        }
    }
}