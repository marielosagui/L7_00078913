package com.example.l7.database
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.l7.database.entities.GithubRepo



@Database(entities = [GithubRepo::class],version = 1,exportSchema = false)
public abstract class RoomDatabase : RoomDatabase(){
    companion object {

    }

}