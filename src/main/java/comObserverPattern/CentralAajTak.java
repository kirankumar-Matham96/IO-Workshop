package comObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Ajtak news manager(adds new users, removes users, updates the news)
 */
public class CentralAajTak {
    List<Observers> observersList = new ArrayList<>();

    /**
     * method to register different users/classes
     *
     * @param observer
     * @return
     */
    public void register(Observers observer) {
        long startNs = System.nanoTime();//start time

        /**
         * Adding to the list to keep all the users together
         * so that we can update all together with the news
         */
        observersList.add(observer);

        long endNs = System.nanoTime();//end time
        long executionTimeInNs = endNs - startNs;//time of execution
        System.out.println("executed in: " + executionTimeInNs + " nsec");
    }

    /**
     * method to unregister existing users/classes
     *
     * @param observer
     */
    public void unRegister(Observers observer) {

        /**
         * Removing user/class from list
         * so that the unregistered user can not get any updates
         */
        observersList.remove(observer);
    }

    /**
     * method to update news for all types/users/classes
     *
     * @param news
     */
    public void update(News news) {

        /**
         * updating every registered user with news
         */
        for (Observers observer : observersList)
            if (observer.getNewsType() == news.newsType) {
                observer.onUpdate(news);
            }
    }
}

