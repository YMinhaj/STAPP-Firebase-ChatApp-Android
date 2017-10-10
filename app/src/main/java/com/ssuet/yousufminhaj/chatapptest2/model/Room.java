package com.ssuet.yousufminhaj.chatapptest2.model;

/**
 * Created by Yousuf Minhaj on 10/8/2017.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Room {
    public ArrayList<String> member;
    public Map<String, String> groupInfo;

    public Room(){
        member = new ArrayList<>();
        groupInfo = new HashMap<String, String>();
    }
}