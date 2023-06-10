package com.currencyApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btncontext: Button
    lateinit var alıs: TextView
    lateinit var satıs: TextView
    lateinit var bankaAlıs: TextView
    lateinit var bankasatıs: TextView
    private val xml = XmlResult()
    lateinit var days: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val xml = XmlResult()


        days = findViewById(R.id.days)
        btncontext = findViewById(R.id.btnContext)

        registerForContextMenu(btncontext)

        alıs = findViewById(R.id.alısgösterview)
        satıs = findViewById(R.id.satısgösterview)
        bankaAlıs = findViewById(R.id.bankaalısgosterview)
        bankasatıs = findViewById(R.id.bankasatısgösterview)


        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)


        val date = xml.xmlDate()
        days.setText(date)



    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.main_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val arr = xml.xmlCurrency()
        for( x in arr )
            if (arr.isNotEmpty()){
                when(item.itemId){
                    R.id.abd ->{ alıs.setText(arr[0].ForexBuying)
                        satıs.setText(arr[0].ForexSelling)
                        bankaAlıs.setText(arr[0].BanknoteBuying)
                        bankasatıs.setText(arr[0].BanknoteSelling)}
                    R.id.avusturya ->{ alıs.setText(arr[1].ForexBuying)
                        satıs.setText(arr[1].ForexSelling)
                        bankaAlıs.setText(arr[1].BanknoteBuying)
                        bankasatıs.setText(arr[1].BanknoteSelling)}
                    R.id.danimarka ->{ alıs.setText(arr[2].ForexBuying)
                        satıs.setText(arr[2].ForexSelling)
                        bankaAlıs.setText(arr[2].BanknoteBuying)
                        bankasatıs.setText(arr[2].BanknoteSelling)}
                    R.id.euro ->{ alıs.setText(arr[3].ForexBuying)
                        satıs.setText(arr[3].ForexSelling)
                        bankaAlıs.setText(arr[3].BanknoteBuying)
                        bankasatıs.setText(arr[3].BanknoteSelling)}
                    R.id.ingiliz ->{ alıs.setText(arr[4].ForexBuying)
                        satıs.setText(arr[4].ForexSelling)
                        bankaAlıs.setText(arr[4].BanknoteBuying)
                        bankasatıs.setText(arr[4].BanknoteSelling)}
                    R.id.isviçre ->{ alıs.setText(arr[5].ForexBuying)
                        satıs.setText(arr[5].ForexSelling)
                        bankaAlıs.setText(arr[5].BanknoteBuying)
                        bankasatıs.setText(arr[5].BanknoteSelling)}
                    R.id.isveç ->{ alıs.setText(arr[6].ForexBuying)
                        satıs.setText(arr[6].ForexSelling)
                        bankaAlıs.setText(arr[6].BanknoteBuying)
                        bankasatıs.setText(arr[6].BanknoteSelling)}
                    R.id.kanada ->{ alıs.setText(arr[7].ForexBuying)
                        satıs.setText(arr[7].ForexSelling)
                        bankaAlıs.setText(arr[7].BanknoteBuying)
                        bankaAlıs.setText(arr[7].BanknoteSelling)}
                    R.id.kuveyt ->{ alıs.setText(arr[8].ForexBuying)
                        satıs.setText(arr[8].ForexSelling)
                        bankaAlıs.setText(arr[8].BanknoteBuying)
                        bankasatıs.setText(arr[8].BanknoteSelling)}
                    R.id.norveç ->{ alıs.setText(arr[9].ForexBuying)
                        satıs.setText(arr[9].ForexSelling)
                        bankaAlıs.setText(arr[9].BanknoteBuying)
                        bankasatıs.setText(arr[9].BanknoteSelling)}
                }

            }
        return super.onContextItemSelected(item)
    }









}