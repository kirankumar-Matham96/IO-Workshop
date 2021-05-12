package comObserverPattern;

import comObserverPattern.News.NewsType;

public class MainClass {

    public static void main(String[] args) {

        /**
         * -> creating object for Assam
         * -> passing news
         * -> setting the type for the news
         */
        News assamNews = new News();
        assamNews.news = "HII Assam";
        assamNews.newsType = NewsType.ASSAM;

        /**
         * -> creating object for Biz
         * -> passing new
         * -> setting news type
         */
        News bizNews = new News();
        bizNews.news = "HEY Biz";
        bizNews.newsType = NewsType.BIZ;

        /**
         * -> creating object for Delhi
         * -> passing news
         * -> setting news type
         */
        News delhiNews = new News();
        delhiNews.news = "HELLO Delhi";
        delhiNews.newsType = NewsType.DELHI;

        /**
         * Creating another object for testing unRegister method:
         * -> creating new object for Delhi
         * -> passing news
         * -> setting news type
         */
        News delhiNews1 = new News();
        delhiNews1.news = "Delhi 1";
        delhiNews1.newsType = NewsType.DELHI;

        /**
         * creating objects for different classes
         */
        AssamAajTak assamObserver = new AssamAajTak();
        BizAajTak bizObserver = new BizAajTak();
        DelhiAajTak delhiObserver = new DelhiAajTak();
        CentralAajTak subject = new CentralAajTak();

        /**
         * registering users/classes
         */
        subject.register(assamObserver);
        subject.register(bizObserver);
        subject.register(delhiObserver);

        /**
         * updating users/classes with news
         */
        System.out.println("\nAfter registered!");
        subject.update(assamNews);
        subject.update(bizNews);
        subject.update(delhiNews);
        subject.update(delhiNews1);

        /**
         * unregistering Delhi
         */
        subject.unRegister(delhiObserver);

        /**
         * checking if the update works after unregistering
         */
        System.out.println("\nAfter Delhi unregistered!");
        subject.update(delhiNews);//unregistered
        subject.update(assamNews);
        subject.update(bizNews);
        subject.update(delhiNews1);//unregistered
    }
}
