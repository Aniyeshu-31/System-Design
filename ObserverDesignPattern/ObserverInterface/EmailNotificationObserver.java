package ObserverDesignPattern.ObserverInterface;

import ObserverDesignPattern.ObservableInterface.IphoneObservable;
import ObserverDesignPattern.ObservableInterface.StockObservable;

public class EmailNotificationObserver implements NotificationObserver {
   
     StockObservable obj;
     String emailId;
     int cnt ;
    public EmailNotificationObserver(String emailId,StockObservable obj,int cnt) {
        this.emailId = emailId;
        this.obj = obj;
        this.cnt = cnt;
      }

     public void update() {
        SendEmailMsg(emailId,"Product is the Stock HurryUp",cnt);
     }

     public void SendEmailMsg(String emailId,String message,int cnt) {
        System.out.println("Msg sent on Email: " + emailId+"  "+(cnt+1));
     }

}
