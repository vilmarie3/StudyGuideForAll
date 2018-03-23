/**
 * Created by vilmarietaraza on 3/20/18.
 */
package com.example.android.studyguideforall;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView countryTitle;
    public TextView countryQuestion;
    public ImageView countryImage;
    public boolean isTrue;


    public QuestionViewHolder(View itemView, final Context context) {
        super(itemView);

        cardView = (CardView) itemView.findViewById(R.id.card_view);
        countryTitle = (TextView) itemView.findViewById(R.id.country_title);
        countryQuestion = (TextView) itemView.findViewById(R.id.country_question);
        countryImage = (ImageView) itemView.findViewById(R.id.country_image);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int messageResId = 0;

                if (isTrue) {
                    messageResId = R.string.true_toast;
                } else {
                    messageResId = R.string.false_toast;
                }

                Toast.makeText(context, messageResId, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
