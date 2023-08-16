package devandroid.bitan.appgaseta.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.bitan.appgaseta.R;
import devandroid.bitan.appgaseta.apoio.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity {

    //UtilGasEta utilGasEta = new UtilGasEta();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gaseta);

        //utilGasEta.metodoEstatico();

        //UtilGasEta.metodoNaoEstatico();

        Toast.makeText(GasEtaActivity.this, UtilGasEta.mensagem(),
                Toast.LENGTH_LONG).show();
    }
}
