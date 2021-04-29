import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("21/06/2021 13:05:44"), "Traveling to New Zealand",
                "I'm going to visit this amazing country", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");

        Post p2 = new Post(sdf.parse("28/07/2021 23:14:44"), "Good night guys", "See you tomorrow", 40);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p2);

        Comment c5 = new Comment("Happy birthday");
        Comment c6 = new Comment("Happy bithday darling!");

        Post p3 = new Post(sdf.parse("03/11/2021 10:55:03"), "It's my bithday!!!",
                "I can't believe another year have passed", 23);

        p3.addComment(c5);
        p3.addComment(c6);

        System.out.println(p3);

    }
}