package com.example.npc_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preferences.*

class Preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)

        // setting spinners
        val species = resources.getStringArray(R.array.Species)
        val speciesSpinner = findViewById<Spinner>(R.id.prefSpecies)
        if (prefSpecies != null) {
            val adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item, species)
            prefSpecies.adapter = adapter

            prefSpecies.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@Preferences, getString(R.string.species_item) + " "
                    + species[position], Toast.LENGTH_SHORT).show()
                    chooseSpecies = species[position].toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // blank
                }
            }

        }
        // age cat spinner
        val age = resources.getStringArray(R.array.Age)
        val ageSpinner = findViewById<Spinner>(R.id.prefAge)
        if (prefAge != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, age)
            prefAge.adapter = adapter

            prefAge.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@Preferences, getString(R.string.age_item) + " "
                            + age[position], Toast.LENGTH_SHORT).show()
                    chooseAge = age[position].toString()

                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // blank
                }
            }

        }
        // gender spinner
        val gender = resources.getStringArray(R.array.Gender)
        val genderSpinner = findViewById<Spinner>(R.id.prefGender)
        if (prefGender != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, gender)
            prefGender.adapter = adapter

            prefGender.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@Preferences, getString(R.string.gender_item) + " "
                            + gender[position], Toast.LENGTH_SHORT).show()
                    chooseGender = gender[position].toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // blank
                }
            }

        }
        // Job/Class spinner
        val jobClass = resources.getStringArray(R.array.Class)
        val jobClassSpinner = findViewById<Spinner>(R.id.prefClass)
        if (prefClass != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, jobClass)
            prefClass.adapter = adapter

            prefClass.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@Preferences, getString(R.string.job_class_item) + " "
                            + jobClass[position], Toast.LENGTH_SHORT).show()
                    chooseJob = jobClass[position].toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // blank
                }
            }

        }
        // num NPC spinner
        /*
        val numNPC = resources.getStringArray(R.array.NumberNPC)
        val numNPCSpinner = findViewById<Spinner>(R.id.prefNumber)
        if (prefNumber != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, numNPC)
            prefNumber.adapter = adapter

            prefNumber.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@Preferences, getString(R.string.numberNPC_item) + " "
                            + numNPC[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // blank
                }
            }

        }*/
        prefBackButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}