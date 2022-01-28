package com.koose.bootcampispaceapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.koose.bootcampispaceapp.R
import com.koose.bootcampispaceapp.data.learnersData

class LearnersAdapter(
    private val context: Context,
    private val learnersList: ArrayList<learnersData>,
):
    RecyclerView.Adapter<LearnersAdapter.LearnersViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnersViewHolder {
        val Rootview = LayoutInflater.from(parent.context)
            .inflate(R.layout.learners_item_raw, parent, false)

        return LearnersViewHolder(Rootview)
    }

    override fun onBindViewHolder(holder: LearnersViewHolder, position: Int) {
        val ItemsViewModel = learnersList[position]

        // sets the image to the imageview from our itemHolder class

     //   holder.textView.text = ItemsViewModel.text
        //        holder.textView.text = ItemsViewModel.text


       // holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
//        holder.textView.text = ItemsViewModel.text

    }

    override fun getItemCount(): Int {
        return learnersList.size
    }

    class LearnersViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

    }


}