public class UrlFixer {



    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");





        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        //https://www.reddit.com/r/nevertellmetheodds/

        System.out.println(url);
        System.out.println(url.substring(0, 5) + ":" + url.substring(5));
    }
}
