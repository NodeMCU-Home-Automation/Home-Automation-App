package maischifano.homeautomation.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import maischifano.homeautomation.R;

public class GetHumidity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View GetHumidityView = inflater.inflate(R.layout.fragment_get_humidity, container, false);

        return GetHumidityView;
    }

}
