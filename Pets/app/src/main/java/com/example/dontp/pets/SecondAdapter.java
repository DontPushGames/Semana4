package com.example.dontp.pets;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.PetsViewHolder> {
    private List<Pets2> mascotaCard;

    public static class PetsViewHolder extends RecyclerView.ViewHolder {

        public ImageView mascotaPicture;
        public TextView likesText;
        public ImageView likeIcon;


        public PetsViewHolder(View v) {
            super(v);
            mascotaPicture = (ImageView) v.findViewById(R.id.mascotaCircularPicture);
            likesText = (TextView) v.findViewById(R.id.likesText3);
            likeIcon = (ImageView) v.findViewById(R.id.like_icon3);

        }
    }

    public SecondAdapter(List<Pets2> mascotaCard) {
        this.mascotaCard = mascotaCard;
    }

    @Override
    public int getItemCount() {
        return mascotaCard.size();
    }

    @Override
    public PetsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.pet_card_model3, viewGroup, false);
        return new PetsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final PetsViewHolder viewHolder, int i) {
        viewHolder.mascotaPicture.setImageResource(mascotaCard.get(i).getMascotasId());
        viewHolder.likesText.setText(String.valueOf(mascotaCard.get(i).getMascotasLike()));
        viewHolder.likeIcon.setTag(viewHolder);

        viewHolder.likeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PetsViewHolder likeAmount = (PetsViewHolder) v.getTag();
                likeAmount.likesText.setText(String.valueOf(1 + Integer.parseInt(likeAmount.likesText.getText().toString())));

            }
        });
    }
}
