package org.example;

import java.util.ArrayList;

public class CMM
{
    public ArrayList<User> Users;
    public ArrayList<Sub> Subs;
    public ArrayList<Post> Posts;
    public ArrayList<Comment> Comments;
    public User LoggedIn;

    public CMM()
    {
        Users = new ArrayList<User>();
        Subs = new ArrayList<Sub>();
        Posts = new ArrayList<Post>();
        Comments = new ArrayList<Comment>();
        LoggedIn = new User();
    }
}
