package com.koose.bootcampispaceapp.learnerProfile.AM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.koose.bootcampispaceapp.R
import com.koose.bootcampispaceapp.learnerProfile.Adapter.LearnersAdapter
import com.koose.bootcampispaceapp.learnerProfile.Adapter.data.learnersData

class AmHomeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_am_home)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("AM Learners")

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val learnerList = ArrayList<learnersData>()

        learnerList.add(
            learnersData(
            "Fatimah ","Adam","adamfatima2557@gmail.com","Female",
            "Student of the  University for development Studies(UDS)","0201112557","Tema", Constants.FATIMAH
        )
        )

        val adata = LearnersAdapter(this,learnProl)
    }


}