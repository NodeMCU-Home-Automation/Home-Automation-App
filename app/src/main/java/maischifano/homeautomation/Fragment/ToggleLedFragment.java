package maischifano.homeautomation.Fragment;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.springframework.web.client.RestTemplate;

import maischifano.homeautomation.MainActivity;
import maischifano.homeautomation.R;

public class ToggleLedFragment extends Fragment {
    private Button changeLedState;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstance) {
        View toggleLEDView = inflater.inflate(R.layout.fragment_toggle_led, container, false);
        changeLedState = toggleLEDView.findViewById(R.id.changeLedState);

        changeLedState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ToggleLedOnEsp().execute();
            }
        });

        return toggleLEDView;
    }


    private class ToggleLedOnEsp extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            RestTemplate restTemplate = new RestTemplate();
            try {
                restTemplate.put(MainActivity.ipAdress+"automatischeAntwort", "asd", String.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}