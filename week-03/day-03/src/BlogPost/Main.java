package BlogPost;

public class Main {
    public static void main(String[] args) {
        Blogpost newPost1 = new Blogpost();

        newPost1.authorName = "John Doe";
        newPost1.publicationDate = "2000.05.04";
        newPost1.text = "Lorem ipsum dolor sit amet.";
        newPost1.title = "Lorem Ipsum";

        Blogpost newPost2 = new Blogpost();

        newPost2.authorName = "Tim Urban";
        newPost2.publicationDate = "2010.10.10.";
        newPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        newPost2.title = "Wait but why";

        Blogpost newPost3 = new Blogpost();

        newPost3.authorName = "William Turton";
        newPost3.publicationDate = "2017.03.28.";
        newPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        newPost3.title = "Wait but why";
    }
}
