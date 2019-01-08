package e.wolfsoft1.uiuxlabecommerce_jp_30.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_30.R;
import e.wolfsoft1.uiuxlabecommerce_jp_30.model.Model_Jacket;

public class Jacket_Adapter extends RecyclerView.Adapter<Jacket_Adapter.MyJacketHolder> {

    private final ArrayList<Model_Jacket> model_jacketArrayList;
    private final Context context;

    public Jacket_Adapter(Context context, ArrayList<Model_Jacket> model_jacketArrayList) {
        this.model_jacketArrayList = model_jacketArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyJacketHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_jacket, viewGroup, false);
        return new MyJacketHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyJacketHolder myJacketHolder, int i) {
        myJacketHolder.jacket_image.setImageResource(model_jacketArrayList.get(i).getJacket_image());
        myJacketHolder.jacket_price.setText(model_jacketArrayList.get(i).getJacket_price());
        myJacketHolder.jacket_type.setText(model_jacketArrayList.get(i).getJacket_type());
        myJacketHolder.jacket_description.setText(model_jacketArrayList.get(i).getJacket_description());
    }

    @Override
    public int getItemCount() {
        return model_jacketArrayList.size();
    }

    class MyJacketHolder extends RecyclerView.ViewHolder {
        ImageView jacket_image;
        TextView jacket_price, jacket_type, jacket_description;

        public MyJacketHolder(@NonNull View itemView) {
            super(itemView);
            jacket_image = itemView.findViewById(R.id.jacket_image);
            jacket_price = itemView.findViewById(R.id.jacket_price);
            jacket_type = itemView.findViewById(R.id.jacket_type);
            jacket_description = itemView.findViewById(R.id.jacket_description);

        }

    }

}
