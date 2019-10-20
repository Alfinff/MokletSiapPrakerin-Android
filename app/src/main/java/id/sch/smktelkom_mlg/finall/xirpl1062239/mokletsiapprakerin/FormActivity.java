package id.sch.smktelkom_mlg.finall.xirpl1062239.mokletsiapprakerin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import id.sch.smktelkom_mlg.finall.xirpl1062239.mokletsiapprakerin.Model.Form;

/**
 * Created by Alfin Febrianto on 08/04/2018.
 */

public class FormActivity extends AppCompatActivity {

    EditText etnama, etnis, etalamat, ettelp, etemail, p1, p2;
    Spinner spkelas, sptipe;
    Button buttonAdd, btnPerusahaan;

    DatabaseReference databaseForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_page);

        etnama = findViewById(R.id.et_nama);
        etnis = findViewById(R.id.et_nis);
        etalamat = findViewById(R.id.et_alamat);
        ettelp = findViewById(R.id.et_telp);
        etemail = findViewById(R.id.et_email);
        spkelas = findViewById(R.id.sp_kelas);
        sptipe = findViewById(R.id.sp_tipe);
        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        buttonAdd = findViewById(R.id.buttonAdd);
        btnPerusahaan = findViewById(R.id.buttonPerusahaan);

        databaseForm = FirebaseDatabase.getInstance().getReference("Form");

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addData();
            }
        });

        btnPerusahaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kePerusahaan();
            }
        });
    }

    private void kePerusahaan() {
        startActivity(new Intent(FormActivity.this, MainActivity.class));
    }


    private void addData() {
        String nama = etnama.getText().toString().trim();
        String nis = etnis.getText().toString().trim();
        String alamat = etalamat.getText().toString().trim();
        String telp = ettelp.getText().toString().trim();
        String email = etemail.getText().toString().trim();
        String kelas = spkelas.getSelectedItem().toString().trim();
        String tipe = sptipe.getSelectedItem().toString().trim();
        String perusahaan1 = p1.getText().toString().trim();
        String perusahaan2 = p2.getText().toString().trim();

        if (TextUtils.isEmpty(nama)) {
            Toast.makeText(this, "Isi Data Nama", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(nis)) {
            Toast.makeText(this, "Isi Data NIS", Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(alamat)) {
            Toast.makeText(this, "Isi Data Alamat", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(telp)) {
            Toast.makeText(this, "Isi Data Telepon", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Isi Data Email", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(kelas)) {
            Toast.makeText(this, "Pilih Kelas", Toast.LENGTH_LONG).show();
        }  else if (TextUtils.isEmpty(tipe)) {
            Toast.makeText(this, "Pilih Tipe Perusahaan", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(perusahaan1)) {
            Toast.makeText(this, "Pilih Perusahaan Yang Diajukan Pertama", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(perusahaan2)) {
            Toast.makeText(this, "Pilih Perusahaan Yang Diajukan Kedua", Toast.LENGTH_LONG).show();
        } else {
            String uid = databaseForm.push().getKey();

            Form form = new Form(uid, nama, nis, alamat, telp, email, kelas, tipe, perusahaan1, perusahaan2);

            databaseForm.child(uid).setValue(form);

            Toast.makeText(this, "Form Telah Terkirim ... ", Toast.LENGTH_LONG).show();
        }

    }

}
