package com.example.app

import android.speech.tts.TextToSpeech
import java.util.*

fun clockReader(): String {
    val timeNow: Calendar = Calendar.getInstance()
    timeNow.timeZone = TimeZone.getTimeZone("Europe/Paris")
    val hours = timeNow[Calendar.HOUR_OF_DAY]
    val minutes = timeNow[Calendar.MINUTE]

    return "Il est " + hours + " heures " + minutes + "minutes."
}