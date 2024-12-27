package ObserverDesignPattern.ObservableInterface;
import java.util.*;

import ObserverDesignPattern.ObserverInterface.NotificationObserver;
public class IphoneObservable implements StockObservable{

    List<NotificationObserver> notlist = new ArrayList<>();
    int stockCount[];
    public IphoneObservable() {
        stockCount = new int[1];
        stockCount[0] = 0;
    }
    public void add(NotificationObserver newobj) {
        notlist.add(newobj);
    }
    public void remove(NotificationObserver newobj) {
        notlist.remove(newobj);
    }

    public void notifySubscribers() {
        for(NotificationObserver obj : notlist) {
            obj.update();
        }
    }

    public void setStockCount(int newStockAdded) {
         if(stockCount[0] == 0) {
             notifySubscribers();
         }
         stockCount[0] = stockCount[0] + newStockAdded;
    }
    public int getCount() {
        return stockCount[0];
    } 
    
}
