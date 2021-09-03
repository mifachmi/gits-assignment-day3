package main

import java.util.*

/* Nama Lengkap: Fachmi Dimas Ardhana
Nama Depan: Fachmi
Huruf Pertama: F */

fun main() {
    do {
        val pilihOpsi = menuHitungBilangan()
        pengecekanMenu(pilihOpsi)
        print("\nApakah ingin mencoba lagi(y/n)? ")
        val scanner = Scanner(System.`in`)
        val decision = scanner.next().single()
        print("\n")
    } while (decision == 'y' || decision == 'Y')
}

fun menuHitungBilangan(): Int {
    println("Aplikasi Implementasi For, Break, dan Continue")
    println("=====")
    println("1. Kelipatan 4")
    println("2. Cek Bilangan Prima")
    print("Pilih Menu: ")
    return readLine()?.toInt()!!
}

fun pengecekanMenu(input: Int){
    if (input == 1) {
        hitungKelipatanEmpat()
    } else if (input == 2) {
        hitungBilanganPrima()
    } else {
        println("tidak ada menu yang tersedia")
        return
    }
}

fun hitungKelipatanEmpat() {
    print("Input banyaknya bilangan: ")
    val jumlahBilangan = readLine()?.toInt()

    if (jumlahBilangan!! < 0) {
        println("Inputan harus lebih dari 0")
        return
    } else {
        print("Kelipatan 4 dari bilangan $jumlahBilangan adalah ")
        for (i in 0..jumlahBilangan) {
            if (i % 4 != 0) {
                continue
            }
            print(String.format("$i  "))
        }
        println("")
    }
}

fun hitungBilanganPrima() {
    var primeFlag = 0
    print("Input bilangan yang ingin dicek: ")
    val inputBilangan = readLine()?.toInt()
    if (inputBilangan!! <= 1) {
        println("Bilangan $inputBilangan bukan termasuk bilangan prima")
    } else {
        for (i in 2..inputBilangan/2) {
            if (inputBilangan % i == 0) {
                println("masuk if satu")
                println("Bilangan $inputBilangan bukan termasuk bilangan prima")
                primeFlag = 1
                break
            }
        }
        if (primeFlag == 0) {
            println("Bilangan $inputBilangan termasuk bilangan prima")
        }
    }
}