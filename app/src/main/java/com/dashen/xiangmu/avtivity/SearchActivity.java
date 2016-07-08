package com.dashen.xiangmu.avtivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.activeandroid.query.Select;
import com.dashen.xiangmu.R;
import com.dashen.xiangmu.bean.HistoryEntity;
import com.dashen.xiangmu.utils.MySqliteHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchActivity extends AppCompatActivity {

    private EditText editIndexMain;
    private TextView textSearch;
    private ImageView imageIndexCancel;
    private GridView gvHotSearch;

    private MySqliteHelper helper = new MySqliteHelper(this);;
    private SQLiteDatabase db;

    //定义gridview的数据源
    private String[] data = new String[]{
            "雪纺衫","牛仔短裤","泳衣",
            "风扇","凉席","防晒衣",
            "安全裤","凉鞋","沙发垫",
            "空调","牛仔裤","双肩包"
    };
    private ArrayAdapter<String> arrayAdapter;
    private ListView lvLiShiJiLu;
    private List<String> listJiLu;
    private BaseAdapter lvAdapter;
    private TextView textCLear;
    //创建本地sqlite数据库存储搜索历史记录

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editIndexMain = ((EditText) findViewById(R.id.edit_index_main));
        textSearch = ((TextView) findViewById(R.id.text_search));
        imageIndexCancel = ((ImageView) findViewById(R.id.image_index_cancel));
        gvHotSearch = ((GridView) findViewById(R.id.gv_hot_search));
        lvLiShiJiLu = ((ListView) findViewById(R.id.lv_lishijilu));
        textCLear = ((TextView) findViewById(R.id.text_clear));

        arrayAdapter = new ArrayAdapter<String>(this,R.layout.item_gv_hot_search,data);
        gvHotSearch.setAdapter(arrayAdapter);

        // 清空搜索历史
        textCLear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteData();
                queryData("");
            }
        });

        //对右边的textview设置监听
        textSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textSearch.getText().toString();
                if (s.equals("取消")){
                    onBackPressed();
                }else {
                    boolean hasData = hasData(editIndexMain.getText().toString().trim());
                    if (!hasData) {
                        insertData(editIndexMain.getText().toString().trim());
                        queryData("");
                    }
                    Toast.makeText(SearchActivity.this, "跳转搜索内容页面，搜索"+editIndexMain.getText().toString(), Toast.LENGTH_SHORT).show();

                }

            }
        });
        imageIndexCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        //对edittext中右边删除图片进行监听
        editIndexMain.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // et.getCompoundDrawables()得到一个长度为4的数组，分别表示左右上下四张图片
                Drawable drawable = editIndexMain.getCompoundDrawables()[2];
                //如果右边没有图片，不再处理
                if (drawable == null)
                    return false;
                //如果不是按下事件，不再处理
                if (event.getAction() != MotionEvent.ACTION_UP)
                    return false;
                if (event.getX() > editIndexMain.getWidth()
                        - editIndexMain.getPaddingRight()
                        - drawable.getIntrinsicWidth()){
                    editIndexMain.setText("");
                }
                return false;
            }
        });

        //设置监听处理 edittext 右边是显示取消 还是显示 搜索
        editIndexMain.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // 第一次进入查询所有的历史记录
                queryData("");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length()>0){
                    textSearch.setText("搜索");
                }else {
                    textSearch.setText("取消");
                }
                String tempName = editIndexMain.getText().toString();
                // 根据tempName去模糊查询数据库中有没有数据
                queryData(tempName);
            }
        });

        // 搜索框的键盘搜索键点击回调
        editIndexMain.setOnKeyListener(new View.OnKeyListener() {// 输入完后按键盘上的搜索键

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_DOWN) {// 修改回车键功能
                    // 先隐藏键盘
                    ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(
                            getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                    // 按完搜索键后将当前查询的关键字保存起来,如果该关键字已经存在就不执行保存
                    boolean hasData = hasData(editIndexMain.getText().toString().trim());
                    if (!hasData) {
                        insertData(editIndexMain.getText().toString().trim());
                        queryData("");
                    }
                    // TODO 根据输入的内容模糊查询商品，并跳转到另一个界面，由你自己去实现
                    Toast.makeText(SearchActivity.this, "点击了输入法的搜索,搜索"+editIndexMain.getText().toString(), Toast.LENGTH_SHORT).show();

                }
                return false;
            }
        });
        lvLiShiJiLu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view.findViewById(android.R.id.text1);
                String name = textView.getText().toString();
                editIndexMain.setText(name);
                Toast.makeText(SearchActivity.this,"点击了："+ name, Toast.LENGTH_SHORT).show();
                // TODO 获取到item上面的文字，根据该关键字跳转到另一个页面查询，由自己去实现
            }
        });

    }


    /** * 插入数据 */
    private void insertData(String tempName) {
        db = helper.getWritableDatabase();
        db.execSQL("insert into records(name) values('" + tempName + "')");
        db.close();
    }
    /** * 模糊查询数据 */
    private void queryData(String tempName) {
        Cursor cursor = helper.getReadableDatabase().rawQuery(
                "select id as _id,name from records where name like '%" + tempName + "%' order by id desc ", null);
        // 创建adapter适配器对象
        lvAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, cursor, new String[] { "name" },
                new int[] { android.R.id.text1 }, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
        // 设置适配器
        lvLiShiJiLu.setAdapter(lvAdapter);
        lvAdapter.notifyDataSetChanged();
    }
    /** * 检查数据库中是否已经有该条记录 */
    private boolean hasData(String tempName) {
        Cursor cursor = helper.getReadableDatabase().rawQuery(
                "select id as _id,name from records where name =?", new String[]{tempName});
        //判断是否有下一个
        return cursor.moveToNext();
    }

    /** * 清空数据 */
    private void deleteData() {
        db = helper.getWritableDatabase();
        db.execSQL("delete from records");
        db.close();
    }

}
