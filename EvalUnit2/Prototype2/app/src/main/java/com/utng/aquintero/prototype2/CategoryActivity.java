package com.utng.aquintero.prototype2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
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

public class CategoryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listCategories;

    private Category[] categories = {
            new Category(R.drawable.vinedos, "Viñedos"),
            new Category(R.drawable.museos, "Museos"),
            new Category(R.drawable.iglesias, "Iglesias"),
            new Category(R.drawable.artesanias, "Artesanias"),
            new Category(R.drawable.cafelore, "Otros")
    };


    private GridView grvCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        grvCategory = findViewById(R.id.gvr_category);
        RestaurantAdapter adapter = new RestaurantAdapter( this, categories);
        grvCategory.setAdapter(adapter);
        grvCategory.setOnItemClickListener(this);
        listCategories = (ListView)findViewById(R.id.lv01);
    }

    public void categoryActivity(View view){
        startActivity(new Intent(this, PlacesActivity.class));
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
            super (context, R.layout.cell_category,data);
        }

        @NonNull
        @Override

        public View getView(int position, @NonNull  View convertView, @NonNull ViewGroup parent){
            View cell = convertView;
            ViewHolder holder;
            if(cell == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell= inflater.inflate(R.layout.cell_category, null);

                holder = new ViewHolder();
                holder.imvPhoto= cell.findViewById(R.id.imv_thumbnail);
                holder.txvName = cell.findViewById(R.id.txv_name);

                cell.setTag(holder);

            }else{
                holder=(ViewHolder) cell.getTag();
            }

            holder.imvPhoto.setImageResource(categories[position].getImageId());
            holder.txvName.setText(categories[position].getName());
            return cell;
        }


    }
}
