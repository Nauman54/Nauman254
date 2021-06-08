package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Adapter.RecyclerViewAdapter;
import com.example.recyclerview.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Student> studentList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        studentList.add(new Student("Nauman Ahmed","191169"));
        studentList.add(new Student("Afaq Ahmed","191085"));
        studentList.add(new Student("Umar Ateeq","191091"));
        studentList.add(new Student("Ubaid Zahoor","191154"));
        studentList.add(new Student("Aliyan Siddiqui","191196"));

        recyclerViewAdapter = new RecyclerViewAdapter(studentList,MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}