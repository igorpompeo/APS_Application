package uam.com.br.aps_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GeraisActivity extends AppCompatActivity {

    private Button botaoPreco, botaoAlimentacao, botaoLocalizacao;
    private TextView txtVisual;
    private ImageView imagemVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerais);

        botaoPreco = findViewById(R.id.btnPreco);
        botaoAlimentacao = findViewById(R.id.btnFood);
        botaoLocalizacao = findViewById(R.id.btnLocalizacao);
        imagemVoltar = findViewById(R.id.imgVoltar);
        txtVisual = findViewById(R.id.txtVisual);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra("Local");

        txtVisual.setText(mensagem);
    }
}
