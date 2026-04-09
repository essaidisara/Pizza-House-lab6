package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.adapter.PizzaAdapter;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle essBundle) {
        super.onCreate(essBundle);
        setContentView(R.layout.activity_list_pizza);

        ListView essListePizzas = findViewById(R.id.listePizzas);
        List<Produit> essCataloguePizzas = ProduitService.getInstance().findAll();

        PizzaAdapter essPizzaAdapter = new PizzaAdapter(this, essCataloguePizzas);
        essListePizzas.setAdapter(essPizzaAdapter);

        essListePizzas.setVerticalScrollBarEnabled(true);
        essListePizzas.setSmoothScrollbarEnabled(true);
        essListePizzas.setFastScrollEnabled(true);

        essListePizzas.setOnItemClickListener((essParent, essView, essPosition, essId) -> {
            Intent essIntentDetail = new Intent(ListPizzaActivity.this, PizzaDetailActivity.class);
            essIntentDetail.putExtra("pizza_id", essId);
            startActivity(essIntentDetail);
        });
    }
}