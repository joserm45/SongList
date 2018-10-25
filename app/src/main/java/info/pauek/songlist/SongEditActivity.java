package info.pauek.songlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SongEditActivity extends AppCompatActivity {

    private EditText edit_text_title;
    private EditText edit_text_band;
    private EditText edit_text_year;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_edit);
        edit_text_title = findViewById(R.id.editTextTitle);
        edit_text_band = findViewById(R.id.editTextBand);
        edit_text_year = findViewById(R.id.editTextYear);
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
