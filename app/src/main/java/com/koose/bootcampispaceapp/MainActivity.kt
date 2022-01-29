package com.koose.bootcampispaceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.koose.bootcampispaceapp.Adapter.LearnersAdapter
import com.koose.bootcampispaceapp.Utils.constants
import com.koose.bootcampispaceapp.data.learnersData

class MainActivity : AppCompatActivity() {
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycler = findViewById(R.id.Recycler)


        recycler.layoutManager = LinearLayoutManager(this)

        val learnersList = ArrayList<learnersData>()

        learnersList.add(
            learnersData(
                "Bra", "Koose", "kooseTheBlogger@gmail.com", "Male",
                "Backend Developer", "0545644173",  constants.GODFRED
            )
        )

        learnersList.add(
            learnersData(
                "Olorunfemi", "Oyewole", "eliasikechi14@gmail.com", "Male",
                "Programmer/Graphic Designer", "0545565901", constants.FEMI
            )
        )

        learnersList.add(
            learnersData(
                "Hephzibah", "Emereole", "hephzibahemereole@gmail.com", "Female",
                "Student", "0279542753", constants.ZIBAH
            )
        )

        learnersList.add(
            learnersData(
                "Fatimah ",
                "Adam",
                "adamfatima2557@gmail.com",
                "Female",
                "Student of the  University for development Studies(UDS)",
                "0201112557",
                constants.FATIMAH
            )
        )

        val adapta =
            LearnersAdapter(this, learnersList, object : LearnersAdapter.HandleLearnerClick {
                override fun onLearnerClick(position: Int) {
                    val allLearner = learnersList[position]
                    val name:String = allLearner.name
                    val email: String = allLearner.email
                    val gender: String = allLearner.gender
                    val profession: String = allLearner.profession
                    val learnerImage: Int = allLearner.profileImage
                    val phoneNumb: String = allLearner.phone


                }

            })

        recycler.adapter = adapta
    }

}