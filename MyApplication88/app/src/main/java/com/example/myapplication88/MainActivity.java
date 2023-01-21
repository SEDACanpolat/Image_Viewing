package com.example.myapplication88;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    Button button8; //Butona buton8 diye değer atadım.
    ImageView görsel; //ImageView e görsel diye değer atadım.
    EditText metinDüzenleme; //EditText e metinDüzenleme diye değer atadım.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Kod çalışmaya başladığında oluşturulan ilk metoddur.
        setContentView(R.layout.activity_main);
        görsel =(ImageView) findViewById(R.id.görsel4); /*görsel4 olarak atadığım değeri  res dosyasından id
        görsel4 şeklinde kolayca kod kısmından bulunmasını sağladım.*/
        button8=(Button) findViewById(R.id.button8); /*Button8 olarak atadığım degeri res dosyasından id görsel4
         şeklinde kolayca kod kısmından bulunmasını sağladım*/
        metinDüzenleme=findViewById(R.id.girdi6); /*metinDüzenleme olarak atadığım değeri  res dosyasından id girdi6
         şeklinde kolayca kod kısmından bulunmasını sağladım.*/
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//onClick butona tıklamyı sağlar.
                String girdi = metinDüzenleme.getText().toString(); //String değerinde girdi girdik.
                if (girdi.equals("draco")){  //Girilen değer draco ya eşit ise
                    //Equals() methodu nesnenin içerdiği string'i karşılaştırır (Equals=Eşit).
                    görsel.setImageResource(R.drawable.draco);/* görsel dosyasından drawable kısmından
            draco resmini getirdik.*/
                }
                else if (girdi.equals("harry")){ // İlk if bloğu sağlanmadıysa else if bloğuna gir
                    //girilen string değeri harry ise görseli getirir.
                    görsel.setImageResource(R.drawable.harry);
                }
                else if (girdi.equals("hermonie")){  // İlk if bloğu doğrulanmadıysa ve diğer else if bloğu
                    //doğrulanmadıysa  else if bloğuna gir girilen string değeri
                    // hermonie ise görseli getirir.
                    görsel.setImageResource(R.drawable.hermonie);
                }
                else  {/*Yukarıdaki blokların hiçbiri sağlanmazsa kodun gireceği blok else blogudur..*/
                    görsel.setImageResource(R.drawable.error);
                }

            }
        });
    }
}




