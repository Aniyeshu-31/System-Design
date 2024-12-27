package ObserverDesignPattern.ObserverInterface;

import ObserverDesignPattern.ObservableInterface.StockObservable;

public class MobileNotifcationObserver implements NotificationObserver {
    
    StockObservable obj;
    String UserName;
    int cnt;

    public MobileNotifcationObserver(String UserName , StockObservable obj,int cnt) {
        this.UserName = UserName;
        this.obj = obj;
        this.cnt = cnt;
    }

    public void update() {
        sendMsgOnMobile(UserName , "Product is in the Stock HurryUp",cnt);
    }
    public void sendMsgOnMobile(String UserName,String msg,int cnt) {
        System.out.println("Msg sent on Mobile : "+UserName+"  "+(cnt+1));
    }
}
