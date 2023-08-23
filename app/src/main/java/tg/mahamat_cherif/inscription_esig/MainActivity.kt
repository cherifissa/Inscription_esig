package tg.mahamat_cherif.inscription_esig

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eleveData = intent.getStringArrayExtra("eleveData")
        if (eleveData != null && eleveData.isNotEmpty()) {
            val nom = eleveData[0]
            val prenom = eleveData[1]
            val email = eleveData[2]
            val age = eleveData[3]
            val numero = eleveData[4]

            println("Nom: $nom")
            println("Prénom: $prenom")
            println("Email: $email")
            println("Âge: $age")
            println("Numéro: $numero")
        }

    }


}