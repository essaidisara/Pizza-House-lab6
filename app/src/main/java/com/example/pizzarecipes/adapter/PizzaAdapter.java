package com.example.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;
import java.util.Locale;

public class PizzaAdapter extends BaseAdapter {

    private final Context essContexte;
    private final List<Produit> essListePizzas;

    public PizzaAdapter(Context essContexte, List<Produit> essListePizzas) {
        this.essContexte = essContexte;
        this.essListePizzas = essListePizzas;
    }

    @Override
    public int getCount() {
        return essListePizzas.size();
    }

    @Override
    public Object getItem(int essPosition) {
        return essListePizzas.get(essPosition);
    }

    @Override
    public long getItemId(int essPosition) {
        return essListePizzas.get(essPosition).getEssIdentifiant();
    }

    @Override
    public View getView(int essPosition, View essVueRecyclee, ViewGroup essParent) {
        if (essVueRecyclee == null) {
            essVueRecyclee = LayoutInflater.from(essContexte).inflate(R.layout.row_pizza, essParent, false);
        }

        ImageView essImagePizza = essVueRecyclee.findViewById(R.id.imagePizzaItem);
        TextView essNomPizza = essVueRecyclee.findViewById(R.id.nomPizzaItem);
        TextView essInfosPizza = essVueRecyclee.findViewById(R.id.infosPizzaItem);
        TextView essPrixPizza = essVueRecyclee.findViewById(R.id.prixPizzaItem);

        Produit essProduitActuel = essListePizzas.get(essPosition);

        essImagePizza.setImageResource(essProduitActuel.getEssImagePizza());
        essNomPizza.setText(essProduitActuel.getEssTitrePizza());
        essInfosPizza.setText(essProduitActuel.getEssTempsCuisson());
        essPrixPizza.setText(String.format(Locale.getDefault(), "%.2f €", essProduitActuel.getEssTarifPizza()));

        return essVueRecyclee;
    }
}