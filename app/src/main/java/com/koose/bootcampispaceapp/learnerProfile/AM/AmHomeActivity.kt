package com.koose.bootcampispaceapp.learnerProfile.AM

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.koose.bootcampispaceapp.R
import com.koose.bootcampispaceapp.learnerProfile.Adapter.LearnersAdapter
import com.koose.bootcampispaceapp.learnerProfile.Adapter.Utils.constants
import com.koose.bootcampispaceapp.learnerProfile.Adapter.data.learnersData
import com.koose.bootcampispaceapp.learnerProfile.learnerProfileActivity

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
            "Student of the  University for development Studies(UDS)","0201112557","Tema", constants.FATIMAH
        )
        )

        val adata = LearnersAdapter(this, learnerList, object : LearnersAdapter.HandleLearnerClick{
            override fun onLearnerClick(position: Int) {
                val allLeaner = learnerList[position]
                val FName: String = allLeaner.Fname
                val LName:String = allLeaner.LName
                val email: String = allLeaner.email
                val gender: String = allLeaner.gender
                val profession: String = allLeaner.profession
                val learnerImage: Int = allLeaner.profileImage
                val phone: String = allLeaner.phone



                val intent = Intent(this@AmHomeActivity, learnerProfileActivity::class.java)
                intent.putExtra("fname",FName)
                intent.putExtra("lname",LName)
                intent.putExtra("email",email)
                intent.putExtra("gender",gender)
                intent.putExtra("phone",phone)
                intent.putExtra("profession",profession)
                intent.putExtra("learnerImg", learnerImage)
                intent.putExtra("AM","AM")
                startActivity(intent)
            }

        })

        recyclerView.adapter = adata
    }


}