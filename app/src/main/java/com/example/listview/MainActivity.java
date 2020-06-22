package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] data = {"小熊","dfsfs","fsfd","fsdafsdf","fsfefrrt",
            "法国","德国","阿尔巴尼亚","意大利","fsdfdsf","罗马尼亚","俄罗斯","塞尔维亚","西班牙",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 数组中的数据无法直接传递给ListView，需要适配器完成
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_expandable_list_item_1,data);

        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
