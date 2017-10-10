package com.ssuet.yousufminhaj.chatapptest2.model;

/**
 * Created by Yousuf Minhaj on 10/8/2017.
 */
public class Group extends Room{
    public String id;
    public ListFriend listFriend;

    public Group(){
        listFriend = new ListFriend();
    }
}