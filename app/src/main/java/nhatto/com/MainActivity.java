package nhatto.com;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import nhatto.com.adapter.CustomAdapter;
import nhatto.com.model.Contact;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact =(ListView)findViewById(R.id.lv_contact);

        ArrayList<Contact>arrayList = new ArrayList<>();

        Contact contact = new Contact(Color.CYAN,"Hoang Nhat To","0988 663 321");
        Contact contact1 = new Contact(Color.BLACK,"Hoang Thanh","0167 204 0892");
        Contact contact2 = new Contact(Color.GREEN,"Bui Van Thang","0164 988 999");
        Contact contact3 = new Contact(Color.YELLOW,"Bui Van Hau","0987 555 333");
        Contact contact4 = new Contact(Color.LTGRAY,"Bui Van Nguyen","0987 333 555");
        Contact contact5 = new Contact(Color.CYAN,"Bui Van Duan","0987 335 545");
        Contact contact6 = new Contact(Color.BLACK,"Bui Van Ngan","0987 339 553");
        Contact contact7 = new Contact(Color.YELLOW,"Bui Duc Hanh","0987 545 545");

        arrayList.add(contact);
        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_contact,arrayList);
        lvContact.setAdapter(customAdapter);
    }
}
