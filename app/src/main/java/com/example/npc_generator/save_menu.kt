package com.example.npc_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preferences.*
import kotlinx.android.synthetic.main.activity_save_menu.*

var first_save = " "
var second_save = " "
var third_save = " "
var fourth_save = " "
var fifth_save = " "
var sixth_save = " "

class save_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save_menu)

        if (counter == 1 && save_name != " ") {
            first_save = ("Name: "+save_name+"\n"+"Species: "+save_species+"\n"+"Age: "+save_age+
                          "\n"+"Gender: "+save_gender+"\n"+"Class: "+save_class+"\n"+
                          "Physical Quark: "+save_Phys_Q+"\n"+"Personality Quark: "+save_Pers_Q)
        }
        else if (counter == 2 && save_name != " ") {
            second_save = ("Name: "+save_name+"\n"+"Species: "+save_species+"\n"+"Age: "+save_age+
                           "\n"+"Gender: "+save_gender+"\n"+"Class: "+save_class+"\n"+
                           "Physical Quark: "+save_Phys_Q+"\n"+"Personality Quark: "+save_Pers_Q)
        }
        else if (counter == 3 && save_name != " ") {
            third_save = ("Name: "+save_name+"\n"+"Species: "+save_species+"\n"+"Age: "+save_age+
                          "\n"+"Gender: "+save_gender+"\n"+"Class: "+save_class+"\n"+
                          "Physical Quark: "+save_Phys_Q+"\n"+"Personality Quark: "+save_Pers_Q)
        }
        else if (counter == 4 && save_name != " ") {
            fourth_save = ("Name: "+save_name+"\n"+"Species: "+save_species+"\n"+"Age: "+save_age+
                           "\n"+"Gender: "+save_gender+"\n"+"Class: "+save_class+"\n"+
                           "Physical Quark: "+save_Phys_Q+"\n"+"Personality Quark: "+save_Pers_Q)
        }
        else if (counter == 5 && save_name != " ") {
            fifth_save = ("Name: "+save_name+"\n"+"Species: "+save_species+"\n"+"Age: "+save_age+
                          "\n"+"Gender: "+save_gender+"\n"+"Class: "+save_class+"\n"+
                          "Physical Quark: "+save_Phys_Q+"\n"+"Personality Quark: "+save_Pers_Q)
        }
        else if (counter == 6 && save_name != " ") {
            sixth_save = ("Name: "+save_name+"\n"+"Species: "+save_species+"\n"+"Age: "+save_age+
                          "\n"+"Gender: "+save_gender+"\n"+"Class: "+save_class+"\n"+
                          "Physical Quark: "+save_Phys_Q+"\n"+"Personality Quark: "+save_Pers_Q)
        }

        save1.setText(first_save)
        save2.setText(second_save)
        save3.setText(third_save)
        save4.setText(fourth_save)
        save5.setText(fifth_save)
        save6.setText(sixth_save)

        saveBackButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}