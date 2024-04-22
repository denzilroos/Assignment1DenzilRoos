package com.example.assignment1thehistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var userage : EditText
    lateinit var genbttn : Button
    lateinit var historytext : TextView
    lateinit var clearbttn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userage = findViewById(R.id.ageinput)
        genbttn = findViewById(R.id.genButton)
        historytext = findViewById(R.id.historyinfo)
        clearbttn = findViewById(R.id.clearbutton)

        clearbttn.setOnClickListener{//functionality of the clear button
            val clearpush = "Historical figure information"
            historytext.setText(clearpush)
            userage.setText(" ")

        }

        genbttn.setOnClickListener {//functionality of the Generate history button

            val value1 = userage.text.toString()
            val inputnumber = value1.toIntOrNull()

            if (value1.isEmpty()) {

                Toast.makeText(applicationContext, "Please type something here", Toast.LENGTH_LONG)
                    .show()
            } else if (inputnumber == 76) {
                val agevalue = " You are 76 years old, the same age as\n" +
                        " Albert Einstein when he passed away.\n" +
                        " Albert Einstein was a German-born \n" +
                        " theoretical physicist who is widely held to be\n" +
                        " one of the greatest and most influential\n" +
                        " scientists of all time. "

                historytext.setText(agevalue)
            } else if (inputnumber == 52) {
                val agevalue = " You are 52 years old, the same age as \n" +
                        " William Shakespeare when he passed away. \n" +
                        " William Shakespeare was an English playwright, \n " +
                        " poet, and actor. He is widely regarded as the \n" +
                        " greatest writer in the English language and the \n" +
                        " world's pre-eminent dramatist. He is often called \n" +
                        " England's national poet and the \"Bard of Avon\".  "

                historytext.setText(agevalue)
            } else if (inputnumber == 95) {
                val agevalue = " You are 95 years old, the same age as \n" +
                        " Nelson Mandela when he passed away. Nelson \n" +
                        " Rolihlahla Mandela was a South African anti-apartheid \n" +
                        " activist, politician, and statesman who served as the \n" +
                        " first president of South Africa from 1994 to 1999. \n" +
                        " He was the country's first black head of state and \n" +
                        " the first elected in a fully representative democratic \n" +
                        " election.  "

                historytext.setText(agevalue)
            } else if (inputnumber == 36) {
                val agevalue = " You are 36 years old, the same age as \n" +
                        " Diana, Princess of Wales when she passed away. \n" +
                        " Diana, Princess of Wales was a member of the British\n" +
                        " royal family. She was the first wife of Charles III \n" +
                        " and mother of Princes William and Harry. Her activism \n" +
                        " and glamour made her an international icon, and earned\n" +
                        " her enduring popularity. "

                historytext.setText(agevalue)
            } else if (inputnumber == 50) {
                val agevalue = " You are 50 years old, the same age as \n" +
                        " Michael Jackson when he passed away. Michael \n" +
                        " Joseph Jackson was an American singer, songwriter,\n" +
                        "  dancer, and philanthropist. Known as the \n" +
                        " \"King of Pop\", he is widely regarded as one \n" +
                        " of the most significant cultural figures of the\n" +
                        " 20th century.  "

                historytext.setText(agevalue)
            } else if (inputnumber == 90) {
                val agevalue = " You are 90 years old, the same age as \n" +
                        " Florence Nightingale when she passed away. \n" +
                        " Florence Nightingale OM RRC DStJ was an \n" +
                        " English social reformer, statistician and \n" +
                        " the founder of modern nursing. Nightingale\n" +
                        " came to prominence while serving as a manager\n" +
                        " and trainer of nurses during the Crimean War,\n" +
                        " in which she organised care for wounded \n" +
                        " soldiers at Constantinople. "

                historytext.setText(agevalue)
            } else if (inputnumber == 62) {
                val agevalue = " You are 62 years old, the same age as \n" +
                        " J. Robert Oppenheimer when he passed away.\n" +
                        " J. Robert Oppenheimer was an American theoretical \n" +
                        " physicist. He was director of the Manhattan Project's\n" +
                        " Los Alamos Laboratory during World War II and is \n" +
                        " often called the \"father of the atomic bomb\".  "

                historytext.setText(agevalue)
            } else if (inputnumber == 81) {
                val agevalue = " You are 81 years old, the same age as \n" +
                        " John Ronald Reuel Tolkien when he passed away.\n" +
                        "  John Ronald Reuel Tolkien CBE FRSL was an\n" +
                        " English writer and philologist. He was the \n" +
                        " author of the high fantasy works The Hobbit \n" +
                        " and The Lord of the Rings. From 1925 to 1945,\n" +
                        " Tolkien was the Rawlinson and Bosworth \n" +
                        " Professor of Anglo-Saxon and a Fellow of \n" +
                        " Pembroke College, both at the University of Oxford.  "

                historytext.setText(agevalue)
            } else if (inputnumber == 42) {
                val agevalue = " You are 42 years old, the same age as \n" +
                        " Elvis Presley when he passed away. Elvis Aaron Presley,\n" +
                        " also known mononymously as Elvis, was an \n" +
                        " American singer and actor. Known as the\n" +
                        " \"King of Rock and Roll\", he is regarded \n" +
                        " as one of the most significant cultural \n" +
                        " figures of the 20th century. "

                historytext.setText(agevalue)
            } else if (inputnumber == 27) {
                val agevalue = " You are 27 years old, the same age as \n" +
                        " Kurt Cobain when he passed away. Kurt Donald Cobain\n" +
                        " was an American musician who was the lead vocalist,\n" +
                        " guitarist, primary songwriter, and a founding member\n" +
                        " of the grunge rock band Nirvana. Through his angsty\n" +
                        " songwriting and anti-establishment persona, his\n" +
                        " compositions widened the thematic conventions of\n" +
                        " mainstream rock music.  "

                historytext.setText(agevalue) //test for input less than 20
            } else if (inputnumber != null) {
                if (inputnumber <= 20) {
                    val agevalue = "There is no historical figure known to be " + value1 +
                            " years old"

                    historytext.setText(agevalue)
                }
                if (inputnumber > 100) { //test for input greater than 100
                    val agevalue = "There is no historical figure known to be " + value1 +
                            " years old"

                    historytext.setText(agevalue)
                }


            }
            if (inputnumber == null) { //tests to see if the number entered is not an integer
                val agevalue = "Please enter a valid integer"

                historytext.setText(agevalue)
            }

        }
    }
    }


