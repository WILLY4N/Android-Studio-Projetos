package devandroid.bitan.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.bitan.applistacurso.R;
import devandroid.bitan.applistacurso.controller.PessoaController;
import devandroid.bitan.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoaController controller;
    Pessoa pessoa;
    Pessoa outraPessoa;
    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeCurso;
    EditText editTelefoneContato;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new PessoaController();
        controller.toString();

        pessoa = new Pessoa();

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Araújo");
        outraPessoa.setSobreNome("Gonçalves");
        outraPessoa.setCursoDesejado("ADS");
        outraPessoa.setTelefoneContato("43 93505-9758");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(outraPessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(outraPessoa.getSobreNome());
        editNomeCurso.setText(outraPessoa.getCursoDesejado());
        editTelefoneContato.setText(outraPessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobreNomeAluno.setText("");
                editTelefoneContato.setText("");
                editNomeCurso.setText("");
            }
        });
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNomeAluno.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo " + pessoa.toString(), Toast.LENGTH_LONG).show();

                controller.salvar(pessoa);

            }
        });

        Log.i("POOAndroid", "Obejto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Obejto outraPessoa: " + outraPessoa.toString());

    }
}