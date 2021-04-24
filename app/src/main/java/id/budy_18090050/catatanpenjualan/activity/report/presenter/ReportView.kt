package id.budy_18090050.catatanpenjualan.activity.report.presenter

import id.budy_18090050.catatanpenjualan.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}