package application;
import entities.Post;

import java.text.SimpleDateFormat;

import entities.Comment;
public class programa {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        Comment c1 = new Comment("BOA");
        Comment c2 = new Comment("NICE");
        Comment c3 = new Comment("LGL");
        Comment c4 = new Comment("OK");
        Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para o NZ", "Visitando esse pais manero", 12);
        post.addComment(c1);
        post.addComment(c2);
        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite", "VEjo vcs amanha",15);
        post2.addComment(c3);
        post2.addComment(c4);
        System.out.println(post.toString());
        System.out.println(post2.toString());

    }
}
