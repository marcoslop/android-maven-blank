Android Maven Blank
=============

A blank android project that has maven support with some frecuently used dependencies in android:

* [ActionBarSherlock](http://actionbarsherlock.com/)
* [Google maps Android API v2](https://developers.google.com/maps/documentation/android/)
* [Google Analytics](https://developers.google.com/analytics/devguides/collection/android/)
* [RoboGuice (Dependency Injection)](https://github.com/roboguice/roboguice)
* [RoboElectric (Testing)](http://pivotal.github.io/robolectric/)
* [Facebok SDK](https://developers.facebook.com/android/)

Prerequisites
-------------

### Option 1: Use my repository

By default, the pom.xml has a repository configured, that is pointing to a public dropbox directory where I have uploaded all the dependencies needed in this pom.xml

You don�t need to do anything to use this option. Just understand that maybe some day this directory won�t exist.

### Option 2: Generate all the dependencies

Delete my repository from the pom.xml and follow the same steps that I did to generate the dependencies in my local repository.

Go to this link and follow the steps: [maven-android-sdk-deployer](https://github.com/mosabua/maven-android-sdk-deployer)

Delete unused dependencies
--------------------------

If you are not going to use all the dependencies listed above, delete them from the pom.xml

Generate APK with maven
--------------------------

If you want to generate the apk you just have to execute:

    mvn clean package

If you want to generate the final apk to be uploaded to the Play Store you will have to configure the following properties in pom.xml

    <keystore.location>keystore_MODIFYME</keystore.location>
    <keystore.storepass>storepass_MODIFYME</keystore.storepass>
    <keystore.keypass>keypass_MODIFYME</keystore.keypass>
    <keystore.alias>alias_MODIFYME</keystore.alias>

and execute:

    mvn clean package -Psign