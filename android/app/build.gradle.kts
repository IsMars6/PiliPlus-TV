android {
    namespace = "com.example.piliplus"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    // 必加：声明 flavor 维度
    flavorDimensions += "device"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }

    defaultConfig {
        applicationId = "com.example.piliplus"
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    // ... 中间其他不变 ...

    productFlavors {
        create("tv") {
            dimension = "device"  // 这里已经写对了
            applicationIdSuffix = ".tv"
            versionNameSuffix = "-tv"
            resValue("string", "app_name", "PiliPlus TV")
        }
    }

    // ...
}
