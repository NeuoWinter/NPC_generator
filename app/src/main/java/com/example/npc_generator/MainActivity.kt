package com.example.npc_generator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Validators.and
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preferences.*
import kotlin.random.Random

// vars for preferences feature
var chooseSpecies = "Random"
var chooseAge = "Random"
var chooseGender = "Random"
var chooseJob = "Random"
// conversion vars
var firstNameConvert = " "
var lastNameConvert = " "
var speciesConvert = " "
var ageConvert = " "
var genderConvert = " "
var classConvert = " "
var physConvert = " "
var physConvert2 = ""
var personConvert = " "
var personConvert2 = ""
// for saved feature
var counter = 0
var save_name = " "
var save_species = " "
var save_age = " "
var save_gender = " "
var save_class = " "
var save_Phys_Q = " "
var save_Pers_Q = " "

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // switch to other pages
        pref_menu_button.setOnClickListener {
            var intent = Intent(this, Preferences::class.java)
            startActivity(intent)
        }

        save_menu_button.setOnClickListener {
            var intent = Intent(this, save_menu::class.java)
            startActivity(intent)
        }

        help_menu_button.setOnClickListener {
            var intent = Intent( this, help_menu::class.java)
            startActivity(intent)
        }
// ------------------- Character Species --------------------------------
        generate_button.setOnClickListener {
            if (chooseSpecies == "Random") {
                val randomSpecies = Random.nextInt(1, 5);
                if (randomSpecies == 1)
                    speciesConvert = "Human"
                else if (randomSpecies == 2)
                    speciesConvert = "Dwarf"
                else if (randomSpecies == 3)
                    speciesConvert = "Elf"
                else if (randomSpecies == 4)
                    speciesConvert = "Halfling"
                speciesOutputID.setText(speciesConvert);
            }
            else if (chooseSpecies != "Random") {
                speciesOutputID.setText(chooseSpecies)
                speciesConvert = chooseSpecies
            }
// ------------------- Character Age --------------------------------
            if (chooseAge == "Random") {
                val randomAge = Random.nextInt(1, 6);
                if (randomAge == 1)
                    ageConvert = "Child"
                else if (randomAge == 2)
                    ageConvert = "Teen"
                else if (randomAge == 3)
                    ageConvert = "Adult"
                else if (randomAge == 4)
                    ageConvert = "Middle Age"
                else if (randomAge == 5)
                    ageConvert = "Elder"
                ageOutput.setText(ageConvert)
            }
            else if (chooseAge != "Random") {
                ageOutput.setText(chooseAge)
                ageConvert = chooseAge
            }
            ageOutput.setText(ageConvert);
// ------------------- Character Gender --------------------------------
            if (chooseGender == "Random") {
                var randomGender = Random.nextInt(1, 4);
                if (randomGender == 1)
                    genderConvert = "Male"
                else if (randomGender == 2)
                    genderConvert = "Female"
                else if (randomGender == 3)
                    genderConvert = "Non-binary"
                genderOutput.setText(genderConvert)
            }
            else if (chooseGender != "Random") {
                genderOutput.setText(chooseGender)
                genderConvert = chooseGender
            }
            // reset gender for name usage later
            if (genderConvert == "Non-binary") {
                var randomGender2 = Random.nextInt(1, 3)
                if (randomGender2 == 1)
                    genderConvert = "Male"
                else if (randomGender2 == 2)
                    genderConvert = "Female"
            }
// ------------------- Character Name --------------------------------
            // ------------------- Human -----------------------------
            if (speciesConvert == "Human") {
                val randomLastName = Random.nextInt(1, 6)
                if (randomLastName == 1)
                    lastNameConvert = "Dorn"
                else if (randomLastName == 2)
                    lastNameConvert = "Lander"
                else if (randomLastName == 3)
                    lastNameConvert = "Ramas"
                else if (randomLastName == 4)
                    lastNameConvert = "Romero"
                else if (randomLastName == 5)
                    lastNameConvert = "Zolis"
            }
            if (speciesConvert == "Human" && genderConvert == "Male") {
                val randomFirstName = Random.nextInt(1, 6)
                if (randomFirstName == 1)
                    firstNameConvert = "John "
                else if (randomFirstName == 2)
                    firstNameConvert = "Paul "
                else if (randomFirstName == 3)
                    firstNameConvert = "Samuel "
                else if (randomFirstName == 4)
                    firstNameConvert = "Marcus "
                else if (randomFirstName == 5)
                    firstNameConvert = "David "
            }
            else if (speciesConvert == "Human" && genderConvert == "Female") {
                val randomFirstName = Random.nextInt (1, 6)
                if (randomFirstName == 1)
                    firstNameConvert = "Sarah "
                else if (randomFirstName == 2)
                    firstNameConvert = "Joan "
                else if (randomFirstName == 3)
                    firstNameConvert = "Mary "
                else if (randomFirstName == 4)
                    firstNameConvert = "Lily "
                else if (randomFirstName == 5)
                    firstNameConvert = "Patricia "
            }
            // ------------------- Dwarf -----------------------------
            if (speciesConvert == "Dwarf") {
                val randomLastName = Random.nextInt(1, 6)
                if (randomLastName == 1)
                    lastNameConvert = "Bronzebeard"
                else if (randomLastName == 2)
                    lastNameConvert = "Thunderbrew"
                else if (randomLastName == 3)
                    lastNameConvert = "Bloodaxe"
                else if (randomLastName == 4)
                    lastNameConvert = "Steelforge"
                else if (randomLastName == 5)
                    lastNameConvert = "Orcbane"
            }
            if (speciesConvert == "Dwarf" && genderConvert == "Male") {
                val randomFirstName = Random.nextInt(1, 6)
                if (randomFirstName == 1)
                    firstNameConvert = "Magni "
                else if (randomFirstName == 2)
                    firstNameConvert = "Brohn "
                else if (randomFirstName == 3)
                    firstNameConvert = "Dugan "
                else if (randomFirstName == 4)
                    firstNameConvert = "Flint "
                else if (randomFirstName == 5)
                    firstNameConvert = "Ulfgar "
            }
            else if (speciesConvert == "Dwarf" && genderConvert == "Female") {
                val randomFirstName = Random.nextInt (1, 6)
                if (randomFirstName == 1)
                    firstNameConvert = "Amber "
                else if (randomFirstName == 2)
                    firstNameConvert = "Helga "
                else if (randomFirstName == 3)
                    firstNameConvert = "Edeth "
                else if (randomFirstName == 4)
                    firstNameConvert = "Brunhilde "
                else if (randomFirstName == 5)
                    firstNameConvert = "Vistra "
            }
            // ------------------- Elf -----------------------------
            if (speciesConvert == "Elf") {
                val randomLastName = Random.nextInt(1, 6)
                if (randomLastName == 1)
                    lastNameConvert = "Amakiir"
                else if (randomLastName == 2)
                    lastNameConvert = "Holimion"
                else if (randomLastName == 3)
                    lastNameConvert = "Nailo"
                else if (randomLastName == 4)
                    lastNameConvert = "Liadon"
                else if (randomLastName == 5)
                    lastNameConvert = "Xiloscient"
            }
            if (speciesConvert == "Elf" && genderConvert == "Male") {
                val randomFirstName = Random.nextInt(1, 6)
                if (randomFirstName == 1)
                    firstNameConvert = "Adran "
                else if (randomFirstName == 2)
                    firstNameConvert = "Erdan "
                else if (randomFirstName == 3)
                    firstNameConvert = "Peren "
                else if (randomFirstName == 4)
                    firstNameConvert = "Ivellios "
                else if (randomFirstName == 5)
                    firstNameConvert = "Riardon "
            }
            else if (speciesConvert == "Elf" && genderConvert == "Female") {
                val randomFirstName = Random.nextInt (1, 6)
                if (randomFirstName == 1)
                    firstNameConvert = "Althaea "
                else if (randomFirstName == 2)
                    firstNameConvert = "Birel "
                else if (randomFirstName == 3)
                    firstNameConvert = "Lia "
                else if (randomFirstName == 4)
                    firstNameConvert = "Naivara "
                else if (randomFirstName == 5)
                    firstNameConvert = "Thia "
            }
            // ------------------- Halfling -----------------------------
            if (speciesConvert == "Halfling") {
                val randomLastName = Random.nextInt(1, 6)
                if (randomLastName == 1)
                    lastNameConvert = "Underhill"
                else if (randomLastName == 2)
                    lastNameConvert = "Swiftfoot"
                else if (randomLastName == 3)
                    lastNameConvert = "Goodberry"
                else if (randomLastName == 4)
                    lastNameConvert = "Tealeaf"
                else if (randomLastName == 5)
                    lastNameConvert = "Thornbrush"
            }
            if (speciesConvert == "Halfling" && genderConvert == "Male") {
                val randomFirstName = Random.nextInt(1, 6)
                if (randomFirstName == 1)
                    firstNameConvert = "Alton "
                else if (randomFirstName == 2)
                    firstNameConvert = "Errich "
                else if (randomFirstName == 3)
                    firstNameConvert = "Garret "
                else if (randomFirstName == 4)
                    firstNameConvert = "Merric "
                else if (randomFirstName == 5)
                    firstNameConvert = "Milo "
            }
            else if (speciesConvert == "Halfling" && genderConvert == "Female") {
                val randomFirstName = Random.nextInt (1, 6)
                if (randomFirstName == 1)
                    firstNameConvert = "Bree "
                else if (randomFirstName == 2)
                    firstNameConvert = "Cora "
                else if (randomFirstName == 3)
                    firstNameConvert = "Lidda "
                else if (randomFirstName == 4)
                    firstNameConvert = "Portia "
                else if (randomFirstName == 5)
                    firstNameConvert = "Vani "
            }
            nameOutput.setText(firstNameConvert + lastNameConvert)
// ------------------- Character Class --------------------------------
            if (chooseJob == "Random") {
                val randomClass = Random.nextInt(1, 5);
                if (randomClass == 1)
                    classConvert = "Cleric"
                else if (randomClass == 2)
                    classConvert = "Fighter"
                else if (randomClass == 3)
                    classConvert = "Rogue"
                else if (randomClass == 4)
                    classConvert = "Wizard"
                classOutput.setText(classConvert)
            }
            else if (chooseJob != "Random") {
                classOutput.setText(chooseJob)
                classConvert = chooseJob
            }
// ------------------- Character Physical Quark --------------------------------
            val randomPhys = Random.nextInt(1, 11);
            if (randomPhys == 1) {
                physConvert = "Weird color hair: "
                val randomPhys2 = Random.nextInt(1, 5);
                if (randomPhys2 == 1)
                    physConvert2 = "Blue"
                else if (randomPhys2 == 2)
                    physConvert2 = "Green"
                else if (randomPhys2 == 3)
                    physConvert2 = "Purple"
                else if (randomPhys2 == 4)
                    physConvert2 = "Pink"
            }
            else if (randomPhys == 2) {
                physConvert = "Weird color eyes: "
                val randomPhys3 = Random.nextInt(1, 5);
                if (randomPhys3 == 1)
                    physConvert2 = "Red"
                else if (randomPhys3 == 2)
                    physConvert2 = "Yellow"
                else if (randomPhys3 == 3)
                    physConvert2 = "Purple"
                else if (randomPhys3 == 4)
                    physConvert2 = "Pink"
            }
            else if (randomPhys == 3) {
                physConvert = "Twitchy"
                physConvert2 = "" }
            else if (randomPhys == 4) {
                physConvert = "Very Obese"
                physConvert2 = "" }
            else if (randomPhys == 5) {
                physConvert = "Anorexic"
                physConvert2 = "" }
            else if (randomPhys == 6) {
                physConvert = "Missing Limb: "
                val randomPhys4 = Random.nextInt(1, 5);
                if (randomPhys4 == 1)
                    physConvert2 = "Hand"
                else if (randomPhys4 == 2)
                    physConvert2 = "Arm"
                else if (randomPhys4 == 3)
                    physConvert2 = "Leg"
                else if (randomPhys4 == 4)
                    physConvert2 = "Eye"
            }
            else if (randomPhys == 7) {
                physConvert = "Flamboyant Clothes"
                physConvert2 = "" }
            else if (randomPhys == 8) {
                physConvert = "Bald"
                physConvert2 = "" }
            else if (randomPhys == 9) {
                physConvert = "Tattoos"
                physConvert2 = "" }
            else if (randomPhys == 10) {
                physConvert = "Formal Clothes"
                physConvert2 = "" }
            physOutput.setText(physConvert + physConvert2)
// ------------------- Character Personality Quark --------------------------------
            val randomPerson = Random.nextInt(1, 11);
            if (randomPerson == 1) {
                personConvert = "Phobia: "
                val randomPerson2 = Random.nextInt(1, 5);
                if (randomPerson2 == 1)
                    personConvert2 = "Snakes"
                else if (randomPerson2 == 2)
                    personConvert2 = "Spiders"
                else if (randomPerson2 == 3)
                    personConvert2 = "Claustrophobic"
                else if (randomPerson2 == 4)
                    personConvert2 = "Agoraphobic"
            }
            else if (randomPerson == 2) {
                personConvert = "Kleptomaniac"
                personConvert2 = "" }
            else if (randomPerson == 3) {
                personConvert = "Pyromaniac"
                personConvert2 = "" }
            else if (randomPerson == 4) {
                personConvert = "Dislikes poor people"
                personConvert2 = "" }
            else if (randomPerson == 5) {
                personConvert = "Dislikes rich people"
                personConvert2 = "" }
            else if (randomPerson == 6) {
                personConvert = "Arrogant"
                personConvert2 = "" }
            else if (randomPerson == 7) {
                personConvert = "Quiet"
                personConvert2 = "" }
            else if (randomPerson == 8) {
                personConvert = "Honest"
                personConvert2 = "" }
            else if (randomPerson == 9) {
                personConvert = "Pathological liar"
                personConvert2 = "" }
            else if (randomPerson == 10) {
                personConvert = "Altruistic"
                personConvert2 = "" }
            personOutput.setText(personConvert + personConvert2)
        }
        save_button.setOnClickListener {
            if (firstNameConvert != " ") {
                save_name = (firstNameConvert + lastNameConvert)
                save_species = speciesConvert
                save_age = ageConvert
                save_gender = genderConvert
                save_class = classConvert
                save_Phys_Q = (physConvert + physConvert2)
                save_Pers_Q = (personConvert + personConvert2)
                counter++
                firstNameConvert = " "
                var intent = Intent(this, save_menu::class.java)
                startActivity(intent)
            }
        }
    }
}
