# SweepCode Android SDK
二维码\条形码 扫描sdk

## 一、简介
* 支持扫描二维码
* 支持扫描条形码

## 二、使用
#### 1、添加依赖和配置
* Project/build.gradle文件添加如下配置：

```
repositories {
        maven { url "https://jitpack.io" }
}
```

* APP/build.gradle文件添加如下配置：

```
dependencies {
    implementation 'com.github.eastinetutu:SweepCode:1.0.0'
}
```

#### 2、使用
* 权限清单添加

```
 <uses-permission android:name="android.permission.CAMERA"/>
```

* 动态申请照相机权限设置
```
例如：
public void getPermissions() {
        String[] permissions = {Manifest.permission.CAMERA};

        ActivityCompat.requestPermissions(this, permissions, RC_PERMISSION);
    }
```

* 不修改样式
```
1.
继承CommonSweepActivity 不修改样式
2.
如需修改样式请无需继承自己完成样式
```

#### 3、 作者
* 吴超   邮箱：519510228@qq.com


