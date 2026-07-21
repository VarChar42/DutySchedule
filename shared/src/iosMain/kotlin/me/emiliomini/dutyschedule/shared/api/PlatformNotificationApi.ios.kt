package me.emiliomini.dutyschedule.shared.api

import me.emiliomini.dutyschedule.shared.api.models.MultiplatformNotification

class IosNotificationApi : PlatformNotificationApi {
    override fun requestPermission(): Boolean {
        // TODO: Implement using UNUserNotificationCenter.requestAuthorizationWithOptions
        return true
    }

    override fun isPermissionGranted(): Boolean {
        // TODO: Implement using UNUserNotificationCenter.getNotificationSettingsWithCompletionHandler
        return true
    }

    override fun send(notification: MultiplatformNotification) {
        // TODO: Implement
    }

    override fun dismiss(notification: MultiplatformNotification) {
        // TODO: Implement
    }

}

actual fun initializePlatformNotificationApi(): PlatformNotificationApi {
    return IosNotificationApi()
}
