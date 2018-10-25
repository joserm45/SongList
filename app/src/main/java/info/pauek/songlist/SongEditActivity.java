package info.pauek.songlist;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SongEditActivity extends AppCompatActivity {

    private TextView edit_title;
    private EditText edit_text_title;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_edit);
        edit_title = findViewById(R.id.edit_title);
        edit_text_title = findViewById(R.id.editTextTitle);
        TextView edit_ban = findViewById(R.id.edit_band);
        EditText edit_text_band = findViewById(R.id.editTextBand);
        TextView edit_year = findViewById(R.id.edit_year);
        EditText edit_text_title = findViewById(R.id.editTextYear);

    }

    /*public void on(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.)
                .setMessage(R.string.)
                .setPositiveButton(R.string. , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SongEditActivity.this, "", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(android.R.string.cancel, null);

        builder.create().show();
    }*/
}
