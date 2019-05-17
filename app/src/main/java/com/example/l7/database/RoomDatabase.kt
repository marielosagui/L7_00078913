package com.example.l7.database
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.l7.database.entities.GithubRepo
import java.security.AccessControlContext


@Database(entities = [GithubRepo::class],version = 1,exportSchema = false)
public abstract class RoomDatabase : RoomDatabase(){
    abstract fun repoDao():GithubRepo
    companion object {
        @Volatile
        private var INSTANCE: RoomDatabase? =null

        fun getInstance(Appcontext:Context):RoomDatabase{
            val temp = INSTANCE

            if(temp !=null){
                return temp
            }
            synchronized(this){
                val instance = Room.databaseBuilder(Appcontext,RoomDatabase::class.java,"RepoDB")
                    .build()

                INSTANCE =instance
                return instance
            }
        }

    }

}