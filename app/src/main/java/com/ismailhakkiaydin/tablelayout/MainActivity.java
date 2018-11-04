package com.ismailhakkiaydin.tablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    /*private TableLayout tl;
    private TableRow tr;
    private Button btn;

    private void init(){

        tl = new TableLayout(this);
        for (int i = 1; i<6; i++){
            tr = new TableRow(this);
            for(int j=1; j<5; j++){
                btn = new Button(this);
                btn.setText( i +" , "+j);
                btn.setWidth(150);
                btn.setHeight(60);
                tr.addView(btn);
            }
            tl.addView(tr);
        }

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       /* init();
        setContentView(tl);

        TableRow row = (TableRow) tl.getChildAt(2);
        ((Button) row.getChildAt(1)).setBackgroundColor(Color.GREEN);
*/
       TableLayout pnl = new TableLayout(this);
       TableRow tr = new TableRow(this);
       Button btn = new Button(this);
       btn.setText("Deneme");


        TableRow.LayoutParams trprms = new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,90);
        trprms.column=0;
        trprms.gravity=Gravity.LEFT;
        trprms.span=1;
        btn.setLayoutParams(trprms);
        tr.addView(btn);
        pnl.addView(tr);
        setContentView(pnl);

    }
}
