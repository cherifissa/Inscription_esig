package tg.mahamat_cherif.inscription_esig

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textViewNom: TextView
    private lateinit var textViewPrenom: TextView
    private lateinit var textViewEmail: TextView
    private lateinit var textViewAge: TextView
    private lateinit var textViewNumero: TextView
    private lateinit var SignOutButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewNom = findViewById(R.id.textViewSavedNom)
        textViewPrenom = findViewById(R.id.textViewSavedPrenom)
        textViewEmail = findViewById(R.id.textViewSavedEmail)
        textViewAge = findViewById(R.id.textViewSavedAge)
        textViewNumero = findViewById(R.id.textViewSavedNumero)
        SignOutButton = findViewById(R.id.btnSignOut)


        val eleveData = intent.getStringArrayExtra("eleveData")
        if (eleveData != null) {
            val nom = eleveData[0]
            val prenom = eleveData[1]
            val email = eleveData[2]
            val age = eleveData[3]
            val numero = eleveData[4]

            textViewNom.text = nom
            textViewPrenom.text = prenom
            textViewEmail.text = email
            textViewAge.text = age
            textViewNumero.text = numero

            SignOutButton.setOnClickListener {
                println("nom")
            }
        } else {
            println("Vide")        }

    }
}
