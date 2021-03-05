# Cloudtips SDK for Android 

Cloudtips SDK позволяет интегрировать прием чаевых в мобильные приложение для платформы Android.

### Требования
Для работы Cloudtips SDK необходим Android версии 4.4 (API level 19) или выше.

### Подключение
Для подключения SDK в build.gradle уровня проекта добавить репозитрий Jitpack:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
И в build.gradle уровня приложения доюавить зависимость:

```
dependencies {
	implementation 'com.github.cloudpayments:CloudTips-SDK-Android:1.0.2'
}
```
### Структура проекта:

* **app** - Пример реализации приложения с использованием SDK
* **sdk** - Исходный код SDK

### Использование

Создайте объект TipsData с параметрами номер телефона (в формате +7**********) и имя пользователя (если пользователя с таким номером телефона нет в системе CloudTips, то будет зарегистрирован новый пользователь с этим именем), затем передайте его в объект TipsConfiguration и запустите SDK. 

Если вы являетесь партнером CloudTips, передайте в конфигурацию id партнера.

```
val tipsData = TipsData(phone, "User name", "Partner ID")
val configuration = TipsConfiguration(tipsData)
CloudTipsSDK.getInstance().start(configuration, this)
```

### Поддержка

По возникающим вопросам техничечкого характера обращайтесь на support@cloudpayments.ru
