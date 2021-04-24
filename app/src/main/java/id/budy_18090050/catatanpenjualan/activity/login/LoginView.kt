package id.budy_18090050.catatanpenjualan.activity.login

import id.budy_18090050.catatanpenjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}