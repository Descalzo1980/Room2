package ru.stas.room.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface BookDao {

    @Insert
    suspend fun insertBook(book: Book)

    @Query("SELECT * FROM books_table")
    fun getAllBooks(): List<Book>

    @Update
    suspend fun updateBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)
}