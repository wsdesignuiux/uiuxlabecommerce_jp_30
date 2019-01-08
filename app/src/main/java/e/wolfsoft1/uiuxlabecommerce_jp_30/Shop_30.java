package e.wolfsoft1.uiuxlabecommerce_jp_30;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_30.adapter.Jacket_Adapter;
import e.wolfsoft1.uiuxlabecommerce_jp_30.model.Model_Jacket;

public class Shop_30 extends AppCompatActivity {

    RecyclerView recyclerview_jacket;

    Integer jacket_image[] = {R.drawable.jacket1, R.drawable.jacket2, R.drawable.jacket3, R.drawable.jacket4, R.drawable.jacket5, R.drawable.jacket6};
    String jacket_price[] = {"$ 329", "$ 459", "$ 397", "$ 365", "$ 429", "$ 371"};
    String jacket_type[] = {"INFO & CARE", "Dorothy Perkins", "Dhoni Padded", "Olive Printed", "Tux Shrug", "Navy Blue"};
    String jacket_description[] = {"Keep it cool and stylish by wearing this black coloured jacket.", "Glamourous due to its floral lace construction, this black.", "Assured to lock you in warmth and comfort, this quilted black. ", "This green jacket with a camouflage print from Jack & Jones.", "Created in a relaxed silhouette, this black tuxedo shrug.", "Ensure yourself top-most level of comfort by getting."};

    ArrayList<Model_Jacket> model_jacketArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_30);

        recyclerview_jacket = findViewById(R.id.recyclerview_jacket);
        recyclerview_jacket.setNestedScrollingEnabled(false);

        model_jacketArrayList = new ArrayList<>();
        for (int i = 0; i < jacket_image.length; i++) {
            Model_Jacket model_jacket = new Model_Jacket(jacket_image[i], jacket_price[i], jacket_type[i], jacket_description[i]);
            model_jacketArrayList.add(model_jacket);
        }

        Jacket_Adapter jacket_adapter = new Jacket_Adapter(this, model_jacketArrayList);
        recyclerview_jacket.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerview_jacket.setAdapter(jacket_adapter);
    }
}
