package com.utng.aquintero.prototype2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PlacesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listPlaces;

    private Category[] places = {
            new Category(R.drawable.barrafina, "Parroquia de nuestra señora de los Dolores"),
            new Category(R.drawable.bourkestreetbakery, "Saleta"),
            new Category(R.drawable.cafedeadend, "Santa Teresita del niño Jesus"),
            new Category(R.drawable.cafeloisl, "Tercera Orden"),
            new Category(R.drawable.cafelore, "Asuncion")
    };

    private GridView grvPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        grvPlaces = findViewById(R.id.gvr_places);
        PlacesActivity.RestaurantAdapter adapter = new PlacesActivity.RestaurantAdapter( this,places);
        grvPlaces.setAdapter(adapter);
        grvPlaces.setOnItemClickListener(this);
        listPlaces = (ListView)findViewById(R.id.lv01);
    }

    public void galeryActivity(View view){
        startActivity(new Intent(this, InfoActivity.class));
        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String selectedOption=((Category)adapterView.getItemAtPosition(i)).getName();
        Toast.makeText(this, "You selected: " +selectedOption, Toast.LENGTH_SHORT).show();

    }

    static  class ViewHolder{
        TextView txvName;
        ImageView imvPhoto;
    }


    class RestaurantAdapter extends ArrayAdapter<Category> {
        public RestaurantAdapter(@NonNull Context context, Category[] data){
            super (context, R.layout.cell_places,data);
        }

        @NonNull
        @Override

        public View getView(int position, @NonNull  View convertView, @NonNull ViewGroup parent){
            View cell = convertView;
            CategoryActivity.ViewHolder holder;
            if(cell == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell= inflater.inflate(R.layout.cell_places, null);

                holder = new CategoryActivity.ViewHolder();
                holder.imvPhoto= cell.findViewById(R.id.imv_thumbnail_place);
                holder.txvName = cell.findViewById(R.id.txv_name);

                cell.setTag(holder);

            }else{
                holder=(CategoryActivity.ViewHolder) cell.getTag();
            }

            holder.imvPhoto.setImageResource(places[position].getImageId());
            holder.txvName.setText(places[position].getName());
            return cell;
        }


    }


}
