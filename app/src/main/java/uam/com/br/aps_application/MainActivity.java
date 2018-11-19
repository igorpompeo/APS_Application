package uam.com.br.aps_application;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campoPesquisar;
    private Button botaoPesquisar;
    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoPesquisar = findViewById(R.id.btnPesquisar);
        campoPesquisar = findViewById(R.id.campoPesquisar);
        // Caixa de diálogo
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Campo Vazio!");
        builder.setMessage("Deixou o campo texto vazio, favor preencher!");
        builder.setPositiveButton("OK!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "OK!", Toast.LENGTH_SHORT).show();
            }
        });
        // Criação da caixa de diálogo
        alerta = builder.create();

        botaoPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!campoPesquisar.getText().toString().equals("")) {
                    Intent intent = new Intent(getApplicationContext(), GeraisActivity.class);
                    intent.putExtra("Local",campoPesquisar.getText().toString());
                    startActivity(intent);
                }
                else {
                    // Exibição da caixa de diálogo
                    alerta.show();
                }
            }
        });

    }
}
