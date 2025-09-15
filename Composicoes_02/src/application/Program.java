package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("WOOOOOOOOOW");
		Post p1 = new Post(sfd.parse("21/06/2018 13:05:44"), "TRAveling to new Zealdn",
				"I goisn to visit this waonderfal", 12);

		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);

	}

}
