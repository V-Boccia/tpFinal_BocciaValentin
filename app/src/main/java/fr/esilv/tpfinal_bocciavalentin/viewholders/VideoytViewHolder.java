package fr.esilv.tpfinal_bocciavalentin.viewholders;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import fr.esilv.tpfinal_bocciavalentin.R;
import fr.esilv.tpfinal_bocciavalentin.interfaces.OnVideoytSelectedListener;
import fr.esilv.tpfinal_bocciavalentin.models.Videoyt;

public class VideoytViewHolder extends RecyclerView.ViewHolder {


        private TextView title;
        private TextView description;
        private OnVideoytSelectedListener onVideoytSelectedListener;

        public VideoytViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
        }

        public void bind(final Videoyt videoyt) {
            title.setText(videoyt.getTitle());
            description.setText(videoyt.getDescription());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onVideoytSelectedListener == null) {
                        return;
                    }
                    onVideoytSelectedListener.onContractSelected(videoyt);
                }
            });
        }

        public void setOnContractSelectedListener(OnVideoytSelectedListener onVideoytSelectedListener) {
            this.onVideoytSelectedListener = onVideoytSelectedListener;
        }
    }


