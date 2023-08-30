package tg.mahamat_cherif.inscription_esig

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
class IncriptionActivity : AppCompatActivity() {

    private lateinit var NomEditText: EditText
    private lateinit var PrenomEditText: EditText
    private lateinit var EmailEditText: EditText
    private lateinit var AgeEditText: EditText
    private lateinit var NumeroTelephoneEditText: EditText
    private lateinit var SubmitButton: Button
    private lateinit var CancelButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_incription)

        NomEditText = findViewById(R.id.etName)
        PrenomEditText = findViewById(R.id.etFirstName)
        EmailEditText = findViewById(R.id.etEmail)
        AgeEditText = findViewById(R.id.etAge)
        NumeroTelephoneEditText = findViewById(R.id.etPhone)

        SubmitButton = findViewById(R.id.btnSubmit)
        SubmitButton.setOnClickListener {

            var nom = "cherif"
            var prenom = "issa"
            var email = "cherif@gmail.com"
            var ageText = "23"
            var numero = "70056985"

           /* var nom = NomEditText.text.toString()
            var prenom = PrenomEditText.text.toString()
            var email = EmailEditText.text.toString()
            var ageText = AgeEditText.text.toString()
            var numero = NumeroTelephoneEditText.text.toString()*/

            if (isNotNullInput(nom, prenom, email, ageText, numero)) {
                if(isValidEmail(email)){
                    val age: Int = if (ageText.isNotEmpty()) ageText.toInt() else 0
                    val eleveData = arrayOf(nom, prenom, email, age, numero)

                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("eleveData", eleveData.map { it.toString() }.toTypedArray())
                    startActivity(intent)
                    finish()
                }else {
                    Toast.makeText(this, "Entrée invalide. Veuillez vérifier votre email.", Toast.LENGTH_SHORT).show()
                }
            } else{
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
            }

        }

        CancelButton = findViewById(R.id.btnCancel)
        CancelButton.setOnClickListener {
            NomEditText.text.clear()
            PrenomEditText.text.clear()
            EmailEditText.text.clear()
            AgeEditText.text.clear()
            NumeroTelephoneEditText.text.clear()
        }

    }

    private fun isValidEmail(email: String): Boolean {
        val emailRegex = Regex("^([a-zA-Z0-9._%+-]+)@([a-zA-Z0-9.-]+)\\.[a-zA-Z]{2,6}$")
        return emailRegex.matches(email)
    }
    private fun isNotNullInput(nom: String, prenom: String, email: String, age: String, numero: String): Boolean {
        return nom.isNotEmpty() &&
                prenom.isNotEmpty() &&
                email.isNotEmpty() &&
                age.isNotEmpty() &&
                numero.isNotEmpty()
    }

}
