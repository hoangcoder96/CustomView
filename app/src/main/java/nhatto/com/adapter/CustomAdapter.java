package nhatto.com.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import nhatto.com.R;
import nhatto.com.model.Contact;

/**
 * Created by User name on 12/04/2017.
 */

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;

    private final String TAG = getClass().getSimpleName();
    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrContact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact,parent,false);

            viewHolder = new ViewHolder();
            viewHolder.tvColor = (TextView)convertView.findViewById(R.id.tv_color);
            viewHolder.tvNme = (TextView)convertView.findViewById(R.id.tv_name);
            viewHolder.tvNumber = (TextView)convertView.findViewById(R.id.tv_number);
            convertView.setTag(viewHolder);
            Log.d(TAG,"getView:"+(position+1));
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        Contact contact = arrContact.get(position);
        viewHolder.tvColor.setBackgroundColor(contact.getmColor());
        viewHolder.tvColor.setText((position+1)+"");
        viewHolder.tvNme.setText(contact.getmName());
        viewHolder.tvNumber.setText(contact.getmNumber());


        return convertView;
    }

    public class ViewHolder{
        TextView tvColor;
        TextView tvNme;
        TextView tvNumber;
    }
}
