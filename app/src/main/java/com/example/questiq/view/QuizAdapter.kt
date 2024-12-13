package com.example.questiq.view

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.questiq.databinding.QuizItemBinding
import com.example.questiq.model.QuizModel

class QuizAdapter : RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {

    private lateinit var itemListener: OnItemClickListener

    class QuizViewHolder(var binding: QuizItemBinding, listener: OnItemClickListener) :
        RecyclerView.ViewHolder(binding.root) {

            init {
                binding.categoryImage
                binding.categoryName

                binding.btnNext.setOnClickListener{
                    listener.onItemClick(adapterPosition)
                }

            }



        }

    interface OnItemClickListener {
        fun onItemClick(position: Int)

    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        itemListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val quizItemView =
            QuizItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return QuizViewHolder(binding = quizItemView, listener = itemListener)
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        val context = holder.itemView.context

        holder.binding.categoryImage.setImageResource(differ.currentList[position].categoryImage)
        holder.binding.categoryName.text =
            context.getString(differ.currentList[position].categoryName)

        holder.itemView.setOnClickListener {
            itemListener?.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }


    private var diffCallBack = object : DiffUtil.ItemCallback<QuizModel>() {
        override fun areItemsTheSame(oldItem: QuizModel, newItem: QuizModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: QuizModel, newItem: QuizModel): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, diffCallBack)

}