package comObserverPattern;

import comObserverPattern.News.NewsType;

/**
 * user class for Ajtak news
 */
public class BizAajTak implements Observers {

    /**
     * to show the updated news
     *
     * @param news
     */
    public void onUpdate(News news) {
        System.out.println("News Received by Biz : " + news.news);
    }

    /**
     * to get the type of news
     *
     * @return
     */
    public NewsType getNewsType() {
        return NewsType.BIZ;
    }
}

