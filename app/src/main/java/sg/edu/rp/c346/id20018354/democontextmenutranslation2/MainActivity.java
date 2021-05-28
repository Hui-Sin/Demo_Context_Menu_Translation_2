package sg.edu.rp.c346.id20018354.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText=findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main,menu);

    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
       if(item.getItemId()==R.id.EnglishSelection){
           tvTranslatedText.setText("Hello ");
           return true;
       } else if (item.getItemId() == R.id.ItalianSelection) {
           tvTranslatedText.setText("Ciao");
           return true;
       }else if (item.getItemId() == R.id.FrenchSelection) {
           tvTranslatedText.setText("Bonjour");
           return true;
       }else if (item.getItemId() == R.id.JapaneseSelection) {
           tvTranslatedText.setText("こんにちは");
           return true;
       }else if (item.getItemId() == R.id.KoreanSelection) {
           tvTranslatedText.setText("안녕하세요");
           return true;
       }else if (item.getItemId() == R.id.ChineseSelection) {
           tvTranslatedText.setText("你好");
           return true;
       } else {
           tvTranslatedText.setText("Error translation");
       }

        return super.onContextItemSelected(item);
    }

}