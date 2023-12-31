package com.tasks.microblogging.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tasks.microblogging.data.local.dao.AuthorDao
import com.tasks.microblogging.data.local.entity.AuthorEntity

@Database(entities = [AuthorEntity::class], version = 1, exportSchema = false)
abstract class AuthorsDatabase : RoomDatabase() {
    companion object {
        val DATABASE_NAME: String = "AuthorsDataBase"
    }

    abstract fun AuthorDao(): AuthorDao
}