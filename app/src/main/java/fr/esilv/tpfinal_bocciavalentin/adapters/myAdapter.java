package fr.esilv.tpfinal_bocciavalentin.adapters;


        import android.app.AlertDialog;
        import android.support.v7.widget.RecyclerView;
        import android.util.Pair;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import java.util.Arrays;
        import java.util.List;

        import fr.esilv.tpfinal_bocciavalentin.R;
        import fr.esilv.tpfinal_bocciavalentin.models.Videoybs;
        import fr.esilv.tpfinal_bocciavalentin.interfaces.OnVideoytSelectedListener;
        import fr.esilv.tpfinal_bocciavalentin.models.Videoybs;
        import fr.esilv.tpfinal_bocciavalentin.viewholders.VideoytViewHolder;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {


    private OnVideoytSelectedListener onContractSelectedListener;
    private final List<Pair<String, String>> characters = Arrays.asList(
            Pair.create("Ariana Grande - Side To Side ft. Nicki Minaj", "Side To Side ft. Nicki Minaj (Official Video) Taken from the new album Dangerous Woman Download Now! http://republicrec.co/AriDangerousWoman Listen on"),
            Pair.create("Ariana Grande - Break Free ft. Zedd", "Ariana Grande \\\"My Everything” available for download now http://smarturl.it/ArianaMyEvrythnDlxiT."),
            Pair.create("Ariana Grande - Into You", "Into You (Official Video) Taken from the new album Dangerous Woman Download Now! http://republicrec.co/AriDangerousWoman Share/Stream"),
            Pair.create("Jessie J, Ariana Grande, Nicki Minaj - Bang Bang ft. Ariana Grande, Nicki Minaj", "Get Jessie J + Ariana Grande + Nicki Minaj \\\"Bang Bang\\\" now! http://smarturl.it/JSJSweetTalkerdlxDA."),
            Pair.create("Ariana Grande - Focus", "Focus (Official Video) Download Now! http://republicrec.co/ArianaGrandeFocus Share/Stream Ariana"),
            Pair.create("Ariana Grande, The Weeknd - Love Me Harder", "description\": \"Love Me Harder available for download on the full album “My Everything” here: http://smarturl.it/ArianaMyEvrythnDlxDA Stream “Love Me Harder"),
            Pair.create("Ariana Grande - Everyday ft. Future", "Music video by Ariana Grande performing Everyday ft. Future. © 2017 Republic Records, a division of UMG Recordings, Inc."),
            Pair.create("Ariana Grande - Dangerous Woman", "Dangerous Woman Visual 1 Taken from the new album Dangerous Woman Download Now!"),
            Pair.create("Ariana Grande - Problem ft. Iggy Azalea", "Problem available for download on the full album “My Everything” here: "),
            Pair.create("Ariana Grande, The Weeknd - Love Me Harder", "Love Me Harder available for download on the full album “My Everything” here: ")
    );


    @Override
    public int getItemCount() {
        return characters.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_cell, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pair<String, String> pair = characters.get(position);
        holder.display(pair);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView description;

        private Pair<String, String> currentPair;

        public MyViewHolder(final View itemView) {
            super(itemView);

            name = ((TextView) itemView.findViewById(R.id.name));
            description = ((TextView) itemView.findViewById(R.id.description));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new AlertDialog.Builder(itemView.getContext())
                            .setTitle(currentPair.first)
                            .setMessage(currentPair.second)
                            .show();
                }
            });
        }

        public void display(Pair<String, String> pair) {
            currentPair = pair;
            name.setText(pair.first);
            description.setText(pair.second);
        }
    }

}