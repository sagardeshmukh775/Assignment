package com.example.smtrick.assignment.Views.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.smtrick.assignment.DatabaseHandler.DatabaseHandler;
import com.example.smtrick.assignment.Models.Data1;
import com.example.smtrick.assignment.Models.Example;
import com.example.smtrick.assignment.R;

import java.util.ArrayList;
import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.ViewHolder> {

    private Context context;
    private List<Data1> list;
    String Language;
    private int custom_position = 0;
    DatabaseHandler db;

    String item;


    public UsersAdapter(Context context, List<Data1> list) {
        this.context = context;
        this.list = list;

    }


    @Override
    public UsersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_adapter_layout, parent, false);
        UsersAdapter.ViewHolder viewHolder = new UsersAdapter.ViewHolder(v);
        //  context = parent.getContext();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final UsersAdapter.ViewHolder holder, final int position) {


        if (custom_position >= 4)
            custom_position = 0;

        final Data1 example = list.get(position);
        db = new DatabaseHandler(holder.layoutCard.getContext());

        if ((custom_position == 0)) {
            holder.layoutcolor.setBackgroundResource(R.color.color1);

            custom_position++;
        } else if ((custom_position == 1)) {
            holder.layoutcolor.setBackgroundResource(R.color.color2);

            custom_position++;
        } else if ((custom_position == 2)) {

            holder.layoutcolor.setBackgroundResource(R.color.color3);
            custom_position++;
        }
        holder.name.setText(example.getFName()+" "+ example.getMName()+" "+ example.getLName());
        holder.village.setText(example.getVillageName());
        holder.rout.setText(example.getRouteName());

        holder.layoutCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog1 = new Dialog(holder.layoutCard.getContext());
                dialog1.setContentView(R.layout.customdialogbox);

                Button dialogEditButton = (Button) dialog1.findViewById(R.id.dialogButtonOK);
                Button dialogEditButtoncancle = (Button) dialog1.findViewById(R.id.dialogButtonCancle);
                ImageView cancle = (ImageView) dialog1.findViewById(R.id.cancle);


                dialogEditButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Data1 data = new Data1();
                        data.setFName(String.valueOf(holder.name.getText()));
                        data.setVillageName(String.valueOf(holder.village.getText()));
                        data.setRouteName(String.valueOf(holder.rout.getText()));

                        Long result = db.insertUser(data);
                        Log.i("result :", String.valueOf(result));
                        Toast.makeText(holder.layoutCard.getContext(), "Registered successfully", Toast.LENGTH_SHORT).show();

                        dialog1.dismiss();
                    }
                });

                cancle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                    }
                });


                dialogEditButtoncancle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();

                    }
                });

                dialog1.show();
                Window window = dialog1.getWindow();
                window.setLayout(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name, village, rout;
        public LinearLayout layoutcolor,layoutCard;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.username_value);
            village = itemView.findViewById(R.id.village_value);
            rout = itemView.findViewById(R.id.rout_value);
            layoutcolor = itemView.findViewById(R.id.color);
            layoutCard = itemView.findViewById(R.id.card);
        }
    }

    public void reload(ArrayList<Data1> leedsModelArrayList) {
        list.clear();
        list.addAll(leedsModelArrayList);
        notifyDataSetChanged();
    }
}
