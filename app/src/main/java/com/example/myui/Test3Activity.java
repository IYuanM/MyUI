package com.example.myui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//  目前遇到的问题就是，图片一加布局全乱了，想办法控制它。问题解决主要由于自己没有规定好图片的大小
public class Test3Activity extends AppCompatActivity {
    private String[] names=new String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int[] imagesIds =new int[]{R.drawable.lion,
            R.drawable.tiger,
            R.drawable.monkey,
            R.drawable.dog,
            R.drawable.cat,
            R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3linear_my);
        List<Map<String,Object>> listItems=new ArrayList<>();
        for(int i=0;i<names.length;i++){
            Map<String,Object> listItem=new HashMap<>();
            listItem.put("header",imagesIds[i]);
            listItem.put("name",names[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listItems,R.layout.test3simple_item,
                new String[]{"name","header"},new int[]{R.id.name,R.id.header});
        ListView listView=findViewById(R.id.mylist);
        listView.setAdapter(simpleAdapter);
        //这个点击事件很好用。
        listView.setOnItemClickListener((parent, view, position, id) ->{
            Toast toast=Toast.makeText(Test3Activity.this,names[position],Toast.LENGTH_SHORT);
            toast.show();
        });
//        listView.setOnItemClickListener((parent, view, position, id) -> {
//            Log.i("-CRAZYIT-", names[position] + "被单击了");
//        });
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){public void
//        onItemClick(AdapterView<?> adapterView, View item,int position,long time){
//            item.setBackgroundColor(Color.GREEN);
//        })});
    }
}


