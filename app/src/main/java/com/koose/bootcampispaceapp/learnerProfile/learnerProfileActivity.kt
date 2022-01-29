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
    private lateinit var profession_fiel: TextView
    private lateinit var img_bg: RelativeLayout
    private lateinit var imag_pro_two: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learner_profile)
    }
}