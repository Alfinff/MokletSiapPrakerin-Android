package id.sch.smktelkom_mlg.finall.xirpl1062239.mokletsiapprakerin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import id.sch.smktelkom_mlg.finall.xirpl1062239.mokletsiapprakerin.Model.Perusahaan;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DatabaseReference myref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myref = FirebaseDatabase.getInstance().getReference().child("/Perusahaan");

        FirebaseRecyclerAdapter<Perusahaan, PerusahaanViewHolder> recyclerAdapter = new FirebaseRecyclerAdapter<Perusahaan, PerusahaanViewHolder>(
                Perusahaan.class,
                R.layout.perusahaan_list,
                PerusahaanViewHolder.class,
                myref
        ) {
            @Override
            protected void populateViewHolder(PerusahaanViewHolder viewHolder, Perusahaan model, int position) {
                viewHolder.setNama(model.getNama());
                viewHolder.setAlamat(model.getAlamat());
            }
        };

        recyclerView.setAdapter(recyclerAdapter);

    }

    public static class PerusahaanViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView tvnama;
        TextView tvalamat;

        public PerusahaanViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            tvnama = itemView.findViewById(R.id.tvNama);
            tvalamat = itemView.findViewById(R.id.tvAlamat);
        }

        public void setNama(String nama) {
            tvnama.setText(nama);
        }

        public void setAlamat(String alamat) {
            tvalamat.setText(alamat);
        }
    }

}
