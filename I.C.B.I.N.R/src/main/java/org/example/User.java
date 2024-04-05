package org.example;

import java.util.ArrayList;

public class User
{
    int ID;
    String Username;
    String PassWord;
    int Karma;
    ArrayList<Post> UserPosts= new ArrayList<Post>();
    ArrayList<Sub> UserSubsIn= new ArrayList<Sub>();
    ArrayList<Sub> UserSubsOwned= new ArrayList<Sub>();
    ArrayList<Comment> UserComments= new ArrayList<Comment>();

}
