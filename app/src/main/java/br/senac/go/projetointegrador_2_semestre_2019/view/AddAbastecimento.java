package br.senac.go.projetointegrador_2_semestre_2019.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.senac.go.projetointegrador_2_semestre_2019.R;

public class AddAbastecimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_abastecimento);
        setTitle("Adicionar abastecimento");
        addListenerOnButton();
    }

    private void addListenerOnButton() {


    }


}
