package com.crakama.refugee.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.crakama.refugee.Message;

/**
 * Created by cate.rakama@gmail.com on 9/15/2016.
 */
public class DB {
    int id;
    String name, email, username, pass;

    public void setId(int id){
        this.id = id;

    }
    public int getId(){
        return this.id;
    }

    public void setEmail(String email){
        this.email = email;

    }
    public String getEmail(){
        return this.email;
    }

    public void setUsername(String username){
        this.username = username;

    }
    public String getUsername(){
        return this.username;
    }

    public void setPass(String pass){
        this.pass = pass;

    }
    public String getPass(){
        return this.pass;
    }
}