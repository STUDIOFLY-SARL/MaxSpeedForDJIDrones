package com.riis.studiofly

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.riis.studiofly.R
import dji.common.mission.waypointv2.WaypointV2

class SettingsForSpeed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_for_speed)

        val maxFlightSpeed = 1.8 //définition de la vitesse maximale par défaut mais à revoir car la range de sa fonction est de 2 à 15

        val buttonSetDEFAULTMaxSpeedForDrone = findViewById<Button>(R.id.button_define_max_drone_speed)
        buttonSetDEFAULTMaxSpeedForDrone.setOnClickListener {
            Toast.makeText(this,"vitesse max définie à 1.8 m/S",Toast.LENGTH_LONG).show()
        }
        val buttonSetMaxSpeedForDrone = findViewById<Button>(R.id.button_def_vitesse)
        buttonSetMaxSpeedForDrone.setOnClickListener {
            Toast.makeText(this,"nouvelle vitesse max définie !",Toast.LENGTH_LONG).show()
        }

    }




}