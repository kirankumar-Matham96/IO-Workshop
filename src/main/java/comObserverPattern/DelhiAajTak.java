package comObserverPattern;

import comObserverPattern.News.NewsType;

/**
 * user class for Ajtak news
 */
public class DelhiAajTak implements Observers {

    /**
     * to show the updated news
     *
     * @param news
     */
    public void onUpdate(News news) {
        System.out.println("News Received by Delhi : " + news.news);
    }

    /**
     * to get the type of news
     *
     * @return
     */
    public News.NewsType getNewsType() {
        return NewsType.DELHI;
    }
}

