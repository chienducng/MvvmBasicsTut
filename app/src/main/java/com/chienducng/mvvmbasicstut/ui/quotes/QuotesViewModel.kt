package com.chienducng.mvvmbasicstut.ui.quotes

import androidx.lifecycle.ViewModel
import com.chienducng.mvvmbasicstut.data.Quote
import com.chienducng.mvvmbasicstut.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}