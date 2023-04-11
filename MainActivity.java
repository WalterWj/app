import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取 LocationManager 实例
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        // 创建一个 Location 对象，设置经纬度
        Location location = new Location(LocationManager.GPS_PROVIDER);
        location.setLatitude(37.422);
        location.setLongitude(-122.084);

        // 发送模拟位置信息
        locationManager.setTestProviderEnabled(LocationManager.GPS_PROVIDER, true);
        locationManager.setTestProviderLocation(LocationManager.GPS_PROVIDER, location);

        // 显示提示信息
        Toast.makeText(this, "模拟位置信息已发送", Toast.LENGTH_SHORT).show();
    }
}