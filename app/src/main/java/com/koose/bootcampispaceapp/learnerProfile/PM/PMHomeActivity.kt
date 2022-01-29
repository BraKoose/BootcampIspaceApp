package com.koose.bootcampispaceapp.learnerProfile.PM

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

class PMHomeActivity : AppCompatActivity() {
    private lateinit var  recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pm_home)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("PM Learners")

        recyclerView = findViewById(R.id.recyclerViewpm)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val learnersList = ArrayList<learnersData>()

        learnersList.add(
            learnersData(
                "Claudia", "Mintogo",
                "claudiamintogo@gmail.com", "Female",
                "Student", "0269384159", "Awoshie", constants.CLAUDIA
            )
        )

        learnersList.add(
            learnersData(
                "Claudia", "Mintogo",
                "claudiamintogo@gmail.com", "Female",
                "Student", "0269384159", "Awoshie", constants.CLAUDIA
            )
        )

        learnersList.add(
            learnersData(
                "Albert", "Osei", "oseialbert072@gmail.com", "Male",
                "Software developer", "0542291420", "Labadi", constants.ALBERT
            )
        )

        val adapta =
            LearnersAdapter(this, learnersList, object : LearnersAdapter.HandleLearnerClick {
                override fun onLearnerClick(position: Int) {
                    val allLearner = learnersList[position]
                    val fName: String = allLearner.Fname
                    val lName: String = allLearner.LName
                    val email: String = allLearner.email
                    val gender: String = allLearner.gender
                    val profession: String = allLearner.profession
                    val learnerImag: Int = allLearner.profileImage
                    val phoneNumb: String = allLearner.phone


                    val intent = Intent(this@PMHomeActivity, learnerProfileActivity::class.java)
                    intent.putExtra("fname", fName)
                    intent.putExtra("lname", lName)
                    intent.putExtra("email", email)
                    intent.putExtra("gender", gender)
                    intent.putExtra("phone", phoneNumb)
                    intent.putExtra("profession", profession)
                    intent.putExtra("learnerImg", learnerImag)
                    intent.putExtra("PM", "PM")
                    startActivity(intent)
                }
            })

        recyclerView.adapter = adapta
    }
}