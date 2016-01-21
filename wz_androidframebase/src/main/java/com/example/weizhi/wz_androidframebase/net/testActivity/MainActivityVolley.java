package com.example.weizhi.wz_androidframebase.net.testActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.weizhi.wz_androidframebase.R;
import com.example.weizhi.wz_androidframebase.net.HttpURL;
import com.example.weizhi.wz_androidframebase.net.RequestManager;
import com.example.weizhi.wz_androidframebase.net.RequestParam;
import com.example.weizhi.wz_androidframebase.net.bean.newsComment;
import com.example.weizhi.wz_androidframebase.net.jsonparser.JsonParserBase;
import com.example.weizhi.wz_androidframebase.net.request.ObjectCommonRequest;

//import android.support.v7.app.AppCompatActivity;
//测试网址
//http://fabu.hylapp.com/mobile/index.php/news?areaid=43&curpage=1&page=10&token=c936ec2672ba04c6aa4f125831d61d4e
//InstrumentationTestCase
//新闻评论列表：http://www.taihuzc.com/mobile/index.php/news_comment?dynamic_id=310&token=

public class MainActivityVolley extends Activity {

    private Button m_obj_applyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_obj_applyBtn = (Button) this.findViewById(R.id.id_btn);
        m_obj_applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RequestParam param = new RequestParam();
                HttpURL url = new HttpURL();
                url.setmBaseUrl("http://www.taihuzc.com/mobile/index.php/news_comment?dynamic_id=310&token=");
                url.setmGetParamPrefix("dynamic_id").setmGetParamValues("310");
                url.setmGetParamPrefix("token");

                param.setmHttpURL(url);
                param.setM_c_request(ObjectCommonRequest.class);
                param.setM_c_bean_Class(newsComment.class);
                RequestManager.getRequestData(MainActivityVolley.this, new Response.Listener<Object>() {
                    @Override
                    public void onResponse(Object o) {
                        //Log.i("test", "-------- reponse data -----" + (String) o);
                        Log.i("test", "-------- MainActivityVolley message -------" + ((JsonParserBase<newsComment>) o).getMessage());
                        Object data = ((JsonParserBase<newsComment>) o).getData();
                        Log.i("test", "------- id -------" + ((JsonParserBase<newsComment>) o).getData().getNew_comment().get(0).getId());
                        Log.i("test", "------- Member_id -------" + ((JsonParserBase<newsComment>) o).getData().getNew_comment().get(0).getMember_id());
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        Log.i("test", "---------- reponse error --------" + volleyError.toString());
                    }
                }, param);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
