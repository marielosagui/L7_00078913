package com.example.l7.database.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.l7.database.entities.GithubRepo


@Dao
interface GithubRepoDAO {

    @Query("SELECT * FROM repos") //repos es el nombre de la tabla creada que esta en GithubRepo
    fun getAllRespos():LiveData<List<GithubRepo>>

    @Query("DELETE FROM repos") // consulta que elimina
    fun nukeTable()

    @Insert (OnConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(repo: GithubRepo)  //suspende un thread hasta que termine; es un insert
}