package com.tutu.sweepcode;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.Toast;

import com.google.zxing.Result;
import com.tutu.sweep.qrview.CommonSweepActivity;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

public class MainActivity extends CommonSweepActivity {


    private static final int RC_PERMISSION = 101;
    private static final String TAG = "MainActivity";

    @Override
    public void getPermissions() {
        String[] permissions = {Manifest.permission.CAMERA};

        ActivityCompat.requestPermissions(this, permissions, RC_PERMISSION);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == RC_PERMISSION && grantResults.length == 2
                && grantResults[0] == PackageManager.PERMISSION_GRANTED
                && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
            Log.e(TAG, "权限申请成功");
        } else {
            Log.e(TAG, "权限申请失败");
        }
    }

    @Override
    public void handleResult(Result result, Bitmap barcode) {
        Toast.makeText(this, result.getText(), Toast.LENGTH_LONG).show();
    }
}