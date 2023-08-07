import android.os.Bundle;

import androidx.fragment.app.FragmentManager;

import com.example.han_e_eum.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map {

    public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

        private GoogleMap mMap;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.map);

            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }

        private FragmentManager getSupportFragmentManager() {
        ;
            return null;
        }


        @Override
        public void onMapReady(final GoogleMap googleMap) {
            mMap = googleMap;

            LatLng SEOUL = new LatLng(37.56, 126.97);

            MarkerOptions markerOptions = new MarkerOptions();         // 마커 생성
            markerOptions.position(SEOUL);
            markerOptions.title("서울");                         // 마커 제목
            markerOptions.snippet("한국의 수도");         // 마커 설명
            mMap.addMarker(markerOptions);

            mMap.moveCamera(CameraUpdateFactory.newLatLng(SEOUL));                 // 초기 위치
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));                         // 줌의 정도
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);                           // 지도 유형 설정

        }

    }

    private void setContentView(int map) {
    }


}
