package tg.mahamat_cherif.inscription_esig

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
            var Nom = NomEditText.text.toString()
            var Prenom = PrenomEditText.text.toString()
            var Email = EmailEditText.text.toString()
            var Age = AgeEditText.text.toString()
            var Numero = NumeroTelephoneEditText.text.toString()
            val EleveData = arrayOf(Nom, Prenom, Email, Age, Numero)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("eleveData", EleveData)
            startActivity(intent)
            finish()
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
}
