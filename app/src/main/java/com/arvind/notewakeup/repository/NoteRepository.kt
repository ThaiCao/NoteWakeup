package com.arvind.notewakeup.repository


import com.arvind.notewakeup.model.NoteModel
import com.arvind.notewakeup.storage.db.NoteDatabase
import javax.inject.Inject

class NoteRepository @Inject constructor(private val db: NoteDatabase) {

    // insert note
    suspend fun insert(noteModel: NoteModel) = db.getNoteDao().insertnote(
        noteModel
    )

    // update note
    suspend fun update(noteModel: NoteModel) = db.getNoteDao().udatatenote(
        noteModel
    )

    // delete note
    suspend fun delete(noteModel: NoteModel) = db.getNoteDao().deletenote(
        noteModel
    )

    fun getAllNotes() = db.getNoteDao().getAllNotes()

    fun getAllSearchNote(query: String?) = db.getNoteDao().getsearchNote(query)

}