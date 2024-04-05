package org.example;

import java.util.ArrayList;

public class User
{
    int ID;
    String Username;
    String PassWord;
    int Karma;
    ArrayList<int[]> UserPostsID= new ArrayList<int[]>();
    ArrayList<int[]> UserSubsInID= new ArrayList<int[]>();
    ArrayList<int[]> UserSubsOwnedID= new ArrayList<int[]>();
    ArrayList<int[]> UserCommentsID= new ArrayList<int[]>();

}
