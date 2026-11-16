# Krillion Mobile

Android wrapper for the Krillion browser game. This app opens the official game at **https://krillion.io/** inside a mobile-optimized WebView; it requires an internet connection and does not bundle or redistribute the game's proprietary assets/code.

## Build APK

Every push to `main` runs **Build Krillion APK**. You can also run it manually from **Actions → Build Krillion APK → Run workflow**. Download `Krillion-mobile-apk` from the completed run's Artifacts section.

## Local build

Requires Android SDK and Gradle 8.9+ with Java 17:

```bash
gradle assembleDebug
```

APK output: `app/build/outputs/apk/debug/app-debug.apk`.