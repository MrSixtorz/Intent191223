package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable


class Book (
    private var titulo : String,
    private var paginas : String,
    private var autor: String,
    private var agno: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(titulo)
        parcel.writeString(paginas)
        parcel.writeString(autor)
        parcel.writeString(agno)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Book> {
        override fun createFromParcel(parcel: Parcel): Book {
            return Book(parcel)
        }

        override fun newArray(size: Int): Array<Book?> {
            return arrayOfNulls(size)
        }
    }
    fun setTitulo(){
        this.titulo=titulo
    }

}


