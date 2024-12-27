package ObserverDesignPattern.ObservableInterface;

import ObserverDesignPattern.ObserverInterface.NotificationObserver;

public interface StockObservable {
     public void add(NotificationObserver obj);
     public void remove(NotificationObserver obj);
     public void notifySubscribers();
     public void setStockCount(int newStockAdded);
     public int getCount();

}
