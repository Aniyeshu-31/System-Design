public class Info {
    public static void main(String[] args) {
        LogProcessor obj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        
        obj.log(LogProcessor.ERROR,"Exception Happens");
        obj.log(LogProcessor.DEBUG,"need to Debug this");
        obj.log(LogProcessor.INFO,"just for Info");
        
    }
}
