package com.example.oka.tmpremover;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public File[] listDir(View view){ // using http://stackoverflow.com/a/8752200
        String pathToScan = "../../../..";
        String fileThatYouWantToFilter;
        String list = "";
        //File folderToScan = new File(pathToScan); // import -> import java.io.File;
        File folderToScan = new File(getExternalFilesDir(null), pathToScan);
        File[] listOfFiles = folderToScan.listFiles();
        Log.d("test", folderToScan.getAbsolutePath());
        TextView tv = (TextView)findViewById(R.id.list_tv);
        String scanning = "Scanning...";
        tv.setText(scanning);

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {
                fileThatYouWantToFilter = listOfFiles[i].getName();
//                if (fileThatYouWantToFilter.startsWith("")
                  if (fileThatYouWantToFilter.endsWith(".tmp")) {
                      list += fileThatYouWantToFilter + "\n";
                  }
            }
        }

        tv.setText(list);
        return listOfFiles;
    }


    public void removeFiles(View view){
        File[] listOfFiles = listDir(view);
        TextView tv = (TextView)findViewById(R.id.status_tv);
        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile()) {
                file.delete();
            }
        }
        String str = "deleted.";
        tv.setText(str);
    }
}
