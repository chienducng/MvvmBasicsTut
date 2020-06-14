package com.chienducng.mvvmbasicstut.ultilities

import com.chienducng.mvvmbasicstut.data.FakeDatabase
import com.chienducng.mvvmbasicstut.data.QuoteRepository
import com.chienducng.mvvmbasicstut.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}