package com.example.meu_projeto_com_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import models.User;

public class ListActivity extends AppCompatActivity {
    List<User> userList;

    @BindView(R.id.ListViewUser)
    protected ListView listViewUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent veioDeOutraTela = getIntent();
        userList = (ArrayList) veioDeOutraTela.getSerializableExtra("LISTA_USUARIOS");
        ArrayAdapter adapter = new ArrayAdapter<User>(this,android.R.layout.simple_list_item_1,userList);
        listViewUsers.setAdapter(adapter);
    }
}
