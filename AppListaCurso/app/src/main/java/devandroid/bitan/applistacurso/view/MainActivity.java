package devandroid.bitan.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.bitan.applistacurso.R;
import devandroid.bitan.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity  {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa=new Pessoa();
        pessoa.setPrimeiroNome("Will");
        pessoa.setSobreNome("Araújo");
        pessoa.setCursoDesejado("ADS");
        pessoa.setTelefoneContato("43 93505-1177");

        outraPessoa=new Pessoa();
        outraPessoa.setPrimeiroNome("Patrykc");
        outraPessoa.setSobreNome("Gonçalves");
        outraPessoa.setCursoDesejado("Android");
        outraPessoa.setTelefoneContato("43 93505-9758");

        dadosPessoa="Primeiro nome: ";
        dadosPessoa+=pessoa.getPrimeiroNome();
        dadosPessoa+=" Sobenome: ";
        dadosPessoa+=pessoa.getSobreNome();
        dadosPessoa+=" Curso Desejado: ";
        dadosPessoa+=pessoa.getCursoDesejado();
        dadosPessoa+=" Telefone de Contato: ";
        dadosPessoa+=pessoa.getTelefoneContato();

        dadosOutraPessoa="Primeiro nome: ";
        dadosOutraPessoa+=outraPessoa.getPrimeiroNome();
        dadosOutraPessoa+=" Sobenome: ";
        dadosOutraPessoa+=outraPessoa.getSobreNome();
        dadosOutraPessoa+=" Curso Desejado: ";
        dadosOutraPessoa+=outraPessoa.getCursoDesejado();
        dadosOutraPessoa+=" Telefone de Contato: ";
        dadosOutraPessoa+=outraPessoa.getTelefoneContato();

    }
}