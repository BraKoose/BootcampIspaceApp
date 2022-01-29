package com.koose.bootcampispaceapp.learnerProfile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.koose.bootcampispaceapp.R

class learnerProfileActivity : AppCompatActivity() {

    private  lateinit var  profileImage: ImageView
    private lateinit var fullname_field: TextView
    private lateinit var email_field: TextView
    private lateinit var phone_number: TextView
    private lateinit var gender_field: TextView
    private lateinit var profession_field: TextView
    private lateinit var img_bg: RelativeLayout
    private lateinit var imag_pro_two: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learner_profile)


        profileImage= findViewById(R.id.profileImag)
        fullname_field = findViewById(R.id.fullname_field)
        email_field = findViewById(R.id.email_field)
        phone_number = findViewById(R.id.phone_number)
        gender_field = findViewById(R.id.gender_field)
        profession_field = findViewById(R.id.profession_field)
        img_bg = findViewById(R.id.img_bg)
        imag_pro_two = findViewById(R.id.profileImagTwo)

        val intent = getIntent();
        val fname = intent.getStringExtra("fname")
        val lname = intent.getStringExtra("lname")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")
        val profession = intent.getStringExtra("profession")
        val phonenumb = intent.getStringExtra("phone")
        val learnerImg = intent.getIntExtra("learnerImg",0)
        val pm: String? = intent.getStringExtra("PM")
        val am: String? = intent.getStringExtra("AM")
    }
}