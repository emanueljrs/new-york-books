package com.emanuel.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emanuel.nybooks.R
import com.emanuel.nybooks.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
    private val books: List<Book>,
    private val onItemClickListener: ((book: Book) -> Unit)
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view, onItemClickListener)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bind(books[position])
    }

    override fun getItemCount(): Int = books.size

    class BooksViewHolder(itemView: View, val onItemClickListener: ((book: Book) -> Unit)) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.textTitle
        val author = itemView.textAuthor

        fun bind(book: Book) {
            title.text = book.title
            author.text = book.author

            //Para cada item na lista terá um clickListener escutando o click nele
            itemView.setOnClickListener {
                onItemClickListener(book)
            }

        }

    }
}