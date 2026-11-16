package com.krillion.mobile;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.graphics.Color;

public class MainActivity extends Activity {
  private WebView web;
  @Override public void onCreate(Bundle saved) {
    super.onCreate(saved);
    getWindow().setStatusBarColor(Color.rgb(3, 20, 43));
    getWindow().setNavigationBarColor(Color.rgb(3, 20, 43));
    web = new WebView(this);
    web.setBackgroundColor(Color.rgb(3, 20, 43));
    WebSettings s = web.getSettings();
    s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setMediaPlaybackRequiresUserGesture(false);
    s.setSupportZoom(false); s.setBuiltInZoomControls(false); s.setDisplayZoomControls(false);
    s.setLoadWithOverviewMode(true); s.setUseWideViewPort(true);
    web.setWebViewClient(new WebViewClient()); web.setWebChromeClient(new WebChromeClient());
    web.setOverScrollMode(View.OVER_SCROLL_NEVER);
    setContentView(web);
    web.loadUrl("https://krillion.io/");
  }
  @Override public void onBackPressed() { if(web!=null && web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}