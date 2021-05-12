package comObserverPattern;

public class News {

    public String news;
    NewsType newsType;

    /**
     * types of news that will be assigned to different users
     */
    enum NewsType {
        DELHI, BIZ, ASSAM
    }
}
