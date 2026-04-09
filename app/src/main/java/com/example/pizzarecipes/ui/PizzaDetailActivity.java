package com.example.pizzarecipes.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle essBundle) {
        super.onCreate(essBundle);
        setContentView(R.layout.activity_pizza_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Détail de la pizza");
        }

        long essPizzaId = getIntent().getLongExtra("pizza_id", -1);
        Produit essProduit = ProduitService.getInstance().findById(essPizzaId);

        ImageView essImageDetail = findViewById(R.id.imageDetail);
        TextView essTitreDetail = findViewById(R.id.titreDetail);
        TextView essMetaDetail = findViewById(R.id.metaDetail);
        TextView essIngredientsDetail = findViewById(R.id.ingredientsDetail);
        TextView essDescriptionDetail = findViewById(R.id.descriptionDetail);
        TextView essEtapesDetail = findViewById(R.id.etapesDetail);

        if (essProduit != null) {
            essImageDetail.setImageResource(essProduit.getEssImagePizza());
            essTitreDetail.setText(essProduit.getEssTitrePizza());
            essMetaDetail.setText(essProduit.getEssTempsCuisson() + " • " + essProduit.getEssTarifPizza() + " €");
            essIngredientsDetail.setText(essProduit.getEssListeIngredients());
            essDescriptionDetail.setText(essProduit.getEssResumePizza());
            essEtapesDetail.setText(essProduit.getEssEtapesPreparation());
        } else {
            essTitreDetail.setText("Pizza introuvable");
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem essItem) {
        if (essItem.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(essItem);
    }
}