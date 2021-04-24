package id.budy_18090050.catatanpenjualan.activity.data_barang.presenter

import id.budy_18090050.catatanpenjualan.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}