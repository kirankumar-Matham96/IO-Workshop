package comObserverPattern;

import comObserverPattern.News.NewsType;

/**
 * interface to keep all the users unique to the Ajtak news
 * and to provide security
 */
public interface Observers {
    void onUpdate(News data);

    NewsType getNewsType();
}
