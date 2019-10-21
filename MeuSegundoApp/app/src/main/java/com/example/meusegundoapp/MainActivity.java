package com.example.meusegundoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private EditText etNum1, etNum2;
    private TextView resultado;
    private Button btnSomar;
    @BindView(R.id.btnSubt)
    protected Button btnSubt;
    @BindView(R.id.btnMultiplicar)
    protected Button btnMultiplicar;
    @BindView(R.id.btnDividir)
    protected Button btnDividir;

    @OnClick(R.id.btnSubt)
    void subtrair(View view){
        double n1, n2;
        try {
            n1 = Double.parseDouble(etNum1.getText().toString());
            n2 = Double.parseDouble(etNum2.getText().toString());
            resultado.setText("Resultado: " + (n1-n2));
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Inserir os operandos", Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btnMultiplicar)
    void multiplicar(View view){
        double n1, n2;
        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        resultado.setText("Resultado: " + (n1*n2));
    }

    @OnClick(R.id.btnDividir)
    void dividir(View view){
        double n1, n2;
        n1 = Double.parseDouble(etNum1.getText().toString());
        n2 = Double.parseDouble(etNum2.getText().toString());
        resultado.setText("Resultado: " + (n1/n2));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        etNum1 = (EditText) findViewById(R.id.etPrimeiroNumero);
        etNum2 = (EditText) findViewById(R.id.etSegundoNumero);
        resultado = (TextView) findViewById(R.id.tvResultado);
        btnSomar = (Button) findViewById(R.id.btnSomar);
        // Maneira mais comprida de fazer o click do botão
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2;
                n1 = Double.parseDouble(etNum1.getText().toString());
                n2 = Double.parseDouble(etNum2.getText().toString());
                resultado.setText("Resultado: " + (n1+n2));
            }
        });
    }
}
