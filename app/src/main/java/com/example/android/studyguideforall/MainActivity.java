package com.example.android.studyguideforall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(questions, this));
    }

    private void initialData() {
        questions = new ArrayList<>();
        questions.add(new Question(R.string.puerto_rico, R.string.question_puerto_rico, R.drawable.puertorico, true));
        questions.add(new Question(R.string.spain, R.string.question_spain, R.drawable.spain, false));
        questions.add(new Question(R.string.south_america, R.string.question_south_america, R.drawable.southamerica, false));
        questions.add(new Question(R.string.africa, R.string.question_africa, R.drawable.africa, true));
        questions.add(new Question(R.string.united_states, R.string.question_US, R.drawable.unitedstates, true));


    }
}
