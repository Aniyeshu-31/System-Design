package ObserverDesignPattern;
import ObserverDesignPattern.ObservableInterface.IphoneObservable;
import ObserverDesignPattern.ObservableInterface.StockObservable;
import ObserverDesignPattern.ObserverInterface.EmailNotificationObserver;
import ObserverDesignPattern.ObserverInterface.MobileNotifcationObserver;
import ObserverDesignPattern.ObserverInterface.NotificationObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable IphoneStockObservable = new IphoneObservable();
        NotificationObserver ob1 = new EmailNotificationObserver("xyz@gmail.com" , IphoneStockObservable,0);
        NotificationObserver ob2 = new EmailNotificationObserver("xyz2@gmail.com" , IphoneStockObservable,0);
        NotificationObserver ob3 = new MobileNotifcationObserver("xyz3" , IphoneStockObservable,0);
        
        IphoneStockObservable.add(ob1);
        IphoneStockObservable.add(ob2);
        IphoneStockObservable.add(ob3);

        IphoneStockObservable.setStockCount(10);
        IphoneStockObservable.setStockCount(10);
        IphoneStockObservable.setStockCount(10);
        IphoneStockObservable.setStockCount(10);
        System.out.println(IphoneStockObservable.getCount());
    }
}
