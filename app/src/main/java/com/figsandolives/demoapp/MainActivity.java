package com.figsandolives.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button mSendButton;
    private EditText mInputBox;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSendButton = (Button) findViewById(R.id.send_button);
        mInputBox = (EditText) findViewById(R.id.input_box);
        mListView = (ListView) findViewById(R.id.list);

        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mInputBox.setText("");

            }
        });

        ArrayList<String> items = new ArrayList<>();
        items.add("Welcome");
        items.add("to");
        items.add("MIT");
        items.add("Samhita");
        items.add("by");
        items.add("Figs");
        items.add("and");
        items.add("Olives");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        mListView.setAdapter(adapter);
    }
}
