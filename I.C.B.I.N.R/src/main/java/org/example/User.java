package org.example;

import java.util.ArrayList;

public class User
{
    public int ID;
    public String Username;
    public String PassWord;
    public int Karma;
    public ArrayList<int[]> UserPostsID= new ArrayList<int[]>();
    public ArrayList<int[]> UserSubsInID= new ArrayList<int[]>();
    public ArrayList<int[]> UserSubsOwnedID= new ArrayList<int[]>();
    public ArrayList<int[]> UserCommentsID= new ArrayList<int[]>();

    public User()
    {

    }

}
