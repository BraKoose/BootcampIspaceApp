package com.koose.bootcampispaceapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.koose.bootcampispaceapp.R
import com.koose.bootcampispaceapp.data.learnersData

class LearnersAdapter(
    private val context: Context,
    private val learnersList: List<learnersData>,
    private val handleLearnerClick: HandleLearnerClick
):
    RecyclerView.Adapter<LearnersAdapter.LearnersViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LearnersViewHolder {
        val Rootview = LayoutInflater.from(parent.context)
            .inflate(R.layout.learners_item_raw, parent, false)

        return LearnersViewHolder(Rootview)
    }

    override fun onBindViewHolder(holder: LearnersViewHolder, position: Int) {
        val dataPosition = learnersList[position]
        holder.name.text = dataPosition.name


        holder.learnerClick.setOnClickListener {
            handleLearnerClick.onLearnerClick(position)
        }

        Glide
            .with(context)
            .load(dataPosition.profileImage)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(holder.profileImage)

    }

    override fun getItemCount(): Int {
        return learnersList.size
    }



    class LearnersViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        val name:TextView = itemView.findViewById(R.id.textView)
        val profileImage:ImageView = itemView.findViewById(R.id.imageView)
        val learnerClick : CardView = itemView.findViewById(R.id.relaytiveLayout)

    }

    interface HandleLearnerClick {
        fun onLearnerClick(position: Int)
    }


}