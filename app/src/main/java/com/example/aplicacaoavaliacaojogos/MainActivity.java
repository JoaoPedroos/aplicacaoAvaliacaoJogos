package com.example.aplicacaoavaliacaojogos;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView txtstatus;
    RatingBar rtbvotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtstatus = (TextView) findViewById(R.id.txtstatus);
        rtbvotacao = (RatingBar) findViewById(R.id.rtbvotacao);
        txtstatus.setText("Status: Ruim");

        rtbvotacao.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating <= 1.9)
                    txtstatus.setText("Status: Regular");
                else if(rating <= 2.9)
                    txtstatus.setText("Status: Bom");
                else if(rating <= 3.9)
                    txtstatus.setText("Status: Ótimo");
                else if(rating <= 4.9)
                    txtstatus.setText("Status: Excelente");
                else if(rating == 5)
                    txtstatus.setText("Status: Espetacular");
            }
        });


    }
}